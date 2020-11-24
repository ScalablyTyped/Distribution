package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPatch...
  */
@js.native
trait INxPatch extends js.Object {
  
  /**
    * Operation to perform.
    */
  var qOp: NxPatchOpType = js.native
  
  /**
    * Path to the property to add, remove or replace.
    */
  var qPath: String = js.native
  
  /**
    * This parameter is not used in a remove operation.
    * Corresponds to the value of the property to add or to the new value of the property to update.
    *
    * Examples: "false", "2", "\"New title\""
    */
  var qValue: String = js.native
}
object INxPatch {
  
  @scala.inline
  def apply(qOp: NxPatchOpType, qPath: String, qValue: String): INxPatch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPatch]
  }
  
  @scala.inline
  implicit class INxPatchOps[Self <: INxPatch] (val x: Self) extends AnyVal {
    
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
    def setQOp(value: NxPatchOpType): Self = this.set("qOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPath(value: String): Self = this.set("qPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: String): Self = this.set("qValue", value.asInstanceOf[js.Any])
  }
}
