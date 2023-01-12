package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationResponse extends StObject {
  
  /**
    * Organization object
    * @type {Organization}
    * @memberof OrganizationResponse
    */
  var data: js.UndefOr[Organization] = js.undefined
}
object OrganizationResponse {
  
  inline def apply(): OrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Organization): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
