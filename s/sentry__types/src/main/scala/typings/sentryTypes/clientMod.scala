package typings.sentryTypes

import typings.sentryTypes.dsnMod.Dsn
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.integrationMod.Integration
import typings.sentryTypes.integrationMod.IntegrationClass
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.scopeMod.Scope
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.severityMod.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types/dist/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  
  @js.native
  trait Client[O /* <: Options */] extends js.Object {
    
    /**
      * Captures a manually created event and sends it to Sentry.
      *
      * @param event The event to send to Sentry.
      * @param hint May contain additional information about the original exception.
      * @param scope An optional scope containing event metadata.
      * @returns The event id
      */
    def captureEvent(event: Event): js.UndefOr[String] = js.native
    def captureEvent(event: Event, hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureEvent(event: Event, hint: EventHint): js.UndefOr[String] = js.native
    def captureEvent(event: Event, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    /**
      * Captures an exception event and sends it to Sentry.
      *
      * @param exception An exception-like object.
      * @param hint May contain additional information about the original exception.
      * @param scope An optional scope containing event metadata.
      * @returns The event id
      */
    def captureException(exception: js.Any): js.UndefOr[String] = js.native
    def captureException(exception: js.Any, hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureException(exception: js.Any, hint: EventHint): js.UndefOr[String] = js.native
    def captureException(exception: js.Any, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    /**
      * Captures a message event and sends it to Sentry.
      *
      * @param message The message to send to Sentry.
      * @param level Define the level of the message.
      * @param hint May contain additional information about the original exception.
      * @param scope An optional scope containing event metadata.
      * @returns The event id
      */
    def captureMessage(message: String): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: js.UndefOr[scala.Nothing], hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: js.UndefOr[scala.Nothing], hint: EventHint): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: js.UndefOr[scala.Nothing], hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: js.UndefOr[scala.Nothing], scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: EventHint): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    /** Captures a session
      *
      * @param session Session to be delivered
      */
    var captureSession: js.UndefOr[js.Function1[/* session */ Session, Unit]] = js.native
    
    /**
      * A promise that resolves when all current events have been sent.
      * If you provide a timeout and the queue takes longer to drain the promise returns false.
      *
      * @param timeout Maximum time in ms the client should wait.
      */
    def close(): js.Thenable[Boolean] = js.native
    def close(timeout: Double): js.Thenable[Boolean] = js.native
    
    /**
      * A promise that resolves when all current events have been sent.
      * If you provide a timeout and the queue takes longer to drain the promise returns false.
      *
      * @param timeout Maximum time in ms the client should wait.
      */
    def flush(): js.Thenable[Boolean] = js.native
    def flush(timeout: Double): js.Thenable[Boolean] = js.native
    
    /** Returns the current Dsn. */
    def getDsn(): js.UndefOr[Dsn] = js.native
    
    /** Returns an array of installed integrations on the client. */
    def getIntegration[T /* <: Integration */](integration: IntegrationClass[T]): T | Null = js.native
    
    /** Returns the current options. */
    def getOptions(): O = js.native
    
    /** This is an internal function to setup all integrations that should run on the client */
    def setupIntegrations(): Unit = js.native
  }
}
