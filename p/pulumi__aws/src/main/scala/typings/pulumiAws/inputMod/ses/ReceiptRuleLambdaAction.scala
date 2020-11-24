package typings.pulumiAws.inputMod.ses

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptRuleLambdaAction extends js.Object {
  
  /**
    * The ARN of the Lambda function to invoke
    */
  var functionArn: Input[String] = js.native
  
  /**
    * Event or RequestResponse
    */
  var invocationType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double] = js.native
  
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[Input[String]] = js.native
}
object ReceiptRuleLambdaAction {
  
  @scala.inline
  def apply(functionArn: Input[String], position: Input[Double]): ReceiptRuleLambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleLambdaAction]
  }
  
  @scala.inline
  implicit class ReceiptRuleLambdaActionOps[Self <: ReceiptRuleLambdaAction] (val x: Self) extends AnyVal {
    
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
    def setFunctionArn(value: Input[String]): Self = this.set("functionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Input[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationType(value: Input[String]): Self = this.set("invocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationType: Self = this.set("invocationType", js.undefined)
    
    @scala.inline
    def setTopicArn(value: Input[String]): Self = this.set("topicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicArn: Self = this.set("topicArn", js.undefined)
  }
}
