package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntegrationsResponse extends StObject {
  
  /**
    * list of integration objects
    * @type {Array<Integration>}
    * @memberof ListIntegrationsResponse
    */
  var data: js.UndefOr[js.Array[Integration]] = js.undefined
}
object ListIntegrationsResponse {
  
  inline def apply(): ListIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIntegrationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIntegrationsResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Integration]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Integration*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
