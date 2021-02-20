package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSRFilter extends StObject {
  
  var IsSelected: Boolean = js.native
  
  var RefinementCount: Double = js.native
  
  var RefinementName: String = js.native
  
  var RefinementToken: String = js.native
}
object CSRFilter {
  
  @scala.inline
  def apply(IsSelected: Boolean, RefinementCount: Double, RefinementName: String, RefinementToken: String): CSRFilter = {
    val __obj = js.Dynamic.literal(IsSelected = IsSelected.asInstanceOf[js.Any], RefinementCount = RefinementCount.asInstanceOf[js.Any], RefinementName = RefinementName.asInstanceOf[js.Any], RefinementToken = RefinementToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRFilter]
  }
  
  @scala.inline
  implicit class CSRFilterMutableBuilder[Self <: CSRFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "IsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementCount(value: Double): Self = StObject.set(x, "RefinementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementName(value: String): Self = StObject.set(x, "RefinementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementToken(value: String): Self = StObject.set(x, "RefinementToken", value.asInstanceOf[js.Any])
  }
}
