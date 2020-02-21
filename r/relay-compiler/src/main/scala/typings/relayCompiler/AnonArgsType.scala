package typings.relayCompiler

import typings.relayCompiler.schemaMod.Argument
import typings.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsType extends js.Object {
  var args: js.Array[Argument]
  var `type`: TypeID
}

object AnonArgsType {
  @scala.inline
  def apply(args: js.Array[Argument], `type`: TypeID): AnonArgsType = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgsType]
  }
}

