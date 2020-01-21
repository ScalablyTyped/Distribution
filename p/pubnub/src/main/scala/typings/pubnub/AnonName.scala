package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var occupancy: Double
  var occupants: js.Array[AnonState]
}

object AnonName {
  @scala.inline
  def apply(name: String, occupancy: Double, occupants: js.Array[AnonState]): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

