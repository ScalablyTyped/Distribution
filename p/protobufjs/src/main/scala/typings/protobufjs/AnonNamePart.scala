package typings.protobufjs

import typings.protobufjs.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamePart extends js.Object {
  var NamePart: Type
}

object AnonNamePart {
  @scala.inline
  def apply(NamePart: Type): AnonNamePart = {
    val __obj = js.Dynamic.literal(NamePart = NamePart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNamePart]
  }
}

