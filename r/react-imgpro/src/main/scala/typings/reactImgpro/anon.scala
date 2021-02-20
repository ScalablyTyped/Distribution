package typings.reactImgpro

import typings.reactImgpro.mod.ReactImgpro.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Amount extends StObject {
    
    var amount: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
  }
  object Amount {
    
    @scala.inline
    def apply(): Amount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Amount]
    }
    
    @scala.inline
    implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  @js.native
  trait Blue extends StObject {
    
    var blue: js.UndefOr[Double] = js.native
    
    var brighten: js.UndefOr[Double] = js.native
    
    var darken: js.UndefOr[Double] = js.native
    
    var desaturate: js.UndefOr[Double] = js.native
    
    var green: js.UndefOr[Double] = js.native
    
    var greyscale: js.UndefOr[Double] = js.native
    
    var lighten: js.UndefOr[Double] = js.native
    
    var mix: js.UndefOr[Amount] = js.native
    
    var red: js.UndefOr[Double] = js.native
    
    var saturate: js.UndefOr[Double] = js.native
    
    var shade: js.UndefOr[Double] = js.native
    
    var spin: js.UndefOr[Double] = js.native
    
    var tint: js.UndefOr[Double] = js.native
    
    var xor: js.UndefOr[Double] = js.native
  }
  object Blue {
    
    @scala.inline
    def apply(): Blue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blue]
    }
    
    @scala.inline
    implicit class BlueMutableBuilder[Self <: Blue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
      
      @scala.inline
      def setBrighten(value: Double): Self = StObject.set(x, "brighten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrightenUndefined: Self = StObject.set(x, "brighten", js.undefined)
      
      @scala.inline
      def setDarken(value: Double): Self = StObject.set(x, "darken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkenUndefined: Self = StObject.set(x, "darken", js.undefined)
      
      @scala.inline
      def setDesaturate(value: Double): Self = StObject.set(x, "desaturate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesaturateUndefined: Self = StObject.set(x, "desaturate", js.undefined)
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
      
      @scala.inline
      def setGreyscale(value: Double): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
      
      @scala.inline
      def setLighten(value: Double): Self = StObject.set(x, "lighten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightenUndefined: Self = StObject.set(x, "lighten", js.undefined)
      
      @scala.inline
      def setMix(value: Amount): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
      
      @scala.inline
      def setSaturate(value: Double): Self = StObject.set(x, "saturate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturateUndefined: Self = StObject.set(x, "saturate", js.undefined)
      
      @scala.inline
      def setShade(value: Double): Self = StObject.set(x, "shade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadeUndefined: Self = StObject.set(x, "shade", js.undefined)
      
      @scala.inline
      def setSpin(value: Double): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      @scala.inline
      def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
      
      @scala.inline
      def setXor(value: Double): Self = StObject.set(x, "xor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXorUndefined: Self = StObject.set(x, "xor", js.undefined)
    }
  }
  
  @js.native
  trait Degree extends StObject {
    
    var degree: Double = js.native
    
    var mode: Mode = js.native
  }
  object Degree {
    
    @scala.inline
    def apply(degree: Double, mode: Mode): Degree = {
      val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Degree]
    }
    
    @scala.inline
    implicit class DegreeMutableBuilder[Self <: Degree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Horizontal extends StObject {
    
    var horizontal: js.UndefOr[Boolean] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object Horizontal {
    
    @scala.inline
    def apply(): Horizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Horizontal]
    }
    
    @scala.inline
    implicit class HorizontalMutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
