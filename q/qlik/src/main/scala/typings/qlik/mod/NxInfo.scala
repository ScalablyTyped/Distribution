package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxInfo extends js.Object {
  
  var qId: String = js.native
  
  var qType: String = js.native
}
object NxInfo {
  
  @scala.inline
  def apply(qId: String, qType: String): NxInfo = {
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInfo]
  }
  
  @scala.inline
  implicit class NxInfoOps[Self <: NxInfo] (val x: Self) extends AnyVal {
    
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
    def setQId(value: String): Self = this.set("qId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: String): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
}
