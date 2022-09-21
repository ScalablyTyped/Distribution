package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffixHeight extends StObject {
  
  var affixHeight: Double
  
  var height: Double
  
  var paddingBottom: Double
  
  var paddingTop: Double
}
object AffixHeight {
  
  inline def apply(affixHeight: Double, height: Double, paddingBottom: Double, paddingTop: Double): AffixHeight = {
    val __obj = js.Dynamic.literal(affixHeight = affixHeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffixHeight]
  }
  
  extension [Self <: AffixHeight](x: Self) {
    
    inline def setAffixHeight(value: Double): Self = StObject.set(x, "affixHeight", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
  }
}
