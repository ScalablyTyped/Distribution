package typings.reactImgpro

import typings.reactImgpro.mod.ReactImgpro.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Amount extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
  }
  object Amount {
    
    inline def apply(): Amount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Amount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait Blue extends StObject {
    
    var blue: js.UndefOr[Double] = js.undefined
    
    var brighten: js.UndefOr[Double] = js.undefined
    
    var darken: js.UndefOr[Double] = js.undefined
    
    var desaturate: js.UndefOr[Double] = js.undefined
    
    var green: js.UndefOr[Double] = js.undefined
    
    var greyscale: js.UndefOr[Double] = js.undefined
    
    var lighten: js.UndefOr[Double] = js.undefined
    
    var mix: js.UndefOr[Amount] = js.undefined
    
    var red: js.UndefOr[Double] = js.undefined
    
    var saturate: js.UndefOr[Double] = js.undefined
    
    var shade: js.UndefOr[Double] = js.undefined
    
    var spin: js.UndefOr[Double] = js.undefined
    
    var tint: js.UndefOr[Double] = js.undefined
    
    var xor: js.UndefOr[Double] = js.undefined
  }
  object Blue {
    
    inline def apply(): Blue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blue] (val x: Self) extends AnyVal {
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
      
      inline def setBrighten(value: Double): Self = StObject.set(x, "brighten", value.asInstanceOf[js.Any])
      
      inline def setBrightenUndefined: Self = StObject.set(x, "brighten", js.undefined)
      
      inline def setDarken(value: Double): Self = StObject.set(x, "darken", value.asInstanceOf[js.Any])
      
      inline def setDarkenUndefined: Self = StObject.set(x, "darken", js.undefined)
      
      inline def setDesaturate(value: Double): Self = StObject.set(x, "desaturate", value.asInstanceOf[js.Any])
      
      inline def setDesaturateUndefined: Self = StObject.set(x, "desaturate", js.undefined)
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
      
      inline def setGreyscale(value: Double): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
      
      inline def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
      
      inline def setLighten(value: Double): Self = StObject.set(x, "lighten", value.asInstanceOf[js.Any])
      
      inline def setLightenUndefined: Self = StObject.set(x, "lighten", js.undefined)
      
      inline def setMix(value: Amount): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
      
      inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
      
      inline def setSaturate(value: Double): Self = StObject.set(x, "saturate", value.asInstanceOf[js.Any])
      
      inline def setSaturateUndefined: Self = StObject.set(x, "saturate", js.undefined)
      
      inline def setShade(value: Double): Self = StObject.set(x, "shade", value.asInstanceOf[js.Any])
      
      inline def setShadeUndefined: Self = StObject.set(x, "shade", js.undefined)
      
      inline def setSpin(value: Double): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      inline def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
      
      inline def setXor(value: Double): Self = StObject.set(x, "xor", value.asInstanceOf[js.Any])
      
      inline def setXorUndefined: Self = StObject.set(x, "xor", js.undefined)
    }
  }
  
  trait Degree extends StObject {
    
    var degree: Double
    
    var mode: Mode
  }
  object Degree {
    
    inline def apply(degree: Double, mode: Mode): Degree = {
      val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Degree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Degree] (val x: Self) extends AnyVal {
      
      inline def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Horizontal extends StObject {
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object Horizontal {
    
    inline def apply(): Horizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Horizontal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
