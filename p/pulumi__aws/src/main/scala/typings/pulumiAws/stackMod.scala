package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@pulumi/aws/cloudformation/stack", "Stack")
  @js.native
  class Stack protected () extends CustomResource {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of capabilities.
      * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
      */
    val capabilities: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Set to true to disable rollback of the stack if stack creation failed.
      * Conflicts with `onFailure`.
      */
    val disableRollback: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    val iamRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Stack name.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of SNS topic ARNs to publish stack related events.
      */
    val notificationArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Action to be taken if stack creation fails. This must be
      * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disableRollback`.
      */
    val onFailure: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of outputs from the stack.
      */
    val outputs: Output_[StringDictionary[String]] = js.native
    
    /**
      * A map of Parameter structures that specify input parameters for the stack.
      */
    val parameters: Output_[StringDictionary[String]] = js.native
    
    /**
      * Structure containing the stack policy body.
      * Conflicts w/ `policyUrl`.
      */
    val policyBody: Output_[String] = js.native
    
    /**
      * Location of a file containing the stack policy.
      * Conflicts w/ `policyBody`.
      */
    val policyUrl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of tags to associate with this stack.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Structure containing the template body (max size: 51,200 bytes).
      */
    val templateBody: Output_[String] = js.native
    
    /**
      * Location of a file containing the template body (max size: 460,800 bytes).
      */
    val templateUrl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
      */
    val timeoutInMinutes: Output_[js.UndefOr[Double]] = js.native
  }
  /* static members */
  object Stack {
    
    @JSImport("@pulumi/aws/cloudformation/stack", "Stack")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Stack]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Stack]
    inline def get(name: String, id: Input[ID], state: StackState): Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Stack]
    inline def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Stack]
    
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean]
  }
  
  trait StackArgs extends StObject {
    
    /**
      * A list of capabilities.
      * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
      */
    val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Set to true to disable rollback of the stack if stack creation failed.
      * Conflicts with `onFailure`.
      */
    val disableRollback: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    val iamRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Stack name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of SNS topic ARNs to publish stack related events.
      */
    val notificationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Action to be taken if stack creation fails. This must be
      * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disableRollback`.
      */
    val onFailure: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of Parameter structures that specify input parameters for the stack.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Structure containing the stack policy body.
      * Conflicts w/ `policyUrl`.
      */
    val policyBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Location of a file containing the stack policy.
      * Conflicts w/ `policyBody`.
      */
    val policyUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of tags to associate with this stack.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Structure containing the template body (max size: 51,200 bytes).
      */
    val templateBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Location of a file containing the template body (max size: 460,800 bytes).
      */
    val templateUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
      */
    val timeoutInMinutes: js.UndefOr[Input[Double]] = js.undefined
  }
  object StackArgs {
    
    inline def apply(): StackArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackArgs]
    }
    
    extension [Self <: StackArgs](x: Self) {
      
      inline def setCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      inline def setDisableRollback(value: Input[Boolean]): Self = StObject.set(x, "disableRollback", value.asInstanceOf[js.Any])
      
      inline def setDisableRollbackUndefined: Self = StObject.set(x, "disableRollback", js.undefined)
      
      inline def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotificationArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "notificationArns", value.asInstanceOf[js.Any])
      
      inline def setNotificationArnsUndefined: Self = StObject.set(x, "notificationArns", js.undefined)
      
      inline def setNotificationArnsVarargs(value: Input[String]*): Self = StObject.set(x, "notificationArns", js.Array(value :_*))
      
      inline def setOnFailure(value: Input[String]): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPolicyBody(value: Input[String]): Self = StObject.set(x, "policyBody", value.asInstanceOf[js.Any])
      
      inline def setPolicyBodyUndefined: Self = StObject.set(x, "policyBody", js.undefined)
      
      inline def setPolicyUrl(value: Input[String]): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
      
      inline def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTemplateBody(value: Input[String]): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
      
      inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
      
      inline def setTemplateUrl(value: Input[String]): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setTimeoutInMinutes(value: Input[Double]): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
      
      inline def setTimeoutInMinutesUndefined: Self = StObject.set(x, "timeoutInMinutes", js.undefined)
    }
  }
  
  trait StackState extends StObject {
    
    /**
      * A list of capabilities.
      * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
      */
    val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Set to true to disable rollback of the stack if stack creation failed.
      * Conflicts with `onFailure`.
      */
    val disableRollback: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    val iamRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Stack name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of SNS topic ARNs to publish stack related events.
      */
    val notificationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Action to be taken if stack creation fails. This must be
      * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disableRollback`.
      */
    val onFailure: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of outputs from the stack.
      */
    val outputs: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of Parameter structures that specify input parameters for the stack.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Structure containing the stack policy body.
      * Conflicts w/ `policyUrl`.
      */
    val policyBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Location of a file containing the stack policy.
      * Conflicts w/ `policyBody`.
      */
    val policyUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of tags to associate with this stack.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Structure containing the template body (max size: 51,200 bytes).
      */
    val templateBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Location of a file containing the template body (max size: 460,800 bytes).
      */
    val templateUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
      */
    val timeoutInMinutes: js.UndefOr[Input[Double]] = js.undefined
  }
  object StackState {
    
    inline def apply(): StackState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackState]
    }
    
    extension [Self <: StackState](x: Self) {
      
      inline def setCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      inline def setDisableRollback(value: Input[Boolean]): Self = StObject.set(x, "disableRollback", value.asInstanceOf[js.Any])
      
      inline def setDisableRollbackUndefined: Self = StObject.set(x, "disableRollback", js.undefined)
      
      inline def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotificationArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "notificationArns", value.asInstanceOf[js.Any])
      
      inline def setNotificationArnsUndefined: Self = StObject.set(x, "notificationArns", js.undefined)
      
      inline def setNotificationArnsVarargs(value: Input[String]*): Self = StObject.set(x, "notificationArns", js.Array(value :_*))
      
      inline def setOnFailure(value: Input[String]): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      inline def setOutputs(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPolicyBody(value: Input[String]): Self = StObject.set(x, "policyBody", value.asInstanceOf[js.Any])
      
      inline def setPolicyBodyUndefined: Self = StObject.set(x, "policyBody", js.undefined)
      
      inline def setPolicyUrl(value: Input[String]): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
      
      inline def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTemplateBody(value: Input[String]): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
      
      inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
      
      inline def setTemplateUrl(value: Input[String]): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setTimeoutInMinutes(value: Input[Double]): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
      
      inline def setTimeoutInMinutesUndefined: Self = StObject.set(x, "timeoutInMinutes", js.undefined)
    }
  }
}
