package typings.reactTextareaAutosize.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.react.mod.RefObject
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaAutosizeProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement] {
  /**
    * Allows an owner to retrieve the DOM node.
    */
  var inputRef: js.UndefOr[
    (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | RefObject[HTMLTextAreaElement]
  ] = js.native
  /**
    * Maximum number of rows to show.
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * Alias for `rows`.
    */
  var minRows: js.UndefOr[Double] = js.native
  /**
    * Callback on value change
    * @param event
    */
  @JSName("onChange")
  var onChange_TextareaAutosizeProps: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]] = js.native
  /**
    * Callback on height change
    * @param height
    */
  var onHeightChange: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.native
  /**
    * Try to cache DOM measurements performed by component so that we don't
    * touch DOM when it's not needed.
    *
    * This optimization doesn't work if we dynamically style `<textarea />`
    * component.
    * @default false
    */
  var useCacheForDOMMeasurements: js.UndefOr[Boolean] = js.native
  /**
    * Current textarea value
    */
  @JSName("value")
  var value_TextareaAutosizeProps: js.UndefOr[String] = js.native
}

object TextareaAutosizeProps {
  @scala.inline
  def apply(): TextareaAutosizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaAutosizeProps]
  }
  @scala.inline
  implicit class TextareaAutosizePropsOps[Self <: TextareaAutosizeProps] (val x: Self) extends AnyVal {
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
    def setInputRefFunction1(value: /* node */ HTMLTextAreaElement => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | RefObject[HTMLTextAreaElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    @scala.inline
    def setMinRows(value: Double): Self = this.set("minRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRows: Self = this.set("minRows", js.undefined)
    @scala.inline
    def setOnChange(value: /* event */ ChangeEvent[HTMLTextAreaElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnHeightChange(value: /* height */ Double => Unit): Self = this.set("onHeightChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHeightChange: Self = this.set("onHeightChange", js.undefined)
    @scala.inline
    def setUseCacheForDOMMeasurements(value: Boolean): Self = this.set("useCacheForDOMMeasurements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCacheForDOMMeasurements: Self = this.set("useCacheForDOMMeasurements", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

