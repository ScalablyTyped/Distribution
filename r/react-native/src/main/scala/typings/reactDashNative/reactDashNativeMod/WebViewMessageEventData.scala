package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewMessageEventData extends js.Object {
  /**
    * The data sent from a WebView; can only be a string.
    */
  var data: String
}

object WebViewMessageEventData {
  @scala.inline
  def apply(data: String): WebViewMessageEventData = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[WebViewMessageEventData]
  }
}

