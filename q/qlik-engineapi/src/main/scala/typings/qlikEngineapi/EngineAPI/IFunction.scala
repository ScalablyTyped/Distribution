package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function...
  */
trait IFunction extends StObject {
  
  /**
    * Group of the script function.
    */
  var qGroup: FunctionGroupType
  
  /**
    * Name of the script function.
    */
  var qName: String
  
  /**
    * Signature of the script function.
    * Gives general information about the function.
    */
  var qSignature: String
}
object IFunction {
  
  inline def apply(qGroup: FunctionGroupType, qName: String, qSignature: String): IFunction = {
    val __obj = js.Dynamic.literal(qGroup = qGroup.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qSignature = qSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunction]
  }
  
  extension [Self <: IFunction](x: Self) {
    
    inline def setQGroup(value: FunctionGroupType): Self = StObject.set(x, "qGroup", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQSignature(value: String): Self = StObject.set(x, "qSignature", value.asInstanceOf[js.Any])
  }
}
