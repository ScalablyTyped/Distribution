package typings
package reactDashCartographerLib.libComponentsMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapData extends js.Object {
  var locationLink: js.Any
  var locationText: java.lang.String
}

object MapData {
  @scala.inline
  def apply(locationLink: js.Any, locationText: java.lang.String): MapData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locationLink")(locationLink)
    __obj.updateDynamic("locationText")(locationText)
    __obj.asInstanceOf[MapData]
  }
}

