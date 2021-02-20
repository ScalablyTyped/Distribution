package typings.pulumiAws

import typings.pulumiAws.outputMod.ses.ReceiptRuleAddHeaderAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleBounceAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleLambdaAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleS3Action
import typings.pulumiAws.outputMod.ses.ReceiptRuleSnsAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleStopAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleWorkmailAction
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiptRuleMod {
  
  @JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule")
  @js.native
  class ReceiptRule protected () extends CustomResource {
    /**
      * Create a ReceiptRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptRuleArgs) = this()
    def this(name: String, args: ReceiptRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of Add Header Action blocks. Documented below.
      */
    val addHeaderActions: Output_[js.UndefOr[js.Array[ReceiptRuleAddHeaderAction]]] = js.native
    
    /**
      * The name of the rule to place this rule after
      */
    val after: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of Bounce Action blocks. Documented below.
      */
    val bounceActions: Output_[js.UndefOr[js.Array[ReceiptRuleBounceAction]]] = js.native
    
    /**
      * If true, the rule will be enabled
      */
    val enabled: Output_[Boolean] = js.native
    
    /**
      * A list of Lambda Action blocks. Documented below.
      */
    val lambdaActions: Output_[js.UndefOr[js.Array[ReceiptRuleLambdaAction]]] = js.native
    
    /**
      * The name of the rule
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of email addresses
      */
    val recipients: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Output_[String] = js.native
    
    /**
      * A list of S3 Action blocks. Documented below.
      */
    val s3Actions: Output_[js.UndefOr[js.Array[ReceiptRuleS3Action]]] = js.native
    
    /**
      * If true, incoming emails will be scanned for spam and viruses
      */
    val scanEnabled: Output_[Boolean] = js.native
    
    /**
      * A list of SNS Action blocks. Documented below.
      */
    val snsActions: Output_[js.UndefOr[js.Array[ReceiptRuleSnsAction]]] = js.native
    
    /**
      * A list of Stop Action blocks. Documented below.
      */
    val stopActions: Output_[js.UndefOr[js.Array[ReceiptRuleStopAction]]] = js.native
    
    /**
      * Require or Optional
      */
    val tlsPolicy: Output_[String] = js.native
    
    /**
      * A list of WorkMail Action blocks. Documented below.
      */
    val workmailActions: Output_[js.UndefOr[js.Array[ReceiptRuleWorkmailAction]]] = js.native
  }
  /* static members */
  object ReceiptRule {
    
    /**
      * Get an existing ReceiptRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID]): ReceiptRule = js.native
    @JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReceiptRule = js.native
    @JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState): ReceiptRule = js.native
    @JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState, opts: CustomResourceOptions): ReceiptRule = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean = js.native
  }
  
  @js.native
  trait ReceiptRuleArgs extends StObject {
    
    /**
      * A list of Add Header Action blocks. Documented below.
      */
    val addHeaderActions: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction]]]
      ] = js.native
    
    /**
      * The name of the rule to place this rule after
      */
    val after: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of Bounce Action blocks. Documented below.
      */
    val bounceActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleBounceAction]]]] = js.native
    
    /**
      * If true, the rule will be enabled
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A list of Lambda Action blocks. Documented below.
      */
    val lambdaActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction]]]] = js.native
    
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
    val ruleSetName: Input[String] = js.native
    
    /**
      * A list of S3 Action blocks. Documented below.
      */
    val s3Actions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleS3Action]]]] = js.native
    
    /**
      * If true, incoming emails will be scanned for spam and viruses
      */
    val scanEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A list of SNS Action blocks. Documented below.
      */
    val snsActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleSnsAction]]]] = js.native
    
    /**
      * A list of Stop Action blocks. Documented below.
      */
    val stopActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleStopAction]]]] = js.native
    
    /**
      * Require or Optional
      */
    val tlsPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of WorkMail Action blocks. Documented below.
      */
    val workmailActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction]]]] = js.native
  }
  object ReceiptRuleArgs {
    
    @scala.inline
    def apply(ruleSetName: Input[String]): ReceiptRuleArgs = {
      val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleArgs]
    }
    
    @scala.inline
    implicit class ReceiptRuleArgsMutableBuilder[Self <: ReceiptRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHeaderActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction]]]): Self = StObject.set(x, "addHeaderActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddHeaderActionsUndefined: Self = StObject.set(x, "addHeaderActions", js.undefined)
      
      @scala.inline
      def setAddHeaderActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction]*): Self = StObject.set(x, "addHeaderActions", js.Array(value :_*))
      
      @scala.inline
      def setAfter(value: Input[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBounceActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleBounceAction]]]): Self = StObject.set(x, "bounceActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceActionsUndefined: Self = StObject.set(x, "bounceActions", js.undefined)
      
      @scala.inline
      def setBounceActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleBounceAction]*): Self = StObject.set(x, "bounceActions", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setLambdaActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction]]]): Self = StObject.set(x, "lambdaActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaActionsUndefined: Self = StObject.set(x, "lambdaActions", js.undefined)
      
      @scala.inline
      def setLambdaActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction]*): Self = StObject.set(x, "lambdaActions", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRecipients(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      @scala.inline
      def setRecipientsVarargs(value: Input[String]*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Actions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleS3Action]]]): Self = StObject.set(x, "s3Actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ActionsUndefined: Self = StObject.set(x, "s3Actions", js.undefined)
      
      @scala.inline
      def setS3ActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleS3Action]*): Self = StObject.set(x, "s3Actions", js.Array(value :_*))
      
      @scala.inline
      def setScanEnabled(value: Input[Boolean]): Self = StObject.set(x, "scanEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanEnabledUndefined: Self = StObject.set(x, "scanEnabled", js.undefined)
      
      @scala.inline
      def setSnsActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleSnsAction]]]): Self = StObject.set(x, "snsActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsActionsUndefined: Self = StObject.set(x, "snsActions", js.undefined)
      
      @scala.inline
      def setSnsActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleSnsAction]*): Self = StObject.set(x, "snsActions", js.Array(value :_*))
      
      @scala.inline
      def setStopActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleStopAction]]]): Self = StObject.set(x, "stopActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopActionsUndefined: Self = StObject.set(x, "stopActions", js.undefined)
      
      @scala.inline
      def setStopActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleStopAction]*): Self = StObject.set(x, "stopActions", js.Array(value :_*))
      
      @scala.inline
      def setTlsPolicy(value: Input[String]): Self = StObject.set(x, "tlsPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsPolicyUndefined: Self = StObject.set(x, "tlsPolicy", js.undefined)
      
      @scala.inline
      def setWorkmailActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction]]]): Self = StObject.set(x, "workmailActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkmailActionsUndefined: Self = StObject.set(x, "workmailActions", js.undefined)
      
      @scala.inline
      def setWorkmailActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction]*): Self = StObject.set(x, "workmailActions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReceiptRuleState extends StObject {
    
    /**
      * A list of Add Header Action blocks. Documented below.
      */
    val addHeaderActions: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction]]]
      ] = js.native
    
    /**
      * The name of the rule to place this rule after
      */
    val after: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of Bounce Action blocks. Documented below.
      */
    val bounceActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleBounceAction]]]] = js.native
    
    /**
      * If true, the rule will be enabled
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A list of Lambda Action blocks. Documented below.
      */
    val lambdaActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction]]]] = js.native
    
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
    val s3Actions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleS3Action]]]] = js.native
    
    /**
      * If true, incoming emails will be scanned for spam and viruses
      */
    val scanEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A list of SNS Action blocks. Documented below.
      */
    val snsActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleSnsAction]]]] = js.native
    
    /**
      * A list of Stop Action blocks. Documented below.
      */
    val stopActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleStopAction]]]] = js.native
    
    /**
      * Require or Optional
      */
    val tlsPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of WorkMail Action blocks. Documented below.
      */
    val workmailActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction]]]] = js.native
  }
  object ReceiptRuleState {
    
    @scala.inline
    def apply(): ReceiptRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReceiptRuleState]
    }
    
    @scala.inline
    implicit class ReceiptRuleStateMutableBuilder[Self <: ReceiptRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHeaderActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction]]]): Self = StObject.set(x, "addHeaderActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddHeaderActionsUndefined: Self = StObject.set(x, "addHeaderActions", js.undefined)
      
      @scala.inline
      def setAddHeaderActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction]*): Self = StObject.set(x, "addHeaderActions", js.Array(value :_*))
      
      @scala.inline
      def setAfter(value: Input[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBounceActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleBounceAction]]]): Self = StObject.set(x, "bounceActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceActionsUndefined: Self = StObject.set(x, "bounceActions", js.undefined)
      
      @scala.inline
      def setBounceActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleBounceAction]*): Self = StObject.set(x, "bounceActions", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setLambdaActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction]]]): Self = StObject.set(x, "lambdaActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaActionsUndefined: Self = StObject.set(x, "lambdaActions", js.undefined)
      
      @scala.inline
      def setLambdaActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction]*): Self = StObject.set(x, "lambdaActions", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRecipients(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      @scala.inline
      def setRecipientsVarargs(value: Input[String]*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleSetNameUndefined: Self = StObject.set(x, "ruleSetName", js.undefined)
      
      @scala.inline
      def setS3Actions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleS3Action]]]): Self = StObject.set(x, "s3Actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ActionsUndefined: Self = StObject.set(x, "s3Actions", js.undefined)
      
      @scala.inline
      def setS3ActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleS3Action]*): Self = StObject.set(x, "s3Actions", js.Array(value :_*))
      
      @scala.inline
      def setScanEnabled(value: Input[Boolean]): Self = StObject.set(x, "scanEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanEnabledUndefined: Self = StObject.set(x, "scanEnabled", js.undefined)
      
      @scala.inline
      def setSnsActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleSnsAction]]]): Self = StObject.set(x, "snsActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsActionsUndefined: Self = StObject.set(x, "snsActions", js.undefined)
      
      @scala.inline
      def setSnsActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleSnsAction]*): Self = StObject.set(x, "snsActions", js.Array(value :_*))
      
      @scala.inline
      def setStopActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleStopAction]]]): Self = StObject.set(x, "stopActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopActionsUndefined: Self = StObject.set(x, "stopActions", js.undefined)
      
      @scala.inline
      def setStopActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleStopAction]*): Self = StObject.set(x, "stopActions", js.Array(value :_*))
      
      @scala.inline
      def setTlsPolicy(value: Input[String]): Self = StObject.set(x, "tlsPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsPolicyUndefined: Self = StObject.set(x, "tlsPolicy", js.undefined)
      
      @scala.inline
      def setWorkmailActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction]]]): Self = StObject.set(x, "workmailActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkmailActionsUndefined: Self = StObject.set(x, "workmailActions", js.undefined)
      
      @scala.inline
      def setWorkmailActionsVarargs(value: Input[typings.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction]*): Self = StObject.set(x, "workmailActions", js.Array(value :_*))
    }
  }
}
