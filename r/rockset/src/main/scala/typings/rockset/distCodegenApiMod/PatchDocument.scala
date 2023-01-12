package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchDocument extends StObject {
  
  /**
    * Unique id of the document which is being patched
    * @type {string}
    * @memberof PatchDocument
    */
  var _id: String
  
  /**
    * List of patch operations
    * @type {Array<PatchOperation>}
    * @memberof PatchDocument
    */
  var patch: js.Array[PatchOperation]
}
object PatchDocument {
  
  inline def apply(_id: String, patch: js.Array[PatchOperation]): PatchDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchDocument] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: js.Array[PatchOperation]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchVarargs(value: PatchOperation*): Self = StObject.set(x, "patch", js.Array(value*))
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
