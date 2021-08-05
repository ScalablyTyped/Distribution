package typings.shevyjs

import typings.shevyjs.shevyjsStrings.augmentedFourth
import typings.shevyjs.shevyjsStrings.majorSecond
import typings.shevyjs.shevyjsStrings.majorThird
import typings.shevyjs.shevyjsStrings.minorThird
import typings.shevyjs.shevyjsStrings.perfectFourth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Factor = Double
  
  trait FontScalePresets extends StObject {
    
    var augmentedFourth: Scale
    
    var majorSecond: Scale
    
    var majorThird: Scale
    
    var minorThird: Scale
    
    var perfectFourth: Scale
  }
  object FontScalePresets {
    
    inline def apply(
      augmentedFourth: Scale,
      majorSecond: Scale,
      majorThird: Scale,
      minorThird: Scale,
      perfectFourth: Scale
    ): FontScalePresets = {
      val __obj = js.Dynamic.literal(augmentedFourth = augmentedFourth.asInstanceOf[js.Any], majorSecond = majorSecond.asInstanceOf[js.Any], majorThird = majorThird.asInstanceOf[js.Any], minorThird = minorThird.asInstanceOf[js.Any], perfectFourth = perfectFourth.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontScalePresets]
    }
    
    extension [Self <: FontScalePresets](x: Self) {
      
      inline def setAugmentedFourth(value: Scale): Self = StObject.set(x, "augmentedFourth", value.asInstanceOf[js.Any])
      
      inline def setAugmentedFourthVarargs(value: Factor*): Self = StObject.set(x, "augmentedFourth", js.Array(value :_*))
      
      inline def setMajorSecond(value: Scale): Self = StObject.set(x, "majorSecond", value.asInstanceOf[js.Any])
      
      inline def setMajorSecondVarargs(value: Factor*): Self = StObject.set(x, "majorSecond", js.Array(value :_*))
      
      inline def setMajorThird(value: Scale): Self = StObject.set(x, "majorThird", value.asInstanceOf[js.Any])
      
      inline def setMajorThirdVarargs(value: Factor*): Self = StObject.set(x, "majorThird", js.Array(value :_*))
      
      inline def setMinorThird(value: Scale): Self = StObject.set(x, "minorThird", value.asInstanceOf[js.Any])
      
      inline def setMinorThirdVarargs(value: Factor*): Self = StObject.set(x, "minorThird", js.Array(value :_*))
      
      inline def setPerfectFourth(value: Scale): Self = StObject.set(x, "perfectFourth", value.asInstanceOf[js.Any])
      
      inline def setPerfectFourthVarargs(value: Factor*): Self = StObject.set(x, "perfectFourth", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shevyjs.shevyjsStrings.h1
    - typings.shevyjs.shevyjsStrings.h2
    - typings.shevyjs.shevyjsStrings.h3
    - typings.shevyjs.shevyjsStrings.h4
    - typings.shevyjs.shevyjsStrings.h5
    - typings.shevyjs.shevyjsStrings.h6
  */
  trait Heading extends StObject
  object Heading {
    
    inline def h1: typings.shevyjs.shevyjsStrings.h1 = "h1".asInstanceOf[typings.shevyjs.shevyjsStrings.h1]
    
    inline def h2: typings.shevyjs.shevyjsStrings.h2 = "h2".asInstanceOf[typings.shevyjs.shevyjsStrings.h2]
    
    inline def h3: typings.shevyjs.shevyjsStrings.h3 = "h3".asInstanceOf[typings.shevyjs.shevyjsStrings.h3]
    
    inline def h4: typings.shevyjs.shevyjsStrings.h4 = "h4".asInstanceOf[typings.shevyjs.shevyjsStrings.h4]
    
    inline def h5: typings.shevyjs.shevyjsStrings.h5 = "h5".asInstanceOf[typings.shevyjs.shevyjsStrings.h5]
    
    inline def h6: typings.shevyjs.shevyjsStrings.h6 = "h6".asInstanceOf[typings.shevyjs.shevyjsStrings.h6]
  }
  
  trait Options extends StObject {
    
    var addMarginBottom: Boolean
    
    var baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth
    
    var baseFontSize: String
    
    var baseLineHeight: Double
    
    var proximity: Boolean
    
    var proximityFactor: Factor
  }
  object Options {
    
    inline def apply(
      addMarginBottom: Boolean,
      baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth,
      baseFontSize: String,
      baseLineHeight: Double,
      proximity: Boolean,
      proximityFactor: Factor
    ): Options = {
      val __obj = js.Dynamic.literal(addMarginBottom = addMarginBottom.asInstanceOf[js.Any], baseFontScale = baseFontScale.asInstanceOf[js.Any], baseFontSize = baseFontSize.asInstanceOf[js.Any], baseLineHeight = baseLineHeight.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], proximityFactor = proximityFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddMarginBottom(value: Boolean): Self = StObject.set(x, "addMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setBaseFontScale(value: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): Self = StObject.set(x, "baseFontScale", value.asInstanceOf[js.Any])
      
      inline def setBaseFontScaleVarargs(value: Factor*): Self = StObject.set(x, "baseFontScale", js.Array(value :_*))
      
      inline def setBaseFontSize(value: String): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      inline def setBaseLineHeight(value: Double): Self = StObject.set(x, "baseLineHeight", value.asInstanceOf[js.Any])
      
      inline def setProximity(value: Boolean): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
      
      inline def setProximityFactor(value: Factor): Self = StObject.set(x, "proximityFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait RhythmProperties extends StObject {
    
    var fontSize: String
    
    var lineHeight: Double
    
    var marginBottom: String
  }
  object RhythmProperties {
    
    inline def apply(fontSize: String, lineHeight: Double, marginBottom: String): RhythmProperties = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any])
      __obj.asInstanceOf[RhythmProperties]
    }
    
    extension [Self <: RhythmProperties](x: Self) {
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    }
  }
  
  type Scale = js.Array[Factor]
}
