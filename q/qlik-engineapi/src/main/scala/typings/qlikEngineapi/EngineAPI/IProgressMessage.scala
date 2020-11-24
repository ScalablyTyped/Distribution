package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ProgressMessage...
  */
@js.native
trait IProgressMessage extends js.Object {
  
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
  implicit class IProgressMessageOps[Self <: IProgressMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQMessageCode(value: Double): Self = this.set("qMessageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMessageParametersVarargs(value: String*): Self = this.set("qMessageParameters", js.Array(value :_*))
    
    @scala.inline
    def setQMessageParameters(value: js.Array[String]): Self = this.set("qMessageParameters", value.asInstanceOf[js.Any])
  }
}
