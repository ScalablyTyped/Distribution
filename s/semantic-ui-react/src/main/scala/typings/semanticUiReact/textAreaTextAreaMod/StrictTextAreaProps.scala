package typings.semanticUiReact.textAreaTextAreaMod

import typings.react.mod.FormEvent
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /**
    * Called on change.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  @JSName("onChange")
  var onChange_StrictTextAreaProps: js.UndefOr[
    js.Function2[/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps, Unit]
  ] = js.native
  /**
    * Called on input.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  @JSName("onInput")
  var onInput_StrictTextAreaProps: js.UndefOr[
    js.Function2[/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps, Unit]
  ] = js.native
  /** Indicates row count for a TextArea. */
  @JSName("rows")
  var rows_StrictTextAreaProps: js.UndefOr[Double | String] = js.native
  /** The value of the textarea. */
  @JSName("value")
  var value_StrictTextAreaProps: js.UndefOr[Double | String] = js.native
}

object StrictTextAreaProps {
  @scala.inline
  def apply(): StrictTextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTextAreaProps]
  }
  @scala.inline
  implicit class StrictTextAreaPropsOps[Self <: StrictTextAreaProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnInput(value: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit): Self = this.set("onInput", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setRows(value: Double | String): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

