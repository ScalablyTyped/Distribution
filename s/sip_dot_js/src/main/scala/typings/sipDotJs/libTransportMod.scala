package typings.sipDotJs

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libCoreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Transport", JSImport.Namespace)
@js.native
object libTransportMod extends js.Object {
  @js.native
  abstract class Transport protected ()
    extends EventEmitter
       with typings.sipDotJs.libCoreTransportMod.Transport {
    /**
      * Constructor
      * @param logger - Logger.
      * @param options - Options bucket. Deprecated.
      */
    def this(logger: Logger) = this()
    def this(logger: Logger, options: js.Any) = this()
    var logger: Logger = js.native
    /**
      * The transport protocol.
      *
      * @remarks
      * Formatted as defined for the Via header sent-protocol transport.
      * https://tools.ietf.org/html/rfc3261#section-20.42
      */
    /* CompleteClass */
    override val protocol: String = js.native
    /**
      * FIXME: This needs to be reworked.
      * Some transport configuration which is controlling core behavior.
      * @internal
      */
    var server: js.UndefOr[Anon_Scheme] = js.native
    def afterConnected(callback: js.Function0[Unit]): Unit = js.native
    /**
      * Returns the promise designated by the child layer then emits a connected event.
      * Automatically emits an event upon resolution, unless overrideEvent is set. If you
      * override the event in this fashion, you should emit it in your implementation of connectPromise
      * @param options - Options bucket.
      */
    def connect(): js.Promise[Unit] = js.native
    def connect(options: js.Any): js.Promise[Unit] = js.native
    /**
      * Called by connect, must return a promise
      * promise must resolve to an object. object supports 1 parameter: overrideEvent - Boolean
      * @param options - Options bucket.
      */
    /* protected */ def connectPromise(options: js.Any): js.Promise[_] = js.native
    /**
      * Returns the promise designated by the child layer then emits a
      * disconnected event. Automatically emits an event upon resolution,
      * unless overrideEvent is set. If you override the event in this fashion,
      * you should emit it in your implementation of disconnectPromise
      * @param options - Options bucket
      */
    def disconnect(): js.Promise[Unit] = js.native
    def disconnect(options: js.Any): js.Promise[Unit] = js.native
    /**
      * Called by disconnect, must return a promise
      * promise must resolve to an object. object supports 1 parameter: overrideEvent - Boolean
      * @param options - Options bucket.
      */
    /* protected */ def disconnectPromise(options: js.Any): js.Promise[_] = js.native
    /**
      * Returns true if the transport is connected
      */
    def isConnected(): Boolean = js.native
    /**
      * To be called when a message is received
      * @param e - Event
      */
    /* protected */ def onMessage(e: js.Any): Unit = js.native
    /**
      * Send a message.
      *
      * @remarks
      * Resolves once message is sent. Otherwise rejects with an Error.
      *
      * @param message - Message to send.
      */
    /* CompleteClass */
    override def send(message: String): js.Promise[Unit] = js.native
    def send(message: String, options: js.Any): js.Promise[Unit] = js.native
    /**
      * Called by send.
      * @param message - Message.
      * @param options - Options bucket.
      */
    /* protected */ def sendPromise(message: String): js.Promise[Anon_Msg] = js.native
    /* protected */ def sendPromise(message: String, options: js.Any): js.Promise[Anon_Msg] = js.native
    /**
      * Returns a promise which resolves once the UA is connected. DEPRECATION WARNING: just use afterConnected()
      */
    def waitForConnected(): js.Promise[Unit] = js.native
  }
  
}

