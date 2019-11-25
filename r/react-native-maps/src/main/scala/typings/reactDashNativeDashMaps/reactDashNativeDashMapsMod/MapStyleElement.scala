package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStyleElement extends js.Object {
  var elementType: js.UndefOr[String] = js.undefined
  var featureType: js.UndefOr[String] = js.undefined
  var stylers: js.Array[js.Object]
}

object MapStyleElement {
  @scala.inline
  def apply(stylers: js.Array[js.Object], elementType: String = null, featureType: String = null): MapStyleElement = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleElement]
  }
}

