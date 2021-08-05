package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxPatch extends StObject {
  
  /**
    * Operation to perform.
    * One of:
    *       # Add
    *       # Remove
    *       # Replace
    */
  var qOp: PatchType
  
  /**
    * Path to the property to add, remove or replace.
    * String
    */
  var qPath: String
  
  /**
    * This parameter is not used in a remove operation. Corresponds to the value of the
    * property to add or to the new value of the property to update.
    * Examples: "false", "2", "\"New title\""
    * String
    */
  var qValue: String
}
object INxPatch {
  
  inline def apply(qOp: PatchType, qPath: String, qValue: String): INxPatch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPatch]
  }
  
  extension [Self <: INxPatch](x: Self) {
    
    inline def setQOp(value: PatchType): Self = StObject.set(x, "qOp", value.asInstanceOf[js.Any])
    
    inline def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
