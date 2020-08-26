package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Function...
  */
@js.native
trait IFunction extends js.Object {
  /**
    * Group of the script function.
    */
  var qGroup: FunctionGroupType = js.native
  /**
    * Name of the script function.
    */
  var qName: String = js.native
  /**
    * Signature of the script function.
    * Gives general information about the function.
    */
  var qSignature: String = js.native
}

object IFunction {
  @scala.inline
  def apply(qGroup: FunctionGroupType, qName: String, qSignature: String): IFunction = {
    val __obj = js.Dynamic.literal(qGroup = qGroup.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qSignature = qSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunction]
  }
  @scala.inline
  implicit class IFunctionOps[Self <: IFunction] (val x: Self) extends AnyVal {
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
    def setQGroup(value: FunctionGroupType): Self = this.set("qGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSignature(value: String): Self = this.set("qSignature", value.asInstanceOf[js.Any])
  }
  
}

