package typings.pulumiAws.topicPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicPolicyState extends js.Object {
  
  /**
    * The ARN of the SNS topic
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The fully-formed AWS policy as JSON.
    */
  val policy: js.UndefOr[Input[String]] = js.native
}
object TopicPolicyState {
  
  @scala.inline
  def apply(): TopicPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicPolicyState]
  }
  
  @scala.inline
  implicit class TopicPolicyStateOps[Self <: TopicPolicyState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
