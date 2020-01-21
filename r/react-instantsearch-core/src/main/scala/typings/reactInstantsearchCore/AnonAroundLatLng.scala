package typings.reactInstantsearchCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAroundLatLng
  extends /* key */ StringDictionary[js.Any] {
  var aroundLatLng: Boolean
}

object AnonAroundLatLng {
  @scala.inline
  def apply(aroundLatLng: Boolean, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonAroundLatLng = {
    val __obj = js.Dynamic.literal(aroundLatLng = aroundLatLng.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonAroundLatLng]
  }
}

