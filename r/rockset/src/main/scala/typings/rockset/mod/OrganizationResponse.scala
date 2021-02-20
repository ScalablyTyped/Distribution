package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationResponse extends StObject {
  
  // Organization object
  var data: js.UndefOr[Organization] = js.native
}
object OrganizationResponse {
  
  @scala.inline
  def apply(): OrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationResponse]
  }
  
  @scala.inline
  implicit class OrganizationResponseMutableBuilder[Self <: OrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Organization): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
