package typings.reactColor

import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorChangeHandler
import typings.reactColor.mod.ColorResult
import typings.reactColor.mod.HSLColor
import typings.reactColor.mod.RGBColor
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorWrapMod {
  
  @JSImport("react-color/lib/components/common/ColorWrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[A](component: ComponentClass[A & InjectedColorProps, ComponentState]): ComponentClass[A & ExportedColorProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[A & ExportedColorProps, ComponentState]]
  @scala.inline
  def default[A](component: StatelessComponent[A & InjectedColorProps]): ComponentClass[A & ExportedColorProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[A & ExportedColorProps, ComponentState]]
  
  type ColorWrapChangeHandler = js.Function1[/* color */ Color | ColorResult, Unit]
  
  trait ExportedColorProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
  }
  object ExportedColorProps {
    
    @scala.inline
    def apply(): ExportedColorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportedColorProps]
    }
    
    @scala.inline
    implicit class ExportedColorPropsMutableBuilder[Self <: ExportedColorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeComplete(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait InjectedColorProps extends StObject {
    
    var hex: js.UndefOr[String] = js.undefined
    
    var hsl: js.UndefOr[HSLColor] = js.undefined
    
    var onChange: js.UndefOr[ColorWrapChangeHandler] = js.undefined
    
    var rgb: js.UndefOr[RGBColor] = js.undefined
  }
  object InjectedColorProps {
    
    @scala.inline
    def apply(): InjectedColorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedColorProps]
    }
    
    @scala.inline
    implicit class InjectedColorPropsMutableBuilder[Self <: InjectedColorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      @scala.inline
      def setHsl(value: HSLColor): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHslUndefined: Self = StObject.set(x, "hsl", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* color */ Color | ColorResult => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRgb(value: RGBColor): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgbUndefined: Self = StObject.set(x, "rgb", js.undefined)
    }
  }
}
