package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ProgressMessage...
  */
@js.native
trait IProgressMessage extends StObject {
  
  /**
    * Code number to the corresponding localized message string.
    */
  var qMessageCode: Double = js.native
  
  /**
    * Parameters to be inserted in the localized message string.
    */
  var qMessageParameters: js.Array[String] = js.native
}
object IProgressMessage {
  
  @scala.inline
  def apply(qMessageCode: Double, qMessageParameters: js.Array[String]): IProgressMessage = {
    val __obj = js.Dynamic.literal(qMessageCode = qMessageCode.asInstanceOf[js.Any], qMessageParameters = qMessageParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressMessage]
  }
  
  @scala.inline
  implicit class IProgressMessageMutableBuilder[Self <: IProgressMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQMessageCode(value: Double): Self = StObject.set(x, "qMessageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMessageParameters(value: js.Array[String]): Self = StObject.set(x, "qMessageParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMessageParametersVarargs(value: String*): Self = StObject.set(x, "qMessageParameters", js.Array(value :_*))
  }
}
