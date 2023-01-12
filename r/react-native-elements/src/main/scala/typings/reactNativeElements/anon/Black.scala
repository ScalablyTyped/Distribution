package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Black extends StObject {
  
  var black: FontFamily
  
  var bold: FontFamily
  
  var condensed: FontFamily
  
  var condensed_light: FontFamily
  
  var light: FontFamily
  
  var medium: FontFamily
  
  var regular: FontFamily
  
  var thin: FontFamily
}
object Black {
  
  inline def apply(
    black: FontFamily,
    bold: FontFamily,
    condensed: FontFamily,
    condensed_light: FontFamily,
    light: FontFamily,
    medium: FontFamily,
    regular: FontFamily,
    thin: FontFamily
  ): Black = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], condensed = condensed.asInstanceOf[js.Any], condensed_light = condensed_light.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], thin = thin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Black]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Black] (val x: Self) extends AnyVal {
    
    inline def setBlack(value: FontFamily): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    inline def setBold(value: FontFamily): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setCondensed(value: FontFamily): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
    
    inline def setCondensed_light(value: FontFamily): Self = StObject.set(x, "condensed_light", value.asInstanceOf[js.Any])
    
    inline def setLight(value: FontFamily): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: FontFamily): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setRegular(value: FontFamily): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setThin(value: FontFamily): Self = StObject.set(x, "thin", value.asInstanceOf[js.Any])
  }
}
