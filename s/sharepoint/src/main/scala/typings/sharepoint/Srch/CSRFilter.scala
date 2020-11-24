package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSRFilter extends js.Object {
  
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
  implicit class CSRFilterOps[Self <: CSRFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("IsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementCount(value: Double): Self = this.set("RefinementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementName(value: String): Self = this.set("RefinementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementToken(value: String): Self = this.set("RefinementToken", value.asInstanceOf[js.Any])
  }
}
