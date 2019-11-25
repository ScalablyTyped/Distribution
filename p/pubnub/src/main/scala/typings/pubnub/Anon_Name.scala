package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var occupancy: Double
  var occupants: js.Array[Anon_State]
}

object Anon_Name {
  @scala.inline
  def apply(name: String, occupancy: Double, occupants: js.Array[Anon_State]): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

