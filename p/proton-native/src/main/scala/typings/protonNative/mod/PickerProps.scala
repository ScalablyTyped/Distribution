package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the user can enter their own custom text in addition to the drop down menu.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the Picker is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * When an *editable* Picker is changed. The current text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  /**
    * When a *non-editable* Picker is changed. The current selection is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selection */ Double, Unit]] = js.native
  /**
    * What element is selected if the picker *is not* editable.
    */
  var selected: js.UndefOr[Double] = js.native
  /**
    * What text is selected/typed if the picker *is* editable.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Whether the Picker can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PickerProps {
  @scala.inline
  def apply(): PickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps]
  }
  @scala.inline
  implicit class PickerPropsOps[Self <: PickerProps] (val x: Self) extends AnyVal {
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
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOnChange(value: /* text */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSelect(value: /* selection */ Double => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setSelected(value: Double): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

