package typings.qunit.mod.global.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginDetails extends js.Object {
  
  var totalTests: Double = js.native
}
object BeginDetails {
  
  @scala.inline
  def apply(totalTests: Double): BeginDetails = {
    val __obj = js.Dynamic.literal(totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDetails]
  }
  
  @scala.inline
  implicit class BeginDetailsOps[Self <: BeginDetails] (val x: Self) extends AnyVal {
    
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
    def setTotalTests(value: Double): Self = this.set("totalTests", value.asInstanceOf[js.Any])
  }
}
