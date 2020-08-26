package typings.reactMdForm.labelLabelMod

import typings.react.mod.HTMLAttributes
import typings.reactMdForm.reactMdFormStrings.label
import typings.reactMdForm.reactMdFormStrings.span
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelProps extends HTMLAttributes[HTMLLabelElement] {
  /**
    * Boolean if the label should gain the active state. This should normally be
    * enabled whenever the `<input>`/`<textarea>` gain focus. This is really more
    * for text input than anything else, and probably shouldn't be used for
    * checkbox, radio or switch components.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The component to render the label as. This should be the default value of
    * `"label"` 99% of the time, but can also be rendered as a `"span"` for the
    * `Select` implementation where it needs to be rendered in a button.
    */
  var component: js.UndefOr[label | span] = js.native
  /**
    * Boolean if the label should gain the disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the label should gain the error state.
    */
  var error: js.UndefOr[Boolean] = js.native
  /**
    * An id for the `<input>` or `<textarea>` that this label is for. This is
    * required since all label's **should** point to a valid
    * `<input>`/`<textarea>`.
    */
  var htmlFor: String = js.native
}

object LabelProps {
  @scala.inline
  def apply(htmlFor: String): LabelProps = {
    val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
  @scala.inline
  implicit class LabelPropsOps[Self <: LabelProps] (val x: Self) extends AnyVal {
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
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setComponent(value: label | span): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

