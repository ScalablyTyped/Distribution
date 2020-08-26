package typings.semanticUiReact.formFormMod

import typings.react.mod.FormEvent
import typings.react.mod.FormHTMLAttributes
import typings.semanticUiReact.semanticUiReactStrings.equal
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictFormProps extends FormHTMLAttributes[HTMLFormElement] {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Automatically show any error Message children. */
  var error: js.UndefOr[Boolean] = js.native
  /** A form can have its color inverted for contrast. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Automatically show a loading indicator. */
  var loading: js.UndefOr[Boolean] = js.native
  /** The HTML form submit handler. */
  @JSName("onSubmit")
  var onSubmit_StrictFormProps: js.UndefOr[js.Function2[/* event */ FormEvent[HTMLFormElement], /* data */ FormProps, Unit]] = js.native
  /** A comment can contain a form to reply to a comment. This may have arbitrary content. */
  var reply: js.UndefOr[Boolean] = js.native
  /** A form can vary in size. */
  var size: js.UndefOr[String] = js.native
  /** Automatically show any success Message children. */
  var success: js.UndefOr[Boolean] = js.native
  /** A form can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.native
  /** Automatically show any warning Message children. */
  var warning: js.UndefOr[Boolean] = js.native
  /** Forms can automatically divide fields to be equal width. */
  var widths: js.UndefOr[equal] = js.native
}

object StrictFormProps {
  @scala.inline
  def apply(): StrictFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormProps]
  }
  @scala.inline
  implicit class StrictFormPropsOps[Self <: StrictFormProps] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnSubmit(value: (/* event */ FormEvent[HTMLFormElement], /* data */ FormProps) => Unit): Self = this.set("onSubmit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setReply(value: Boolean): Self = this.set("reply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply: Self = this.set("reply", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setUnstackable(value: Boolean): Self = this.set("unstackable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnstackable: Self = this.set("unstackable", js.undefined)
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
    @scala.inline
    def setWidths(value: equal): Self = this.set("widths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
  
}

