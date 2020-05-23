package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groupname extends js.Object {
  var group_name: String
  var image: IsStored
  var location: Altitude
  var timestamp: Double
  var `type`: String
}

object Groupname {
  @scala.inline
  def apply(group_name: String, image: IsStored, location: Altitude, timestamp: Double, `type`: String): Groupname = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupname]
  }
}

