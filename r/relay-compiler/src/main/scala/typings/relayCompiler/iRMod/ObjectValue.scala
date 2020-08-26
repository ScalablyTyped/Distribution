package typings.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectValue
  extends ArgumentValue
     with IR {
  var fields: js.Array[ObjectFieldValue] = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.ObjectValue = js.native
  var loc: Location = js.native
}

object ObjectValue {
  @scala.inline
  def apply(
    fields: js.Array[ObjectFieldValue],
    kind: typings.relayCompiler.relayCompilerStrings.ObjectValue,
    loc: Location
  ): ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValue]
  }
  @scala.inline
  implicit class ObjectValueOps[Self <: ObjectValue] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: ObjectFieldValue*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[ObjectFieldValue]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.ObjectValue): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
  }
  
}

