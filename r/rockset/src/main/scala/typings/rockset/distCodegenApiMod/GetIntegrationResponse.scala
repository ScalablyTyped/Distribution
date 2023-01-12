package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationResponse extends StObject {
  
  /**
    *
    * @type {Array<Collection>}
    * @memberof GetIntegrationResponse
    */
  var collections: js.UndefOr[js.Array[Collection]] = js.undefined
  
  /**
    * integration object
    * @type {Integration}
    * @memberof GetIntegrationResponse
    */
  var data: js.UndefOr[Integration] = js.undefined
}
object GetIntegrationResponse {
  
  inline def apply(): GetIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntegrationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIntegrationResponse] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: js.Array[Collection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setCollectionsVarargs(value: Collection*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setData(value: Integration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
