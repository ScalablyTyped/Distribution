package typings.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListValue
  extends ArgumentValue
     with IR {
  var items: js.Array[ArgumentValue] = js.native
  var kind: typings.relayCompiler.relayCompilerStrings.ListValue = js.native
  var loc: Location = js.native
  var metadata: Metadata = js.native
}

object ListValue {
  @scala.inline
  def apply(
    items: js.Array[ArgumentValue],
    kind: typings.relayCompiler.relayCompilerStrings.ListValue,
    loc: Location
  ): ListValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListValue]
  }
  @scala.inline
  implicit class ListValueOps[Self <: ListValue] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: ArgumentValue*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ArgumentValue]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.relayCompiler.relayCompilerStrings.ListValue): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

