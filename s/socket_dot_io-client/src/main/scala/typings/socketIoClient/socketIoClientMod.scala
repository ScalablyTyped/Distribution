package typings.socketIoClient

import typings.socketIoClient.anon.PartialManagerOptions
import typings.socketIoClient.anon.PartialManagerOptionsSock
import typings.socketIoClient.anon.PartialSocketOptions
import typings.socketIoComponentEmitter.mod.DefaultEventsMap
import typings.socketIoComponentEmitter.mod.EventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object socketIoClientMod {
  
  @JSImport("socket/io-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socket/io-client", "Manager")
  @js.native
  open class Manager[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] ()
    extends typings.socketIoClient.mod.Manager[ListenEvents, EmitEvents] {
    /**
      * `Manager` constructor.
      *
      * @param uri - engine instance or engine uri/opts
      * @param opts - options
      * @public
      */
    def this(opts: PartialManagerOptions) = this()
    def this(uri: String) = this()
    def this(uri: String, opts: PartialManagerOptions) = this()
    def this(uri: Unit, opts: PartialManagerOptions) = this()
    def this(uri: PartialManagerOptions, opts: PartialManagerOptions) = this()
  }
  
  @JSImport("socket/io-client", "Socket")
  @js.native
  open class Socket[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] protected ()
    extends typings.socketIoClient.mod.Socket[ListenEvents, EmitEvents] {
    /**
      * `Socket` constructor.
      */
    def this(
      io: typings.socketIoClient.buildEsmManagerMod.Manager[DefaultEventsMap, DefaultEventsMap],
      nsp: String
    ) = this()
    def this(
      io: typings.socketIoClient.buildEsmManagerMod.Manager[DefaultEventsMap, DefaultEventsMap],
      nsp: String,
      opts: PartialSocketOptions
    ) = this()
  }
  
  /**
    * Looks up an existing `Manager` for multiplexing.
    * If the user summons:
    *
    *   `io('http://localhost/a');`
    *   `io('http://localhost/b');`
    *
    * We reuse the existing instance based on same scheme/port/host,
    * and we initialize sockets for each namespace.
    *
    * @public
    */
  inline def connect(): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: String): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: String, opts: PartialManagerOptionsSock): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: PartialManagerOptionsSock): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
  /**
    * Looks up an existing `Manager` for multiplexing.
    * If the user summons:
    *
    *   `io('http://localhost/a');`
    *   `io('http://localhost/b');`
    *
    * We reuse the existing instance based on same scheme/port/host,
    * and we initialize sockets for each namespace.
    *
    * @public
    */
  inline def io(): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")().asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: String): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: String, opts: PartialManagerOptionsSock): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: PartialManagerOptionsSock): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.buildEsmSocketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
  @JSImport("socket/io-client", "protocol")
  @js.native
  val protocol: Double = js.native
}
