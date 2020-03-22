package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupname extends js.Object {
  var group_name: String
  var image: AnonIsStored
  var location: AnonAltitude
  var timestamp: Double
  var `type`: String
}

object AnonGroupname {
  @scala.inline
  def apply(group_name: String, image: AnonIsStored, location: AnonAltitude, timestamp: Double, `type`: String): AnonGroupname = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupname]
  }
}

