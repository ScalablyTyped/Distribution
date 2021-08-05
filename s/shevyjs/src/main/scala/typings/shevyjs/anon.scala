package typings.shevyjs

import typings.shevyjs.shevyjsStrings.augmentedFourth
import typings.shevyjs.shevyjsStrings.majorSecond
import typings.shevyjs.shevyjsStrings.majorThird
import typings.shevyjs.shevyjsStrings.minorThird
import typings.shevyjs.shevyjsStrings.perfectFourth
import typings.shevyjs.typesMod.Factor
import typings.shevyjs.typesMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<shevyjs.shevyjs/types.Options> */
  trait PartialOptions extends StObject {
    
    var addMarginBottom: js.UndefOr[Boolean] = js.undefined
    
    var baseFontScale: js.UndefOr[Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth] = js.undefined
    
    var baseFontSize: js.UndefOr[String] = js.undefined
    
    var baseLineHeight: js.UndefOr[Double] = js.undefined
    
    var proximity: js.UndefOr[Boolean] = js.undefined
    
    var proximityFactor: js.UndefOr[Factor] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAddMarginBottom(value: Boolean): Self = StObject.set(x, "addMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setAddMarginBottomUndefined: Self = StObject.set(x, "addMarginBottom", js.undefined)
      
      inline def setBaseFontScale(value: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): Self = StObject.set(x, "baseFontScale", value.asInstanceOf[js.Any])
      
      inline def setBaseFontScaleUndefined: Self = StObject.set(x, "baseFontScale", js.undefined)
      
      inline def setBaseFontScaleVarargs(value: Factor*): Self = StObject.set(x, "baseFontScale", js.Array(value :_*))
      
      inline def setBaseFontSize(value: String): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      inline def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
      
      inline def setBaseLineHeight(value: Double): Self = StObject.set(x, "baseLineHeight", value.asInstanceOf[js.Any])
      
      inline def setBaseLineHeightUndefined: Self = StObject.set(x, "baseLineHeight", js.undefined)
      
      inline def setProximity(value: Boolean): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
      
      inline def setProximityFactor(value: Factor): Self = StObject.set(x, "proximityFactor", value.asInstanceOf[js.Any])
      
      inline def setProximityFactorUndefined: Self = StObject.set(x, "proximityFactor", js.undefined)
      
      inline def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
    }
  }
  
  /* Inlined std.Pick<shevyjs.shevyjs/types.RhythmProperties, std.Exclude<keyof shevyjs.shevyjs/types.RhythmProperties, 'marginBottom'>> */
  trait PickRhythmPropertiesExclu extends StObject {
    
    var fontSize: String
    
    var lineHeight: Double
  }
  object PickRhythmPropertiesExclu {
    
    inline def apply(fontSize: String, lineHeight: Double): PickRhythmPropertiesExclu = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickRhythmPropertiesExclu]
    }
    
    extension [Self <: PickRhythmPropertiesExclu](x: Self) {
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
}
