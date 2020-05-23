package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var occupancy: Double
  var occupants: js.Array[State]
}

object Name {
  @scala.inline
  def apply(name: String, occupancy: Double, occupants: js.Array[State]): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

