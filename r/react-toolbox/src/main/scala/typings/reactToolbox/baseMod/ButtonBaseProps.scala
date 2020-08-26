package typings.reactToolbox.baseMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonBaseProps extends Props {
  /**
    * Indicates if the button should have accent color.
    * @default false
    */
  var accent: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Value of the icon (See Font Icon Component).
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * If true, the neutral colors are inverted. Useful to put a button over a dark background.
    */
  var inverse: js.UndefOr[Boolean] = js.native
  /**
    * Set it to false if you don't want the neutral styles to be included.
    * @default true
    */
  var neutral: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the button should have primary color.
    * @default false
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * If true, component will have a ripple effect on click.
    * @default true
    */
  var ripple: js.UndefOr[Boolean] = js.native
  /**
    * Component root container type.
    * @default button
    */
  var `type`: js.UndefOr[String] = js.native
}

object ButtonBaseProps {
  @scala.inline
  def apply(): ButtonBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonBaseProps]
  }
  @scala.inline
  implicit class ButtonBasePropsOps[Self <: ButtonBaseProps] (val x: Self) extends AnyVal {
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
    def setAccent(value: Boolean): Self = this.set("accent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccent: Self = this.set("accent", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setNeutral(value: Boolean): Self = this.set("neutral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeutral: Self = this.set("neutral", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

