package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackSetMod {
  
  @JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet")
  @js.native
  class StackSet protected () extends CustomResource {
    /**
      * Create a StackSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackSetArgs) = this()
    def this(name: String, args: StackSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Number (ARN) of the IAM Role in the administrator account.
      */
    val administrationRoleArn: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the StackSet.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
      */
    val capabilities: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Description of the StackSet.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole`.
      */
    val executionRoleName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
      */
    val parameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Unique identifier of the StackSet.
      */
    val stackSetId: Output_[String] = js.native
    
    /**
      * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
      */
    val templateBody: Output_[String] = js.native
    
    /**
      * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
      */
    val templateUrl: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object StackSet {
    
    /**
      * Get an existing StackSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet.get")
    @js.native
    def get(name: String, id: Input[ID]): StackSet = js.native
    @JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): StackSet = js.native
    @JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetState): StackSet = js.native
    @JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): StackSet = js.native
    
    /**
      * Returns true if the given object is an instance of StackSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = js.native
  }
  
  @js.native
  trait StackSetArgs extends StObject {
    
    /**
      * Amazon Resource Number (ARN) of the IAM Role in the administrator account.
      */
    val administrationRoleArn: Input[String] = js.native
    
    /**
      * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
      */
    val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Description of the StackSet.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole`.
      */
    val executionRoleName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
      */
    val templateBody: js.UndefOr[Input[String]] = js.native
    
    /**
      * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
      */
    val templateUrl: js.UndefOr[Input[String]] = js.native
  }
  object StackSetArgs {
    
    @scala.inline
    def apply(administrationRoleArn: Input[String]): StackSetArgs = {
      val __obj = js.Dynamic.literal(administrationRoleArn = administrationRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackSetArgs]
    }
    
    @scala.inline
    implicit class StackSetArgsMutableBuilder[Self <: StackSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdministrationRoleArn(value: Input[String]): Self = StObject.set(x, "administrationRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      @scala.inline
      def setCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExecutionRoleName(value: Input[String]): Self = StObject.set(x, "executionRoleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionRoleNameUndefined: Self = StObject.set(x, "executionRoleName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTemplateBody(value: Input[String]): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
      
      @scala.inline
      def setTemplateUrl(value: Input[String]): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    }
  }
  
  @js.native
  trait StackSetState extends StObject {
    
    /**
      * Amazon Resource Number (ARN) of the IAM Role in the administrator account.
      */
    val administrationRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the StackSet.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
      */
    val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Description of the StackSet.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole`.
      */
    val executionRoleName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Unique identifier of the StackSet.
      */
    val stackSetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
      */
    val templateBody: js.UndefOr[Input[String]] = js.native
    
    /**
      * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
      */
    val templateUrl: js.UndefOr[Input[String]] = js.native
  }
  object StackSetState {
    
    @scala.inline
    def apply(): StackSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackSetState]
    }
    
    @scala.inline
    implicit class StackSetStateMutableBuilder[Self <: StackSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdministrationRoleArn(value: Input[String]): Self = StObject.set(x, "administrationRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdministrationRoleArnUndefined: Self = StObject.set(x, "administrationRoleArn", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      @scala.inline
      def setCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExecutionRoleName(value: Input[String]): Self = StObject.set(x, "executionRoleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionRoleNameUndefined: Self = StObject.set(x, "executionRoleName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setStackSetId(value: Input[String]): Self = StObject.set(x, "stackSetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackSetIdUndefined: Self = StObject.set(x, "stackSetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTemplateBody(value: Input[String]): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
      
      @scala.inline
      def setTemplateUrl(value: Input[String]): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    }
  }
}
