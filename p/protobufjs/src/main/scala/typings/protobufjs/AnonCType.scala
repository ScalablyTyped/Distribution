package typings.protobufjs

import typings.protobufjs.mod.Enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCType extends js.Object {
  var CType: Enum
  var JSType: Enum
}

object AnonCType {
  @scala.inline
  def apply(CType: Enum, JSType: Enum): AnonCType = {
    val __obj = js.Dynamic.literal(CType = CType.asInstanceOf[js.Any], JSType = JSType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCType]
  }
}

