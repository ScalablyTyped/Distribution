package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groupname extends js.Object {
  var group_name: String
  var image: Anon_HeightIsStored
  var location: Anon_Altitude
  var timestamp: Double
  var `type`: String
}

object Anon_Groupname {
  @scala.inline
  def apply(
    group_name: String,
    image: Anon_HeightIsStored,
    location: Anon_Altitude,
    timestamp: Double,
    `type`: String
  ): Anon_Groupname = {
    val __obj = js.Dynamic.literal(group_name = group_name, image = image, location = location, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Groupname]
  }
}

