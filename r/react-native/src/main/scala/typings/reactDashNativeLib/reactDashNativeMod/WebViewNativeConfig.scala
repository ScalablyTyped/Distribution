package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewNativeConfig extends js.Object {
  /*
    * The native component used to render the WebView.
    */
  var component: js.UndefOr[js.Any] = js.undefined
  /*
    * Set props directly on the native component WebView. Enables custom props which the
    * original WebView doesn't pass through.
    */
  var props: js.UndefOr[js.Object] = js.undefined
  /*
    * Set the ViewManager to use for communication with the native side.
    * @platform ios
    */
  var viewManager: js.UndefOr[js.Object] = js.undefined
}

object WebViewNativeConfig {
  @scala.inline
  def apply(component: js.Any = null, props: js.Object = null, viewManager: js.Object = null): WebViewNativeConfig = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (props != null) __obj.updateDynamic("props")(props)
    if (viewManager != null) __obj.updateDynamic("viewManager")(viewManager)
    __obj.asInstanceOf[WebViewNativeConfig]
  }
}

