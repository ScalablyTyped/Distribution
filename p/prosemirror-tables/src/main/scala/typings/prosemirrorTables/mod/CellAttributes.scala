package typings.prosemirrorTables.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellAttributes extends js.Object {
  var default: js.Any = js.native
  var getFromDOM: js.UndefOr[typings.prosemirrorTables.mod.getFromDOM] = js.native
  var setDOMAttr: js.UndefOr[typings.prosemirrorTables.mod.setDOMAttr] = js.native
}

object CellAttributes {
  @scala.inline
  def apply(default: js.Any): CellAttributes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAttributes]
  }
  @scala.inline
  implicit class CellAttributesOps[Self <: CellAttributes] (val x: Self) extends AnyVal {
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFromDOM(value: /* dom */ Element => js.Any): Self = this.set("getFromDOM", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFromDOM: Self = this.set("getFromDOM", js.undefined)
    @scala.inline
    def setSetDOMAttr(value: (/* value */ js.Any, /* attrs */ js.Any) => js.Any): Self = this.set("setDOMAttr", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetDOMAttr: Self = this.set("setDOMAttr", js.undefined)
  }
  
}

