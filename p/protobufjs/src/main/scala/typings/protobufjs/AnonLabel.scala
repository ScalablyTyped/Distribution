package typings.protobufjs

import typings.protobufjs.mod.Enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var Label: Enum
  var Type: Enum
}

object AnonLabel {
  @scala.inline
  def apply(Label: Enum, Type: Enum): AnonLabel = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabel]
  }
}

