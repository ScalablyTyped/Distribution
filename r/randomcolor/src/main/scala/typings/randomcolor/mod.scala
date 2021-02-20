package typings.randomcolor

import typings.randomcolor.randomcolorStrings.bright
import typings.randomcolor.randomcolorStrings.dark
import typings.randomcolor.randomcolorStrings.hex
import typings.randomcolor.randomcolorStrings.hsl
import typings.randomcolor.randomcolorStrings.hslArray
import typings.randomcolor.randomcolorStrings.hsla
import typings.randomcolor.randomcolorStrings.hsvArray
import typings.randomcolor.randomcolorStrings.light
import typings.randomcolor.randomcolorStrings.random
import typings.randomcolor.randomcolorStrings.rgb
import typings.randomcolor.randomcolorStrings.rgbArray
import typings.randomcolor.randomcolorStrings.rgba
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("randomcolor", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("randomcolor", JSImport.Namespace)
  @js.native
  def apply(options: RandomColorOptionsMultiple): js.Array[String] = js.native
  @JSImport("randomcolor", JSImport.Namespace)
  @js.native
  def apply(options: RandomColorOptionsSingle): String = js.native
  
  @js.native
  trait RandomColorOptionsMultiple extends RandomColorOptionsSingle {
    
    var count: Double = js.native
  }
  object RandomColorOptionsMultiple {
    
    @scala.inline
    def apply(count: Double): RandomColorOptionsMultiple = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandomColorOptionsMultiple]
    }
    
    @scala.inline
    implicit class RandomColorOptionsMultipleMutableBuilder[Self <: RandomColorOptionsMultiple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RandomColorOptionsSingle extends StObject {
    
    var alpha: js.UndefOr[Double] = js.native
    
    var format: js.UndefOr[hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex] = js.native
    
    var hue: js.UndefOr[Double | String] = js.native
    
    var luminosity: js.UndefOr[bright | light | dark | random] = js.native
    
    var seed: js.UndefOr[Double | String] = js.native
  }
  object RandomColorOptionsSingle {
    
    @scala.inline
    def apply(): RandomColorOptionsSingle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomColorOptionsSingle]
    }
    
    @scala.inline
    implicit class RandomColorOptionsSingleMutableBuilder[Self <: RandomColorOptionsSingle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setFormat(value: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHue(value: Double | String): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      @scala.inline
      def setLuminosity(value: bright | light | dark | random): Self = StObject.set(x, "luminosity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuminosityUndefined: Self = StObject.set(x, "luminosity", js.undefined)
      
      @scala.inline
      def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
