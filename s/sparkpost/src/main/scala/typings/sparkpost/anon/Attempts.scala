package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attempts extends js.Object {
  
  var attempts: Double = js.native
  
  var batch_id: String = js.native
  
  var response_code: Double = js.native
  
  var ts: String = js.native
}
object Attempts {
  
  @scala.inline
  def apply(attempts: Double, batch_id: String, response_code: Double, ts: String): Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempts]
  }
  
  @scala.inline
  implicit class AttemptsOps[Self <: Attempts] (val x: Self) extends AnyVal {
    
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
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch_id(value: String): Self = this.set("batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_code(value: Double): Self = this.set("response_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: String): Self = this.set("ts", value.asInstanceOf[js.Any])
  }
}
