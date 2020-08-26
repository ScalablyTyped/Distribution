package typings.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectFieldValue extends IR {
  var kind: typings.relayCompiler.relayCompilerStrings.ObjectFieldValue = js.native
  var loc: Location = js.native
  var name: String = js.native
  var value: ArgumentValue = js.native
}

object ObjectFieldValue {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.ObjectFieldValue,
    loc: Location,
    name: String,
    value: ArgumentValue
  ): ObjectFieldValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldValue]
  }
  @scala.inline
  implicit class ObjectFieldValueOps[Self <: ObjectFieldValue] (val x: Self) extends AnyVal {
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
    def setKind(value: typings.relayCompiler.relayCompilerStrings.ObjectFieldValue): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ArgumentValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

