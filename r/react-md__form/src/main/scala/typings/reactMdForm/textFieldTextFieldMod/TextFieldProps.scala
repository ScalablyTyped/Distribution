package typings.reactMdForm.textFieldTextFieldMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactMdForm.anon.OmitHTMLAttributesHTMLDiv
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerOptions
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFieldProps
  extends TextFieldContainerOptions
     with TextFieldAttributes {
  /**
    * Any additional html attributes that should be applied to the main container
    * div. This is probably only going to be used internally so that additional
    * accessibility can be added to text fields for more complex widgets.
    */
  var containerProps: js.UndefOr[OmitHTMLAttributesHTMLDiv] = js.native
  /**
    * An optional ref to apply to the text field's container div element. The
    * default ref is forwarded on to the `input` element.
    */
  var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
  /**
    * The default value for the text field which will make it uncontrolled. If
    * you manually change the `defaultValue` prop, the input's value **will not
    * change** unless you provide a different `key` as well. Use the `value` prop
    * instead for a controlled input.
    */
  @JSName("defaultValue")
  var defaultValue_TextFieldProps: js.UndefOr[String] = js.native
  /**
    * The id for the text field. This is required for accessibility.
    */
  @JSName("id")
  var id_TextFieldProps: String = js.native
  /**
    * An optional className to apply to the input itself. The `className` prop
    * will be applied to the container `<div>` instead.
    */
  var inputClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to apply to the input itself. The `style` prop will be
    * applied to the container `<div>` instead.
    */
  var inputStyle: js.UndefOr[CSSProperties] = js.native
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
    * The type for the text field. `react-md`'s `TextField` supports rendering
    * most of the input types, but will have no built-in validation or additional
    * functionality included.
    */
  var `type`: js.UndefOr[SupportedInputTypes] = js.native
  /**
    * The value to use for the text field. This will make the component
    * controlled and require the `onChange` prop to be provided as well otherwise
    * this will act as a read only text field.
    */
  @JSName("value")
  var value_TextFieldProps: js.UndefOr[String] = js.native
}

object TextFieldProps {
  @scala.inline
  def apply(id: String): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
  @scala.inline
  implicit class TextFieldPropsOps[Self <: TextFieldProps] (val x: Self) extends AnyVal {
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
    def setContainerProps(value: OmitHTMLAttributesHTMLDiv): Self = this.set("containerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerProps: Self = this.set("containerProps", js.undefined)
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
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
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
    def setType(value: SupportedInputTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

