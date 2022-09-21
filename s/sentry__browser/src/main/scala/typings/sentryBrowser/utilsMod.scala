package typings.sentryBrowser

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@sentry/browser/types/transports/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNativeFetchImplementation(): FetchImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeFetchImplementation")().asInstanceOf[FetchImpl]
  
  inline def sendReport(url: String, body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendReport")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendReport(url: String, body: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendReport")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait FetchImpl extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
}
