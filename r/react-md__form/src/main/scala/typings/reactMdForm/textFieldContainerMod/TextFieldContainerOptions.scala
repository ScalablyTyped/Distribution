package typings.reactMdForm.textFieldContainerMod

import typings.react.mod.ReactNode
import typings.reactMdForm.formThemeProviderMod.FormThemeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFieldContainerOptions extends FormThemeOptions {
  /**
    * Boolean if the form components should be using the `dense` spec to reduce
    * the sizing slightly.
    */
  var dense: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the text field should gain the error state and update the
    * colors.
    */
  var error: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the component should be rendered inline with
    * `display: inline-flex` instead of `display: flex`.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the left children should be wrapped in the `TextFieldAddon`
    * component. This is enabled by default since this is _normally_ the behavior
    * that is desired so that icons can be positioned correctly.
    */
  var isLeftAddon: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the right children should be wrapped in the `TextFieldAddon`
    * component. This is enabled by default since this is _normally_ the behavior
    * that is desired so that icons can be positioned correctly.
    */
  var isRightAddon: js.UndefOr[Boolean] = js.native
  /**
    * An optional addon to apply to the left of the text field. This should
    * normally be an icon. This element will not have pointer events so it can be
    * "clicked through" to focus the text field instead.
    */
  var leftChildren: js.UndefOr[ReactNode] = js.native
  /**
    * An optional addon to apply to the right of the text field. This should be a
    * clickable button such as a password field toggle or a reset button for the
    * field.
    */
  var rightChildren: js.UndefOr[ReactNode] = js.native
}

object TextFieldContainerOptions {
  @scala.inline
  def apply(): TextFieldContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldContainerOptions]
  }
  @scala.inline
  implicit class TextFieldContainerOptionsOps[Self <: TextFieldContainerOptions] (val x: Self) extends AnyVal {
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
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setIsLeftAddon(value: Boolean): Self = this.set("isLeftAddon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLeftAddon: Self = this.set("isLeftAddon", js.undefined)
    @scala.inline
    def setIsRightAddon(value: Boolean): Self = this.set("isRightAddon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRightAddon: Self = this.set("isRightAddon", js.undefined)
    @scala.inline
    def setLeftChildren(value: ReactNode): Self = this.set("leftChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftChildren: Self = this.set("leftChildren", js.undefined)
    @scala.inline
    def setRightChildren(value: ReactNode): Self = this.set("rightChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightChildren: Self = this.set("rightChildren", js.undefined)
  }
  
}

