package typings.relayCompiler.anon

import typings.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[typings.relayCompiler.schemaMod.Argument] = js.native
  var `type`: TypeID = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Array[typings.relayCompiler.schemaMod.Argument], `type`: TypeID): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: typings.relayCompiler.schemaMod.Argument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[typings.relayCompiler.schemaMod.Argument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TypeID): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

