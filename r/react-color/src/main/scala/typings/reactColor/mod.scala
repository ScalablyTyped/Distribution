package typings.reactColor

import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactColor.alphaMod.default
import typings.reactColor.anon.PartialClassesany
import typings.reactColor.colorWrapMod.ExportedColorProps
import typings.reactColor.colorWrapMod.InjectedColorProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-color", "AlphaPicker")
  @js.native
  open class AlphaPicker () extends default
  
  @JSImport("react-color", "BlockPicker")
  @js.native
  open class BlockPicker ()
    extends typings.reactColor.blockMod.default
  
  @JSImport("react-color", "Checkboard")
  @js.native
  open class Checkboard ()
    extends typings.reactColor.checkboardMod.default
  
  @JSImport("react-color", "ChromePicker")
  @js.native
  open class ChromePicker ()
    extends typings.reactColor.chromeMod.default
  
  @JSImport("react-color", "CirclePicker")
  @js.native
  open class CirclePicker ()
    extends typings.reactColor.circleMod.default
  
  @JSImport("react-color", "CompactPicker")
  @js.native
  open class CompactPicker ()
    extends typings.reactColor.compactMod.default
  
  inline def CustomPicker[A](component: ComponentClass[A & InjectedColorProps, ComponentState]): ComponentClass[A & ExportedColorProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomPicker")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[A & ExportedColorProps, ComponentState]]
  inline def CustomPicker[A](component: FunctionComponent[A & InjectedColorProps]): ComponentClass[A & ExportedColorProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomPicker")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[A & ExportedColorProps, ComponentState]]
  
  @JSImport("react-color", "GithubPicker")
  @js.native
  open class GithubPicker ()
    extends typings.reactColor.githubMod.default
  
  @JSImport("react-color", "HuePicker")
  @js.native
  open class HuePicker ()
    extends typings.reactColor.hueHueMod.default
  
  @JSImport("react-color", "MaterialPicker")
  @js.native
  open class MaterialPicker ()
    extends typings.reactColor.materialMod.default
  
  @JSImport("react-color", "PhotoshopPicker")
  @js.native
  open class PhotoshopPicker ()
    extends typings.reactColor.photoshopMod.default
  
  @JSImport("react-color", "SketchPicker")
  @js.native
  open class SketchPicker ()
    extends typings.reactColor.sketchMod.default
  
  @JSImport("react-color", "SliderPicker")
  @js.native
  open class SliderPicker ()
    extends typings.reactColor.sliderMod.default
  
  @JSImport("react-color", "SwatchesPicker")
  @js.native
  open class SwatchesPicker ()
    extends typings.reactColor.swatchesMod.default
  
  @JSImport("react-color", "TwitterPicker")
  @js.native
  open class TwitterPicker ()
    extends typings.reactColor.twitterMod.default
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.reactColor.mod.HSLColor
    - typings.reactColor.mod.RGBColor
  */
  type Color = _Color | String
  
  type ColorChangeHandler = js.Function2[/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement], Unit]
  
  trait ColorPickerProps[A]
    extends StObject
       with ClassAttributes[A] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var styles: js.UndefOr[PartialClassesany] = js.undefined
  }
  object ColorPickerProps {
    
    inline def apply[A](): ColorPickerProps[A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerProps[A]]
    }
    
    extension [Self <: ColorPickerProps[?], A](x: Self & ColorPickerProps[A]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeComplete(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction2(value))
      
      inline def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyles(value: PartialClassesany): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait ColorResult extends StObject {
    
    var hex: String
    
    var hsl: HSLColor
    
    var rgb: RGBColor
  }
  object ColorResult {
    
    inline def apply(hex: String, hsl: HSLColor, rgb: RGBColor): ColorResult = {
      val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorResult]
    }
    
    extension [Self <: ColorResult](x: Self) {
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHsl(value: HSLColor): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      inline def setRgb(value: RGBColor): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomPickerProps[A]
    extends StObject
       with ClassAttributes[A] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var onChange: ColorChangeHandler
    
    var pointer: js.UndefOr[ReactNode] = js.undefined
    
    var styles: js.UndefOr[PartialClassesany] = js.undefined
  }
  object CustomPickerProps {
    
    inline def apply[A](onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): CustomPickerProps[A] = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[CustomPickerProps[A]]
    }
    
    extension [Self <: CustomPickerProps[?], A](x: Self & CustomPickerProps[A]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setPointer(value: ReactNode): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
      
      inline def setStyles(value: PartialClassesany): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait HSLColor
    extends StObject
       with _Color {
    
    var a: js.UndefOr[Double] = js.undefined
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object HSLColor {
    
    inline def apply(h: Double, l: Double, s: Double): HSLColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLColor]
    }
    
    extension [Self <: HSLColor](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBColor
    extends StObject
       with _Color {
    
    var a: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGBColor {
    
    inline def apply(b: Double, g: Double, r: Double): RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBColor]
    }
    
    extension [Self <: RGBColor](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Color extends StObject
  object _Color {
    
    inline def HSLColor(h: Double, l: Double, s: Double): typings.reactColor.mod.HSLColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactColor.mod.HSLColor]
    }
    
    inline def RGBColor(b: Double, g: Double, r: Double): typings.reactColor.mod.RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactColor.mod.RGBColor]
    }
  }
}
