package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerPanelMod {
  
  @JSImport("primereact/components/colorpicker/ColorPickerPanel", "ColorPicker")
  @js.native
  class ColorPicker protected ()
    extends Component[ColorPickerPanelProps, js.Any, js.Any] {
    def this(props: ColorPickerPanelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColorPickerPanelProps, context: js.Any) = this()
  }
  
  trait ColorPickerPanelProps extends StObject {
    
    var appendTo: js.UndefOr[js.Any] = js.undefined
    
    var disabled: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ColorPickerPanelProps {
    
    @scala.inline
    def apply(): ColorPickerPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerPanelProps]
    }
    
    @scala.inline
    implicit class ColorPickerPanelPropsMutableBuilder[Self <: ColorPickerPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
