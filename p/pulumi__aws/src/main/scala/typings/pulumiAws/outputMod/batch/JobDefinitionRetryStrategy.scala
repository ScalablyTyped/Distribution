package typings.pulumiAws.outputMod.batch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDefinitionRetryStrategy extends js.Object {
  
  /**
    * The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
    */
  var attempts: js.UndefOr[Double] = js.native
}
object JobDefinitionRetryStrategy {
  
  @scala.inline
  def apply(): JobDefinitionRetryStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDefinitionRetryStrategy]
  }
  
  @scala.inline
  implicit class JobDefinitionRetryStrategyOps[Self <: JobDefinitionRetryStrategy] (val x: Self) extends AnyVal {
    
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
    def deleteAttempts: Self = this.set("attempts", js.undefined)
  }
}
