package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ProgressMessage...
  */
trait IProgressMessage extends StObject {
  
  /**
    * Code number to the corresponding localized message string.
    */
  var qMessageCode: Double
  
  /**
    * Parameters to be inserted in the localized message string.
    */
  var qMessageParameters: js.Array[String]
}
object IProgressMessage {
  
  inline def apply(qMessageCode: Double, qMessageParameters: js.Array[String]): IProgressMessage = {
    val __obj = js.Dynamic.literal(qMessageCode = qMessageCode.asInstanceOf[js.Any], qMessageParameters = qMessageParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressMessage]
  }
  
  extension [Self <: IProgressMessage](x: Self) {
    
    inline def setQMessageCode(value: Double): Self = StObject.set(x, "qMessageCode", value.asInstanceOf[js.Any])
    
    inline def setQMessageParameters(value: js.Array[String]): Self = StObject.set(x, "qMessageParameters", value.asInstanceOf[js.Any])
    
    inline def setQMessageParametersVarargs(value: String*): Self = StObject.set(x, "qMessageParameters", js.Array(value*))
  }
}
