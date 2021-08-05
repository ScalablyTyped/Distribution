package typings.sentryCore

import org.scalablytyped.runtime.Instantiable1
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basebackendMod {
  
  @JSImport("@sentry/core/dist/basebackend", "BaseBackend")
  @js.native
  abstract class BaseBackend[O /* <: Options */] protected ()
    extends StObject
       with Backend {
    /** Creates a new backend instance. */
    def this(options: O) = this()
    
    /** Options passed to the SDK. */
    /* protected */ val _options: O = js.native
    
    /**
      * Sets up the transport so it can be used later to send requests.
      */
    /* protected */ def _setupTransport(): Transport = js.native
    
    /** Cached transport used internally. */
    /* protected */ var _transport: Transport = js.native
  }
  
  @js.native
  trait Backend extends StObject {
    
    /** Creates a {@link Event} from an exception. */
    def eventFromException(exception: js.Any): js.Thenable[Event] = js.native
    def eventFromException(exception: js.Any, hint: EventHint): js.Thenable[Event] = js.native
    
    /** Creates a {@link Event} from a plain message. */
    def eventFromMessage(message: String): js.Thenable[Event] = js.native
    def eventFromMessage(message: String, level: Unit, hint: EventHint): js.Thenable[Event] = js.native
    def eventFromMessage(message: String, level: Severity): js.Thenable[Event] = js.native
    def eventFromMessage(message: String, level: Severity, hint: EventHint): js.Thenable[Event] = js.native
    
    /**
      * Returns the transport that is used by the backend.
      * Please note that the transport gets lazy initialized so it will only be there once the first event has been sent.
      *
      * @returns The transport.
      */
    def getTransport(): Transport = js.native
    
    /** Submits the event to Sentry */
    def sendEvent(event: Event): Unit = js.native
    
    /** Submits the session to Sentry */
    def sendSession(session: Session): Unit = js.native
  }
  
  type BackendClass[B /* <: Backend */, O /* <: Options */] = Instantiable1[/* options */ O, B]
}
