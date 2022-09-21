package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginRight extends StObject {
  
  var marginRight: Double
  
  var marginVertical: js.UndefOr[Double] = js.undefined
}
object MarginRight {
  
  inline def apply(marginRight: Double): MarginRight = {
    val __obj = js.Dynamic.literal(marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginRight]
  }
  
  extension [Self <: MarginRight](x: Self) {
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginVertical(value: Double): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
    
    inline def setMarginVerticalUndefined: Self = StObject.set(x, "marginVertical", js.undefined)
  }
}
