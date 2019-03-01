package typings
package pubnubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var occupancy: scala.Double
  var occupants: js.Array[Anon_State]
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, occupancy: scala.Double, occupants: js.Array[Anon_State]): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("occupancy")(occupancy)
    __obj.updateDynamic("occupants")(occupants)
    __obj.asInstanceOf[Anon_Name]
  }
}

