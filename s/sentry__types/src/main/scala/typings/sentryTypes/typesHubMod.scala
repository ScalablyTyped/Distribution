package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesBreadcrumbMod.BreadcrumbHint
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesExtraMod.Extra
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesIntegrationMod.IntegrationClass
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesScopeMod.Scope
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHubMod {
  
  @js.native
  trait Hub extends StObject {
    
    /**
      * Records a new breadcrumb which will be attached to future events.
      *
      * Breadcrumbs will be added to subsequent events to provide more context on
      * user's actions prior to an error or crash.
      *
      * @param breadcrumb The breadcrumb to record.
      * @param hint May contain additional information about the original breadcrumb.
      */
    def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
    def addBreadcrumb(breadcrumb: Breadcrumb, hint: BreadcrumbHint): Unit = js.native
    
    /**
      * This binds the given client to the current scope.
      * @param client An SDK client (client) instance.
      */
    def bindClient(): Unit = js.native
    def bindClient(client: Client[ClientOptions[BaseTransportOptions]]): Unit = js.native
    
    /**
      * Captures a manually created event and sends it to Sentry.
      *
      * @param event The event to send to Sentry.
      * @param hint May contain additional information about the original exception.
      */
    def captureEvent(event: Event): String = js.native
    def captureEvent(event: Event, hint: EventHint): String = js.native
    
    /**
      * Captures an exception event and sends it to Sentry.
      *
      * @param exception An exception-like object.
      * @param hint May contain additional information about the original exception.
      * @returns The generated eventId.
      */
    def captureException(exception: Any): String = js.native
    def captureException(exception: Any, hint: EventHint): String = js.native
    
    /**
      * Captures a message event and sends it to Sentry.
      *
      * @param message The message to send to Sentry.
      * @param level Define the level of the message.
      * @param hint May contain additional information about the original exception.
      * @returns The generated eventId.
      */
    def captureMessage(message: String): String = js.native
    def captureMessage(message: String, level: Unit, hint: EventHint): String = js.native
    def captureMessage(message: String, level: Severity): String = js.native
    def captureMessage(message: String, level: SeverityLevel): String = js.native
    def captureMessage(message: String, level: SeverityLevel, hint: EventHint): String = js.native
    def captureMessage(message: String, level: Severity, hint: EventHint): String = js.native
    
    /**
      * Sends the current session on the scope to Sentry
      * @param endSession If set the session will be marked as exited and removed from the scope
      */
    def captureSession(): Unit = js.native
    def captureSession(endSession: Boolean): Unit = js.native
    
    /**
      * Callback to set context information onto the scope.
      *
      * @param callback Callback function that receives Scope.
      */
    def configureScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = js.native
    
    /**
      * Ends the session that lives on the current scope and sends it to Sentry
      */
    def endSession(): Unit = js.native
    
    /** Returns the client of the top stack. */
    def getClient(): js.UndefOr[Client[ClientOptions[BaseTransportOptions]]] = js.native
    
    /** Returns the integration if installed on the current client. */
    def getIntegration[T /* <: Integration */](integration: IntegrationClass[T]): T | Null = js.native
    
    /**
      * Checks if this hub's version is older than the given version.
      *
      * @param version A version number to compare to.
      * @return True if the given version is newer; otherwise false.
      *
      * @hidden
      */
    def isOlderThan(version: Double): Boolean = js.native
    
    /**
      * This is the getter for lastEventId.
      *
      * @returns The last event id of a captured event.
      */
    def lastEventId(): js.UndefOr[String] = js.native
    
    /**
      * Removes a previously pushed scope from the stack.
      *
      * This restores the state before the scope was pushed. All breadcrumbs and
      * context information added since the last call to {@link this.pushScope} are
      * discarded.
      */
    def popScope(): Boolean = js.native
    
    /**
      * Create a new scope to store context information.
      *
      * The scope will be layered on top of the current one. It is isolated, i.e. all
      * breadcrumbs and context information added to this scope will be removed once
      * the scope ends. Be sure to always remove this scope with {@link this.popScope}
      * when the operation finishes or throws.
      *
      * @returns Scope, the new cloned scope
      */
    def pushScope(): Scope = js.native
    
    /**
      * For the duration of the callback, this hub will be set as the global current Hub.
      * This function is useful if you want to run your own client and hook into an already initialized one
      * e.g.: Reporting issues to your own sentry when running in your component while still using the users configuration.
      */
    def run(callback: js.Function1[/* hub */ this.type, Unit]): Unit = js.native
    
    /**
      * Sets context data with the given name.
      * @param name of the context
      * @param context Any kind of data. This data will be normalized.
      */
    def setContext(name: String): Unit = js.native
    def setContext(name: String, context: StringDictionary[Any]): Unit = js.native
    
    /**
      * Set key:value that will be sent as extra data with the event.
      * @param key String of extra
      * @param extra Any kind of data. This data will be normalized.
      */
    def setExtra(key: String, extra: Extra): Unit = js.native
    
    /**
      * Set an object that will be merged sent as extra data with the event.
      * @param extras Extras object to merge into current context.
      */
    def setExtras(extras: Extras): Unit = js.native
    
    /**
      * Set key:value that will be sent as tags data with the event.
      *
      * Can also be used to unset a tag, by passing `undefined`.
      *
      * @param key String key of tag
      * @param value Value of tag
      */
    def setTag(key: String, value: Primitive): Unit = js.native
    
    /**
      * Set an object that will be merged sent as tags data with the event.
      *
      * @param tags Tags context object to merge into current context.
      */
    def setTags(tags: StringDictionary[Primitive]): Unit = js.native
    
    /**
      * Updates user context information for future events.
      *
      * @param user User context object to be set in the current context. Pass `null` to unset the user.
      */
    def setUser(): Unit = js.native
    def setUser(user: User): Unit = js.native
    
    /**
      * Starts a new `Session`, sets on the current scope and returns it.
      *
      * To finish a `session`, it has to be passed directly to `client.captureSession`, which is done automatically
      * when using `hub.endSession()` for the session currently stored on the scope.
      *
      * When there's already an existing session on the scope, it'll be automatically ended.
      *
      * @param context Optional properties of the new `Session`.
      *
      * @returns The session which was just started
      */
    def startSession(): Session = js.native
    def startSession(context: Session): Session = js.native
    
    /**
      * Starts a new `Transaction` and returns it. This is the entry point to manual tracing instrumentation.
      *
      * A tree structure can be built by adding child spans to the transaction, and child spans to other spans. To start a
      * new child span within the transaction or any span, call the respective `.startChild()` method.
      *
      * Every child span must be finished before the transaction is finished, otherwise the unfinished spans are discarded.
      *
      * The transaction must be finished with a call to its `.finish()` method, at which point the transaction with all its
      * finished child spans will be sent to Sentry.
      *
      * @param context Properties of the new `Transaction`.
      * @param customSamplingContext Information given to the transaction sampling function (along with context-dependent
      * default values). See {@link Options.tracesSampler}.
      *
      * @returns The transaction which was just started
      */
    def startTransaction(context: TransactionContext): Transaction = js.native
    def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
    
    /** Returns all trace headers that are currently on the top scope. */
    def traceHeaders(): StringDictionary[String] = js.native
    
    /**
      * Creates a new scope with and executes the given operation within.
      * The scope is automatically removed once the operation
      * finishes or throws.
      *
      * This is essentially a convenience function for:
      *
      *     pushScope();
      *     callback();
      *     popScope();
      *
      * @param callback that will be enclosed into push/popScope.
      */
    def withScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = js.native
  }
}
