package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelValueType extends js.Object {
  /** Only works on `treeCheckStrictly` */
  var halfChecked: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var value: js.UndefOr[RawValueType] = js.native
}

object LabelValueType {
  @scala.inline
  def apply(): LabelValueType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelValueType]
  }
  @scala.inline
  implicit class LabelValueTypeOps[Self <: LabelValueType] (val x: Self) extends AnyVal {
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
    def setHalfChecked(value: Boolean): Self = this.set("halfChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfChecked: Self = this.set("halfChecked", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setValue(value: RawValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

