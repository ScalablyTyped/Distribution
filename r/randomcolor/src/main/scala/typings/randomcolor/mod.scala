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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  @scala.inline
  def apply(options: RandomColorOptionsMultiple): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(options: RandomColorOptionsSingle): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("randomcolor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RandomColorOptionsMultiple
    extends StObject
       with RandomColorOptionsSingle {
    
    var count: Double
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
  
  trait RandomColorOptionsSingle extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex] = js.undefined
    
    var hue: js.UndefOr[Double | String] = js.undefined
    
    var luminosity: js.UndefOr[bright | light | dark | random] = js.undefined
    
    var seed: js.UndefOr[Double | String] = js.undefined
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
