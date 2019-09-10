package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriState extends js.Object {
  var xml: String | Null
}

object UriState {
  @scala.inline
  def apply(xml: String = null): UriState = {
    val __obj = js.Dynamic.literal()
    if (xml != null) __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[UriState]
  }
}

