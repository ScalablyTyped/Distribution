package typings.reactDashNative.reactDashNativeMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "WebView")
@js.native
class WebView ()
  extends Component[WebViewProps, js.Object, js.Any] {
  /**
    * Returns the native webview node.
    */
  def getWebViewHandle(): js.Any = js.native
  /**
    * Go back one page in the webview's history.
    */
  def goBack(): Unit = js.native
  /**
    * Go forward one page in the webview's history.
    */
  def goForward(): Unit = js.native
  /**
    * Inject JavaScript to be executed immediately.
    */
  def injectJavaScript(script: String): Unit = js.native
  /**
    * Post a message to the WebView in the form of a string.
    */
  def postMessage(message: String): Unit = js.native
  /**
    * Reloads the current page.
    */
  def reload(): Unit = js.native
  /**
    * Stop loading the current page.
    */
  def stopLoading(): Unit = js.native
}

