package typings.socketIoClient

import typings.socketIoClient.anon.PartialManagerOptions
import typings.socketIoClient.anon.PartialManagerOptionsSock
import typings.socketIoClient.anon.PartialSocketOptions
import typings.socketIoComponentEmitter.mod.DefaultEventsMap
import typings.socketIoComponentEmitter.mod.EventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def default(): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: String): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: String, opts: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
  @JSImport("socket.io-client", "Manager")
  @js.native
  open class Manager[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] ()
    extends typings.socketIoClient.managerMod.Manager[ListenEvents, EmitEvents] {
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
  
  @JSImport("socket.io-client", "Socket")
  @js.native
  open class Socket[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] protected ()
    extends typings.socketIoClient.socketMod.Socket[ListenEvents, EmitEvents] {
    /**
      * `Socket` constructor.
      *
      * @public
      */
    def this(io: typings.socketIoClient.managerMod.Manager[DefaultEventsMap, DefaultEventsMap], nsp: String) = this()
    def this(
      io: typings.socketIoClient.managerMod.Manager[DefaultEventsMap, DefaultEventsMap],
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
  inline def connect(): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: String): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: String, opts: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def connect(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
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
  inline def io(): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")().asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: String): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: String, opts: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def io(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("io")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.socketIoClient.socketMod.Socket[DefaultEventsMap, DefaultEventsMap]]
  
  @JSImport("socket.io-client", "protocol")
  @js.native
  val protocol: Double = js.native
}
