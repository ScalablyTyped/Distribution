package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchDocumentsResponse extends StObject {
  
  /**
    *
    * @type {Array<DocumentStatus>}
    * @memberof PatchDocumentsResponse
    */
  var data: js.Array[DocumentStatus]
}
object PatchDocumentsResponse {
  
  inline def apply(data: js.Array[DocumentStatus]): PatchDocumentsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchDocumentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchDocumentsResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[DocumentStatus]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: DocumentStatus*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
