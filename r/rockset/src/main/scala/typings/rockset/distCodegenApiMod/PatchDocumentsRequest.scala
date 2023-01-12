package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchDocumentsRequest extends StObject {
  
  /**
    * List of JSON Patch Documents
    * @type {Array<PatchDocument>}
    * @memberof PatchDocumentsRequest
    */
  var data: js.Array[PatchDocument]
}
object PatchDocumentsRequest {
  
  inline def apply(data: js.Array[PatchDocument]): PatchDocumentsRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchDocumentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchDocumentsRequest] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[PatchDocument]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: PatchDocument*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
