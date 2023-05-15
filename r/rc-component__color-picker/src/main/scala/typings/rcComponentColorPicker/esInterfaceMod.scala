package typings.rcComponentColorPicker

import typings.rcComponentColorPicker.esColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  trait BaseColorPickerProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* color */ Color, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object BaseColorPickerProps {
    
    inline def apply(): BaseColorPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseColorPickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseColorPickerProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnChange(value: /* color */ Color => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.rcComponentColorPicker.esInterfaceMod.RGB
    - typings.rcComponentColorPicker.esInterfaceMod.RGBA
    - typings.rcComponentColorPicker.esInterfaceMod.HSB
    - typings.rcComponentColorPicker.esInterfaceMod.HSBA
    - T
  */
  type ColorGenInput[T] = _ColorGenInput[T] | String | Double | T
  
  trait HSB
    extends StObject
       with _ColorGenInput[Any] {
    
    var b: Double | String
    
    var h: Double | String
    
    var s: Double | String
  }
  object HSB {
    
    inline def apply(b: Double | String, h: Double | String, s: Double | String): HSB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSB] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double | String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rcComponentColorPicker.esInterfaceMod._ColorGenInput because Already inherited */ trait HSBA
    extends StObject
       with HSB {
    
    var a: Double
  }
  object HSBA {
    
    inline def apply(a: Double, b: Double | String, h: Double | String, s: Double | String): HSBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSBA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSBA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.hue
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.alpha
  */
  trait HsbaColorType extends StObject
  object HsbaColorType {
    
    inline def alpha: typings.rcComponentColorPicker.rcComponentColorPickerStrings.alpha = "alpha".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.alpha]
    
    inline def hue: typings.rcComponentColorPicker.rcComponentColorPickerStrings.hue = "hue".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.hue]
  }
  
  trait RGB
    extends StObject
       with _ColorGenInput[Any] {
    
    var b: Double | String
    
    var g: Double | String
    
    var r: Double | String
  }
  object RGB {
    
    inline def apply(b: Double | String, g: Double | String, r: Double | String): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double | String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rcComponentColorPicker.esInterfaceMod._ColorGenInput because Already inherited */ trait RGBA
    extends StObject
       with RGB {
    
    var a: Double
  }
  object RGBA {
    
    inline def apply(a: Double, b: Double | String, g: Double | String, r: Double | String): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformOffset extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object TransformOffset {
    
    inline def apply(x: Double, y: Double): TransformOffset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOffset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOffset] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.top
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.topLeft
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.topRight
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottom
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottomLeft
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottomRight
  */
  trait TriggerPlacement extends StObject
  object TriggerPlacement {
    
    inline def bottom: typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottom = "bottom".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottom]
    
    inline def bottomLeft: typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottomLeft]
    
    inline def bottomRight: typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottomRight = "bottomRight".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.bottomRight]
    
    inline def top: typings.rcComponentColorPicker.rcComponentColorPickerStrings.top = "top".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.top]
    
    inline def topLeft: typings.rcComponentColorPicker.rcComponentColorPickerStrings.topLeft = "topLeft".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.topLeft]
    
    inline def topRight: typings.rcComponentColorPicker.rcComponentColorPickerStrings.topRight = "topRight".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.click
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.hover
  */
  trait TriggerType extends StObject
  object TriggerType {
    
    inline def click: typings.rcComponentColorPicker.rcComponentColorPickerStrings.click = "click".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.click]
    
    inline def hover: typings.rcComponentColorPicker.rcComponentColorPickerStrings.hover = "hover".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.hover]
  }
  
  trait _ColorGenInput[T] extends StObject
  object _ColorGenInput {
    
    inline def HSB(b: Double | String, h: Double | String, s: Double | String): typings.rcComponentColorPicker.esInterfaceMod.HSB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcComponentColorPicker.esInterfaceMod.HSB]
    }
    
    inline def HSBA(a: Double, b: Double | String, h: Double | String, s: Double | String): typings.rcComponentColorPicker.esInterfaceMod.HSBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcComponentColorPicker.esInterfaceMod.HSBA]
    }
    
    inline def RGB(b: Double | String, g: Double | String, r: Double | String): typings.rcComponentColorPicker.esInterfaceMod.RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcComponentColorPicker.esInterfaceMod.RGB]
    }
    
    inline def RGBA(a: Double, b: Double | String, g: Double | String, r: Double | String): typings.rcComponentColorPicker.esInterfaceMod.RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcComponentColorPicker.esInterfaceMod.RGBA]
    }
  }
}
