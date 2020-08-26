package typings.rcFieldForm.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListField extends js.Object {
  var isListField: Boolean = js.native
  var key: Double = js.native
  var name: Double = js.native
}

object ListField {
  @scala.inline
  def apply(isListField: Boolean, key: Double, name: Double): ListField = {
    val __obj = js.Dynamic.literal(isListField = isListField.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListField]
  }
  @scala.inline
  implicit class ListFieldOps[Self <: ListField] (val x: Self) extends AnyVal {
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
    def setIsListField(value: Boolean): Self = this.set("isListField", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Double): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

