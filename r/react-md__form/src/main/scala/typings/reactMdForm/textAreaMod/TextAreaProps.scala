package typings.reactMdForm.textAreaMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.TextareaHTMLAttributes
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerOptions
import typings.std.HTMLDivElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaProps
  extends TextareaHTMLAttributes[HTMLTextAreaElement]
     with TextFieldContainerOptions {
  /**
    * Boolean if the height changes should be animated when the `resize` prop is
    * set to `"auto"`.
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * An optional className to apply to the textarea element. The base `style`
    * prop is applied to the surrounding `div` instead.
    */
  var areaClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to apply to the textarea element. The base `style` prop
    * is applied to the surrounding `div` instead.
    */
  var areaStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * An optional ref to apply to the text field's container div element. The
    * default ref is forwarded on to the `input` element.
    */
  var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
  /**
    * The default value for the text field which will make it uncontrolled.  If
    * you manually change the `defaultValue` prop, the input's value **will not
    * change** unless you provide a different `key` as well. Use the `value` prop
    * instead for a controlled input.
    */
  @JSName("defaultValue")
  var defaultValue_TextAreaProps: js.UndefOr[String] = js.native
  /**
    * An id to apply to the text area. This is required for a11y.
    */
  @JSName("id")
  var id_TextAreaProps: String = js.native
  /**
    * An optional floating label to use for the text field. This should really
    * only be used when the `theme` prop is not set to `"none"`. This will be
    * wrapped in the `<Label>` component itself and automatically apply the
    * `htmlFor` prop for this text field.
    */
  var label: js.UndefOr[ReactNode] = js.native
  /**
    * An optional className to apply to the label wrapper.
    */
  var labelClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to apply to the label wrapper.
    */
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * The maximum number of rows that are allowed. When this is set to `-1`, it
    * will infinitely expand based on the text content.
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * Updates the resize ability for the textarea. Native textareas are resizable
    * both horizontally and vertically, but this component will prevent resizing
    * by default and instead animate height changes as the user types.
    */
  var resize: js.UndefOr[TextAreaResize] = js.native
  /**
    * The value to use for the text field. This will make the component
    * controlled and require the `onChange` prop to be provided as well otherwise
    * this will act as a read only text field.
    */
  @JSName("value")
  var value_TextAreaProps: js.UndefOr[String] = js.native
}

object TextAreaProps {
  @scala.inline
  def apply(id: String): TextAreaProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps]
  }
  @scala.inline
  implicit class TextAreaPropsOps[Self <: TextAreaProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAreaClassName(value: String): Self = this.set("areaClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaClassName: Self = this.set("areaClassName", js.undefined)
    @scala.inline
    def setAreaStyle(value: CSSProperties): Self = this.set("areaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaStyle: Self = this.set("areaStyle", js.undefined)
    @scala.inline
    def setContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("containerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setContainerRef(value: Ref[HTMLDivElement]): Self = this.set("containerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerRef: Self = this.set("containerRef", js.undefined)
    @scala.inline
    def setContainerRefNull: Self = this.set("containerRef", null)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelClassName(value: String): Self = this.set("labelClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelClassName: Self = this.set("labelClassName", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    @scala.inline
    def setResize(value: TextAreaResize): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

