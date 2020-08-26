package typings.rbx.fieldMod

import typings.rbx.rbxStrings.addons
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.group
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[addons | group] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var narrow: js.UndefOr[Boolean] = js.native
}

object FieldModifierProps {
  @scala.inline
  def apply(): FieldModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldModifierProps]
  }
  @scala.inline
  implicit class FieldModifierPropsOps[Self <: FieldModifierProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: centered | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setKind(value: addons | group): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setNarrow(value: Boolean): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNarrow: Self = this.set("narrow", js.undefined)
  }
  
}

