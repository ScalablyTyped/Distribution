package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPatch...
  */
trait INxPatch extends StObject {
  
  /**
    * Operation to perform.
    */
  var qOp: NxPatchOpType
  
  /**
    * Path to the property to add, remove or replace.
    */
  var qPath: String
  
  /**
    * This parameter is not used in a remove operation.
    * Corresponds to the value of the property to add or to the new value of the property to update.
    *
    * Examples: "false", "2", "\"New title\""
    */
  var qValue: String
}
object INxPatch {
  
  inline def apply(qOp: NxPatchOpType, qPath: String, qValue: String): INxPatch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxPatch] (val x: Self) extends AnyVal {
    
    inline def setQOp(value: NxPatchOpType): Self = StObject.set(x, "qOp", value.asInstanceOf[js.Any])
    
    inline def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
