package typings.rootAsn1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementInput extends js.Object {
  var children: js.UndefOr[js.Array[ElementInput]] = js.native
  var `type`: Double = js.native
  var value: js.UndefOr[String | Uint8Array] = js.native
}

object ElementInput {
  @scala.inline
  def apply(`type`: Double): ElementInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementInput]
  }
  @scala.inline
  implicit class ElementInputOps[Self <: ElementInput] (val x: Self) extends AnyVal {
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
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: ElementInput*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ElementInput]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setValue(value: String | Uint8Array): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

