package typings.relayCompiler.anon

import typings.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[typings.relayCompiler.schemaMod.Argument]
  var `type`: TypeID
}

object Args {
  @scala.inline
  def apply(args: js.Array[typings.relayCompiler.schemaMod.Argument], `type`: TypeID): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

