package typings.puppeteerBrowsers

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsHttpUtilMod {
  
  @JSImport("@puppeteer/browsers/lib/cjs/httpUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadFile(url: URL_, destinationPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(url.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def downloadFile(
    url: URL_,
    destinationPath: String,
    progressCallback: js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(url.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getJSON(url: URL_): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSON")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getText(url: URL_): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def headHttpRequest(url: URL_): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("headHttpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def httpRequest(url: URL_, method: String, response: js.Function1[/* x */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  inline def httpRequest(
    url: URL_,
    method: String,
    response: js.Function1[/* x */ IncomingMessage, Unit],
    keepAlive: Boolean
  ): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], response.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
}
