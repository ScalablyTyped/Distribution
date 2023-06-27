package typings.sentryTypes

import typings.sentryTypes.sentryTypesStrings.finishTransaction
import typings.sentryTypes.sentryTypesStrings.startTransaction
import typings.sentryTypes.typesCheckinMod.CheckIn
import typings.sentryTypes.typesCheckinMod.MonitorConfig
import typings.sentryTypes.typesClientreportMod.EventDropReason
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesIntegrationMod.IntegrationClass
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesScopeMod.Scope
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSessionMod.SessionAggregates
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientMod {
  
  @js.native
  trait Client[O /* <: ClientOptions[BaseTransportOptions] */] extends StObject {
    
    /**
      * Add an integration to the client.
      * This can be used to e.g. lazy load integrations.
      * In most cases, this should not be necessary, and you're better off just passing the integrations via `integrations: []` at initialization time.
      * However, if you find the need to conditionally load & add an integration, you can use `addIntegration` to do so.
      *
      * TODO (v8): Make this a required method.
      * */
    var addIntegration: js.UndefOr[js.Function1[/* integration */ Integration, Unit]] = js.native
    
    /**
      * Create a cron monitor check in and send it to Sentry. This method is not available on all clients.
      *
      * @param checkIn An object that describes a check in.
      * @param upsertMonitorConfig An optional object that describes a monitor config. Use this if you want
      * to create a monitor automatically when sending a check in.
      * @returns A string representing the id of the check in.
      */
    var captureCheckIn: js.UndefOr[
        js.Function2[/* checkIn */ CheckIn, /* monitorConfig */ js.UndefOr[MonitorConfig], String]
      ] = js.native
    
    /**
      * Captures a manually created event and sends it to Sentry.
      *
      * @param event The event to send to Sentry.
      * @param hint May contain additional information about the original exception.
      * @param scope An optional scope containing event metadata.
      * @returns The event id
      */
    def captureEvent(event: Event): js.UndefOr[String] = js.native
    def captureEvent(event: Event, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
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
    def captureException(exception: Any): js.UndefOr[String] = js.native
    def captureException(exception: Any, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureException(exception: Any, hint: EventHint): js.UndefOr[String] = js.native
    def captureException(exception: Any, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
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
    def captureMessage(message: String, level: Unit, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Unit, hint: EventHint): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Unit, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: SeverityLevel): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: SeverityLevel, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: SeverityLevel, hint: EventHint): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: SeverityLevel, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: EventHint): js.UndefOr[String] = js.native
    def captureMessage(message: String, level: Severity, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    /**
      * Captures a session
      *
      * @param session Session to be delivered
      */
    var captureSession: js.UndefOr[js.Function1[/* session */ Session, Unit]] = js.native
    
    /**
      * Flush the event queue and set the client to `enabled = false`. See {@link Client.flush}.
      *
      * @param timeout Maximum time in ms the client should wait before shutting down. Omitting this parameter will cause
      *   the client to wait until all events are sent before disabling itself.
      * @returns A promise which resolves to `true` if the flush completes successfully before the timeout, or `false` if
      * it doesn't.
      */
    def close(): PromiseLike[Boolean] = js.native
    def close(timeout: Double): PromiseLike[Boolean] = js.native
    
    /**
      * Fire a hook event for transaction start and finish. Expects to be given a transaction as the
      * second argument.
      */
    /**
      * Fire a hook for when a breadcrumb is added. Expects the breadcrumb as second argument.
      */
    /**
      * Fire a hook for when a DSC (Dynamic Sampling Context) is created. Expects the DSC as second argument.
      */
    var emit: js.UndefOr[
        js.Function2[/* hook */ startTransaction | finishTransaction, /* transaction */ Transaction, Unit]
      ] = js.native
    
    /** Creates an {@link Event} from all inputs to `captureException` and non-primitive inputs to `captureMessage`. */
    def eventFromException(exception: Any): PromiseLike[Event] = js.native
    def eventFromException(exception: Any, hint: EventHint): PromiseLike[Event] = js.native
    
    /** Creates an {@link Event} from primitive inputs to `captureMessage`. */
    def eventFromMessage(message: String): PromiseLike[Event] = js.native
    def eventFromMessage(message: String, level: Unit, hint: EventHint): PromiseLike[Event] = js.native
    def eventFromMessage(message: String, level: Severity): PromiseLike[Event] = js.native
    def eventFromMessage(message: String, level: SeverityLevel): PromiseLike[Event] = js.native
    def eventFromMessage(message: String, level: SeverityLevel, hint: EventHint): PromiseLike[Event] = js.native
    def eventFromMessage(message: String, level: Severity, hint: EventHint): PromiseLike[Event] = js.native
    
    /**
      * Wait for all events to be sent or the timeout to expire, whichever comes first.
      *
      * @param timeout Maximum time in ms the client should wait for events to be flushed. Omitting this parameter will
      *   cause the client to wait until all events are sent before resolving the promise.
      * @returns A promise that will resolve with `true` if all events are sent before the timeout, or `false` if there are
      * still events in the queue when the timeout is reached.
      */
    def flush(): PromiseLike[Boolean] = js.native
    def flush(timeout: Double): PromiseLike[Boolean] = js.native
    
    /** Returns the current Dsn. */
    def getDsn(): js.UndefOr[DsnComponents] = js.native
    
    /** Returns the client's instance of the given integration class, it any. */
    def getIntegration[T /* <: Integration */](integration: IntegrationClass[T]): T | Null = js.native
    
    /** Returns the current options. */
    def getOptions(): O = js.native
    
    /**
      * @inheritdoc
      *
      * TODO (v8): Make this a required method.
      */
    var getSdkMetadata: js.UndefOr[js.Function0[js.UndefOr[SdkMetadata]]] = js.native
    
    /**
      * Returns the transport that is used by the client.
      * Please note that the transport gets lazy initialized so it will only be there once the first event has been sent.
      *
      * @returns The transport.
      */
    def getTransport(): js.UndefOr[Transport] = js.native
    
    /**
      * Register a callback for transaction start and finish.
      */
    /**
      * Register a callback for when an event has been sent.
      */
    /**
      * Register a callback before a breadcrumb is added.
      */
    /**
      * Register a callback whena  DSC (Dynamic Sampling Context) is created.
      */
    var on: js.UndefOr[
        js.Function2[
          /* hook */ startTransaction | finishTransaction, 
          /* callback */ js.Function1[/* transaction */ Transaction, Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Record on the client that an event got dropped (ie, an event that will not be sent to sentry).
      *
      * @param reason The reason why the event got dropped.
      * @param category The data category of the dropped event.
      * @param event The dropped event.
      */
    def recordDroppedEvent(reason: EventDropReason, dataCategory: DataCategory): Unit = js.native
    def recordDroppedEvent(reason: EventDropReason, dataCategory: DataCategory, event: Event): Unit = js.native
    
    /** Submits the event to Sentry */
    def sendEvent(event: Event): Unit = js.native
    def sendEvent(event: Event, hint: EventHint): Unit = js.native
    
    /** Submits the session to Sentry */
    def sendSession(session: Session): Unit = js.native
    def sendSession(session: SessionAggregates): Unit = js.native
    
    /** This is an internal function to setup all integrations that should run on the client */
    def setupIntegrations(): Unit = js.native
  }
}
