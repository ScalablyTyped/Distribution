package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginLeft extends StObject {
  
  var marginLeft: Double
  
  var marginRight: Double
  
  var marginVertical: js.UndefOr[Double] = js.undefined
}
object MarginLeft {
  
  inline def apply(marginLeft: Double, marginRight: Double): MarginLeft = {
    val __obj = js.Dynamic.literal(marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeft]
  }
  
  extension [Self <: MarginLeft](x: Self) {
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginVertical(value: Double): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
    
    inline def setMarginVerticalUndefined: Self = StObject.set(x, "marginVertical", js.undefined)
  }
}
