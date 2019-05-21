package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStyleElement extends js.Object {
  var elementType: js.UndefOr[java.lang.String] = js.undefined
  var featureType: js.UndefOr[java.lang.String] = js.undefined
  var stylers: js.Array[js.Object]
}

object MapStyleElement {
  @scala.inline
  def apply(
    stylers: js.Array[js.Object],
    elementType: java.lang.String = null,
    featureType: java.lang.String = null
  ): MapStyleElement = {
    val __obj = js.Dynamic.literal(stylers = stylers)
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (featureType != null) __obj.updateDynamic("featureType")(featureType)
    __obj.asInstanceOf[MapStyleElement]
  }
}

