package typings.pulumiAws.receiptRuleMod

import typings.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction
import typings.pulumiAws.inputMod.ses.ReceiptRuleBounceAction
import typings.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction
import typings.pulumiAws.inputMod.ses.ReceiptRuleS3Action
import typings.pulumiAws.inputMod.ses.ReceiptRuleSnsAction
import typings.pulumiAws.inputMod.ses.ReceiptRuleStopAction
import typings.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptRuleState extends js.Object {
  
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleAddHeaderAction]]]] = js.native
  
  /**
    * The name of the rule to place this rule after
    */
  val after: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleBounceAction]]]] = js.native
  
  /**
    * If true, the rule will be enabled
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleLambdaAction]]]] = js.native
  
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of email addresses
    */
  val recipients: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: js.UndefOr[Input[js.Array[Input[ReceiptRuleS3Action]]]] = js.native
  
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleSnsAction]]]] = js.native
  
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleStopAction]]]] = js.native
  
  /**
    * Require or Optional
    */
  val tlsPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleWorkmailAction]]]] = js.native
}
object ReceiptRuleState {
  
  @scala.inline
  def apply(): ReceiptRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptRuleState]
  }
  
  @scala.inline
  implicit class ReceiptRuleStateOps[Self <: ReceiptRuleState] (val x: Self) extends AnyVal {
    
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
    def setAddHeaderActionsVarargs(value: Input[ReceiptRuleAddHeaderAction]*): Self = this.set("addHeaderActions", js.Array(value :_*))
    
    @scala.inline
    def setAddHeaderActions(value: Input[js.Array[Input[ReceiptRuleAddHeaderAction]]]): Self = this.set("addHeaderActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddHeaderActions: Self = this.set("addHeaderActions", js.undefined)
    
    @scala.inline
    def setAfter(value: Input[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBounceActionsVarargs(value: Input[ReceiptRuleBounceAction]*): Self = this.set("bounceActions", js.Array(value :_*))
    
    @scala.inline
    def setBounceActions(value: Input[js.Array[Input[ReceiptRuleBounceAction]]]): Self = this.set("bounceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceActions: Self = this.set("bounceActions", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setLambdaActionsVarargs(value: Input[ReceiptRuleLambdaAction]*): Self = this.set("lambdaActions", js.Array(value :_*))
    
    @scala.inline
    def setLambdaActions(value: Input[js.Array[Input[ReceiptRuleLambdaAction]]]): Self = this.set("lambdaActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaActions: Self = this.set("lambdaActions", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: Input[String]*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: Input[js.Array[Input[String]]]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setRuleSetName(value: Input[String]): Self = this.set("ruleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleSetName: Self = this.set("ruleSetName", js.undefined)
    
    @scala.inline
    def setS3ActionsVarargs(value: Input[ReceiptRuleS3Action]*): Self = this.set("s3Actions", js.Array(value :_*))
    
    @scala.inline
    def setS3Actions(value: Input[js.Array[Input[ReceiptRuleS3Action]]]): Self = this.set("s3Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Actions: Self = this.set("s3Actions", js.undefined)
    
    @scala.inline
    def setScanEnabled(value: Input[Boolean]): Self = this.set("scanEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanEnabled: Self = this.set("scanEnabled", js.undefined)
    
    @scala.inline
    def setSnsActionsVarargs(value: Input[ReceiptRuleSnsAction]*): Self = this.set("snsActions", js.Array(value :_*))
    
    @scala.inline
    def setSnsActions(value: Input[js.Array[Input[ReceiptRuleSnsAction]]]): Self = this.set("snsActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsActions: Self = this.set("snsActions", js.undefined)
    
    @scala.inline
    def setStopActionsVarargs(value: Input[ReceiptRuleStopAction]*): Self = this.set("stopActions", js.Array(value :_*))
    
    @scala.inline
    def setStopActions(value: Input[js.Array[Input[ReceiptRuleStopAction]]]): Self = this.set("stopActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopActions: Self = this.set("stopActions", js.undefined)
    
    @scala.inline
    def setTlsPolicy(value: Input[String]): Self = this.set("tlsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsPolicy: Self = this.set("tlsPolicy", js.undefined)
    
    @scala.inline
    def setWorkmailActionsVarargs(value: Input[ReceiptRuleWorkmailAction]*): Self = this.set("workmailActions", js.Array(value :_*))
    
    @scala.inline
    def setWorkmailActions(value: Input[js.Array[Input[ReceiptRuleWorkmailAction]]]): Self = this.set("workmailActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkmailActions: Self = this.set("workmailActions", js.undefined)
  }
}
