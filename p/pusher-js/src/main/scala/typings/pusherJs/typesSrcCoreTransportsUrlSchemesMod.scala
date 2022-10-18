package typings.pusherJs

import typings.pusherJs.typesSrcCoreTransportsUrlSchemeMod.URLScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsUrlSchemesMod {
  
  @JSImport("pusher-js/types/src/core/transports/url_schemes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pusher-js/types/src/core/transports/url_schemes", "http")
  @js.native
  def http: URLScheme = js.native
  inline def http_=(x: URLScheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("http")(x.asInstanceOf[js.Any])
  
  @JSImport("pusher-js/types/src/core/transports/url_schemes", "sockjs")
  @js.native
  def sockjs: URLScheme = js.native
  inline def sockjs_=(x: URLScheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sockjs")(x.asInstanceOf[js.Any])
  
  @JSImport("pusher-js/types/src/core/transports/url_schemes", "ws")
  @js.native
  def ws: URLScheme = js.native
  inline def ws_=(x: URLScheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ws")(x.asInstanceOf[js.Any])
}
