package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewMessageEventData extends js.Object {
  /**
    * The data sent from a WebView; can only be a string.
    */
  var data: java.lang.String
}

object WebViewMessageEventData {
  @scala.inline
  def apply(data: java.lang.String): WebViewMessageEventData = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[WebViewMessageEventData]
  }
}

