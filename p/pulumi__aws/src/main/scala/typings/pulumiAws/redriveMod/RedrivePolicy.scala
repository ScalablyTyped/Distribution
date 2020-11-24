package typings.pulumiAws.redriveMod

import typings.pulumiAws.arnMod.ARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedrivePolicy extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of
    * `maxReceiveCount` is exceeded.
    */
  var deadLetterTargetArn: ARN = js.native
  
  /**
    * The number of times a message is delivered to the source queue before being moved to the dead-letter queue.
    *
    * Note: The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a
    * standard queue must also be a standard queue.
    */
  var maxReceiveCount: Double = js.native
}
object RedrivePolicy {
  
  @scala.inline
  def apply(deadLetterTargetArn: ARN, maxReceiveCount: Double): RedrivePolicy = {
    val __obj = js.Dynamic.literal(deadLetterTargetArn = deadLetterTargetArn.asInstanceOf[js.Any], maxReceiveCount = maxReceiveCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedrivePolicy]
  }
  
  @scala.inline
  implicit class RedrivePolicyOps[Self <: RedrivePolicy] (val x: Self) extends AnyVal {
    
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
    def setDeadLetterTargetArn(value: ARN): Self = this.set("deadLetterTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReceiveCount(value: Double): Self = this.set("maxReceiveCount", value.asInstanceOf[js.Any])
  }
}
