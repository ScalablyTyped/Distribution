package typings.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthObject extends js.Object {
  var unit: String
  var value: Double
}

object LengthObject {
  @scala.inline
  def apply(unit: String, value: Double): LengthObject = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthObject]
  }
}

