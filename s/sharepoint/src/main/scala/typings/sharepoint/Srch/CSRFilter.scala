package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSRFilter extends StObject {
  
  var IsSelected: Boolean
  
  var RefinementCount: Double
  
  var RefinementName: String
  
  var RefinementToken: String
}
object CSRFilter {
  
  inline def apply(IsSelected: Boolean, RefinementCount: Double, RefinementName: String, RefinementToken: String): CSRFilter = {
    val __obj = js.Dynamic.literal(IsSelected = IsSelected.asInstanceOf[js.Any], RefinementCount = RefinementCount.asInstanceOf[js.Any], RefinementName = RefinementName.asInstanceOf[js.Any], RefinementToken = RefinementToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRFilter]
  }
  
  extension [Self <: CSRFilter](x: Self) {
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "IsSelected", value.asInstanceOf[js.Any])
    
    inline def setRefinementCount(value: Double): Self = StObject.set(x, "RefinementCount", value.asInstanceOf[js.Any])
    
    inline def setRefinementName(value: String): Self = StObject.set(x, "RefinementName", value.asInstanceOf[js.Any])
    
    inline def setRefinementToken(value: String): Self = StObject.set(x, "RefinementToken", value.asInstanceOf[js.Any])
  }
}
