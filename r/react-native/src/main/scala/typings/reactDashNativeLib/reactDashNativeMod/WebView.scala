package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "WebView")
@js.native
class WebView ()
  extends reactLib.reactMod.Component[WebViewProps, js.Object, js.Any] {
  /**
    * Returns the native webview node.
    */
  def getWebViewHandle(): js.Any = js.native
  /**
    * Go back one page in the webview's history.
    */
  def goBack(): scala.Unit = js.native
  /**
    * Go forward one page in the webview's history.
    */
  def goForward(): scala.Unit = js.native
  /**
    * Inject JavaScript to be executed immediately.
    */
  def injectJavaScript(script: java.lang.String): scala.Unit = js.native
  /**
    * Post a message to the WebView in the form of a string.
    */
  def postMessage(message: java.lang.String): scala.Unit = js.native
  /**
    * Reloads the current page.
    */
  def reload(): scala.Unit = js.native
  /**
    * Stop loading the current page.
    */
  def stopLoading(): scala.Unit = js.native
}

