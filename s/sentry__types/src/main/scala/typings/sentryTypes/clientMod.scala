package typings.sentryTypes

import typings.sentryTypes.clientreportMod.EventDropReason
import typings.sentryTypes.datacategoryMod.DataCategory
import typings.sentryTypes.dsnMod.DsnComponents
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.integrationMod.Integration
import typings.sentryTypes.integrationMod.IntegrationClass
import typings.sentryTypes.optionsMod.ClientOptions
import typings.sentryTypes.scopeMod.Scope
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.sessionMod.SessionAggregates
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.severityMod.SeverityLevel
import typings.sentryTypes.transportMod.BaseTransportOptions
import typings.sentryTypes.transportMod.Transport
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @js.native
  trait Client[O /* <: ClientOptions[BaseTransportOptions] */] extends StObject {
    
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
      * Returns the transport that is used by the client.
      * Please note that the transport gets lazy initialized so it will only be there once the first event has been sent.
      *
      * @returns The transport.
      */
    def getTransport(): js.UndefOr[Transport] = js.native
    
    /**
      * Record on the client that an event got dropped (ie, an event that will not be sent to sentry).
      *
      * @param reason The reason why the event got dropped.
      * @param category The data category of the dropped event.
      */
    def recordDroppedEvent(reason: EventDropReason, category: DataCategory): Unit = js.native
    
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
