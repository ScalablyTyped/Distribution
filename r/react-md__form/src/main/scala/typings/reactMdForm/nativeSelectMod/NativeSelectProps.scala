package typings.reactMdForm.nativeSelectMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SelectHTMLAttributes
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerOptions
import typings.std.HTMLDivElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeSelectProps
  extends SelectHTMLAttributes[HTMLSelectElement]
     with TextFieldContainerOptions {
  
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
    *
    * If the `multiple` prop is enabled, this **must** be a list of strings.
    */
  @JSName("defaultValue")
  var defaultValue_NativeSelectProps: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * An optional icon to display to the right of the select. This should
    * normally be a dropdown icon to replace the native select's dropdown icon.
    * If this is set to `null`, the native select's dropdown icon will be
    * displayed instead.
    *
    * This defaults to the `IconProvider`'s dropdown icon from the
    * `@react-md/icon` package.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  
  /**
    * The id for the select. This is required for accessibility.
    */
  @JSName("id")
  var id_NativeSelectProps: String = js.native
  
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
    * An optional className to apply to the select itself. The `className` prop
    * will be applied to the container `<div>` instead.
    */
  var selectClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional style to apply to the select itself. The `style` prop will be
    * applied to the container `<div>` instead.
    */
  var selectStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The value to use for the text field. This will make the component
    * controlled and require the `onChange` prop to be provided as well otherwise
    * this will act as a read only text field.
    *
    * If the `multiple` prop is enabled, this **must** be a list of strings.
    */
  @JSName("value")
  var value_NativeSelectProps: js.UndefOr[String | js.Array[String]] = js.native
}
object NativeSelectProps {
  
  @scala.inline
  def apply(id: String): NativeSelectProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSelectProps]
  }
  
  @scala.inline
  implicit class NativeSelectPropsOps[Self <: NativeSelectProps] (val x: Self) extends AnyVal {
    
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
    def setContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("containerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainerRef(value: Ref[HTMLDivElement]): Self = this.set("containerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerRef: Self = this.set("containerRef", js.undefined)
    
    @scala.inline
    def setContainerRefNull: Self = this.set("containerRef", null)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: String | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
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
    def setSelectClassName(value: String): Self = this.set("selectClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectClassName: Self = this.set("selectClassName", js.undefined)
    
    @scala.inline
    def setSelectStyle(value: CSSProperties): Self = this.set("selectStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectStyle: Self = this.set("selectStyle", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
