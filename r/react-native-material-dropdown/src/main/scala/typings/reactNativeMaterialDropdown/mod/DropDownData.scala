package typings.reactNativeMaterialDropdown.mod

import typings.reactNativeMaterialDropdown.anon.PartialDropDownPropsAbsoluteRTLLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownData extends js.Object {
  /** Label to be shown */
  var label: js.UndefOr[String] = js.native
  /** Props for this item */
  var props: js.UndefOr[PartialDropDownPropsAbsoluteRTLLayout] = js.native
  /** Value of item */
  var value: String = js.native
}

object DropDownData {
  @scala.inline
  def apply(value: String): DropDownData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownData]
  }
  @scala.inline
  implicit class DropDownDataOps[Self <: DropDownData] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setProps(value: PartialDropDownPropsAbsoluteRTLLayout): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
  
}

