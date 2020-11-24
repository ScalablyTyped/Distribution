package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxGroupTail
  */
@js.native
trait INxGroupTail extends js.Object {
  
  /**
    * Number of elements that are part of the next tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qDown: js.UndefOr[Double] = js.native
  
  /**
    * Number of elements that are part of the previous tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qUp: js.UndefOr[Double] = js.native
}
object INxGroupTail {
  
  @scala.inline
  def apply(): INxGroupTail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxGroupTail]
  }
  
  @scala.inline
  implicit class INxGroupTailOps[Self <: INxGroupTail] (val x: Self) extends AnyVal {
    
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
    def setQDown(value: Double): Self = this.set("qDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQDown: Self = this.set("qDown", js.undefined)
    
    @scala.inline
    def setQUp(value: Double): Self = this.set("qUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQUp: Self = this.set("qUp", js.undefined)
  }
}
