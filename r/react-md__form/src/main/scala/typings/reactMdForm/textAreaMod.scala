package typings.reactMdForm

import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerOptions
import typings.std.HTMLDivElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod {
  
  @JSImport("@react-md/form/types/text-field/TextArea", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[HTMLTextAreaElement]] = js.native
  
  trait TextAreaProps
    extends StObject
       with TextareaHTMLAttributes[HTMLTextAreaElement]
       with TextFieldContainerOptions {
    
    /**
      * Boolean if the height changes should be animated when the `resize` prop is
      * set to `"auto"`.
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional className to apply to the textarea element. The base `style`
      * prop is applied to the surrounding `div` instead.
      */
    var areaClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to apply to the textarea element. The base `style` prop
      * is applied to the surrounding `div` instead.
      */
    var areaStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * An optional ref to apply to the text field's container div element. The
      * default ref is forwarded on to the `input` element.
      */
    var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    /**
      * The default value for the text field which will make it uncontrolled.  If
      * you manually change the `defaultValue` prop, the input's value **will not
      * change** unless you provide a different `key` as well. Use the `value` prop
      * instead for a controlled input.
      */
    @JSName("defaultValue")
    var defaultValue_TextAreaProps: js.UndefOr[String] = js.undefined
    
    /**
      * An id to apply to the text area. This is required for a11y.
      */
    @JSName("id")
    var id_TextAreaProps: String
    
    /**
      * An optional floating label to use for the text field. This should really
      * only be used when the `theme` prop is not set to `"none"`. This will be
      * wrapped in the `<Label>` component itself and automatically apply the
      * `htmlFor` prop for this text field.
      */
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional className to apply to the label wrapper.
      */
    var labelClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to apply to the label wrapper.
      */
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The maximum number of rows that are allowed. When this is set to `-1`, it
      * will infinitely expand based on the text content.
      */
    var maxRows: js.UndefOr[Double] = js.undefined
    
    /**
      * Updates the resize ability for the textarea. Native textareas are resizable
      * both horizontally and vertically, but this component will prevent resizing
      * by default and instead animate height changes as the user types.
      */
    var resize: js.UndefOr[TextAreaResize] = js.undefined
    
    /**
      * The value to use for the text field. This will make the component
      * controlled and require the `onChange` prop to be provided as well otherwise
      * this will act as a read only text field.
      */
    @JSName("value")
    var value_TextAreaProps: js.UndefOr[String] = js.undefined
  }
  object TextAreaProps {
    
    @scala.inline
    def apply(id: String): TextAreaProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAreaProps]
    }
    
    @scala.inline
    implicit class TextAreaPropsMutableBuilder[Self <: TextAreaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAreaClassName(value: String): Self = StObject.set(x, "areaClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaClassNameUndefined: Self = StObject.set(x, "areaClassName", js.undefined)
      
      @scala.inline
      def setAreaStyle(value: CSSProperties): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
      
      @scala.inline
      def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "containerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
      
      @scala.inline
      def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassNameUndefined: Self = StObject.set(x, "labelClassName", js.undefined)
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      @scala.inline
      def setResize(value: TextAreaResize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdForm.reactMdFormStrings.none
    - typings.reactMdForm.reactMdFormStrings.auto
    - typings.reactMdForm.reactMdFormStrings.horizontal
    - typings.reactMdForm.reactMdFormStrings.vertical
    - typings.reactMdForm.reactMdFormStrings.both
  */
  trait TextAreaResize extends StObject
  object TextAreaResize {
    
    @scala.inline
    def auto: typings.reactMdForm.reactMdFormStrings.auto = "auto".asInstanceOf[typings.reactMdForm.reactMdFormStrings.auto]
    
    @scala.inline
    def both: typings.reactMdForm.reactMdFormStrings.both = "both".asInstanceOf[typings.reactMdForm.reactMdFormStrings.both]
    
    @scala.inline
    def horizontal: typings.reactMdForm.reactMdFormStrings.horizontal = "horizontal".asInstanceOf[typings.reactMdForm.reactMdFormStrings.horizontal]
    
    @scala.inline
    def none: typings.reactMdForm.reactMdFormStrings.none = "none".asInstanceOf[typings.reactMdForm.reactMdFormStrings.none]
    
    @scala.inline
    def vertical: typings.reactMdForm.reactMdFormStrings.vertical = "vertical".asInstanceOf[typings.reactMdForm.reactMdFormStrings.vertical]
  }
}
