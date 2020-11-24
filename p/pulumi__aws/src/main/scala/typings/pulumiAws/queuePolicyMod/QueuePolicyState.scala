package typings.pulumiAws.queuePolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueuePolicyState extends js.Object {
  
  /**
    * The JSON policy for the SQS queue.
    */
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: js.UndefOr[Input[String]] = js.native
}
object QueuePolicyState {
  
  @scala.inline
  def apply(): QueuePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueuePolicyState]
  }
  
  @scala.inline
  implicit class QueuePolicyStateOps[Self <: QueuePolicyState] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: Input[String | PolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setQueueUrl(value: Input[String]): Self = this.set("queueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueUrl: Self = this.set("queueUrl", js.undefined)
  }
}
