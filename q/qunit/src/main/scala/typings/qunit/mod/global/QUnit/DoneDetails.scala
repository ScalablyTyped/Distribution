package typings.qunit.mod.global.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoneDetails extends js.Object {
  
  var failed: Double = js.native
  
  var passed: Double = js.native
  
  var runtime: Double = js.native
  
  var total: Double = js.native
}
object DoneDetails {
  
  @scala.inline
  def apply(failed: Double, passed: Double, runtime: Double, total: Double): DoneDetails = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneDetails]
  }
  
  @scala.inline
  implicit class DoneDetailsOps[Self <: DoneDetails] (val x: Self) extends AnyVal {
    
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
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassed(value: Double): Self = this.set("passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: Double): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
