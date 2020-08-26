package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonsProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the RadioButtons can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Called when a RadioButton is selected. The number selected is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selected */ Double, Unit]] = js.native
  /**
    * What RadioButton is selected, zero-indexed. -1 means nothing is selected.
    */
  var selected: js.UndefOr[Double] = js.native
  /**
    * Whether the RadioButtons can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object RadioButtonsProps {
  @scala.inline
  def apply(): RadioButtonsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonsProps]
  }
  @scala.inline
  implicit class RadioButtonsPropsOps[Self <: RadioButtonsProps] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOnSelect(value: /* selected */ Double => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setSelected(value: Double): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

