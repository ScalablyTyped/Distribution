package typings.socketIoClient

import typings.socketIoClient.anon.PartialManagerOptionsSock
import typings.socketIoClient.buildEsmSocketMod.Socket
import typings.socketIoComponentEmitter.mod.DefaultEventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmBrowserEntrypointMod {
  
  @JSImport("socket.io-client/build/esm/browser-entrypoint", JSImport.Namespace)
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
  inline def default(): Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(opts: PartialManagerOptionsSock): Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: String): Socket[DefaultEventsMap, DefaultEventsMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: String, opts: PartialManagerOptionsSock): Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Socket[DefaultEventsMap, DefaultEventsMap]]
  inline def default(uri: PartialManagerOptionsSock, opts: PartialManagerOptionsSock): Socket[DefaultEventsMap, DefaultEventsMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Socket[DefaultEventsMap, DefaultEventsMap]]
}
