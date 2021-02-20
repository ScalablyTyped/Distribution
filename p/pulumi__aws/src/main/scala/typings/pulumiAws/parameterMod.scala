package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsSsmMod.ParameterType
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterMod {
  
  @JSImport("@pulumi/aws/ssm/parameter", "Parameter")
  @js.native
  class Parameter protected () extends CustomResource {
    /**
      * Create a Parameter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterArgs) = this()
    def this(name: String, args: ParameterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A regular expression used to validate the parameter value.
      */
    val allowedPattern: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the parameter.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The dataType of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
      * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
      */
    val dataType: Output_[String] = js.native
    
    /**
      * The description of the parameter.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The KMS key id or arn for encrypting a SecureString.
      */
    val keyId: Output_[String] = js.native
    
    /**
      * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
      */
    val name: Output_[String] = js.native
    
    /**
      * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
      */
    val overwrite: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard` and `Advanced`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
      */
    val tier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
      */
    val `type`: Output_[ParameterType] = js.native
    
    /**
      * The value of the parameter.
      */
    val value: Output_[String] = js.native
    
    /**
      * The version of the parameter.
      */
    val version: Output_[Double] = js.native
  }
  /* static members */
  object Parameter {
    
    /**
      * Get an existing Parameter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/parameter", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID]): Parameter = js.native
    @JSImport("@pulumi/aws/ssm/parameter", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Parameter = js.native
    @JSImport("@pulumi/aws/ssm/parameter", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterState): Parameter = js.native
    @JSImport("@pulumi/aws/ssm/parameter", "Parameter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterState, opts: CustomResourceOptions): Parameter = js.native
    
    /**
      * Returns true if the given object is an instance of Parameter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/parameter", "Parameter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/parameter.Parameter */ Boolean = js.native
  }
  
  @js.native
  trait ParameterArgs extends StObject {
    
    /**
      * A regular expression used to validate the parameter value.
      */
    val allowedPattern: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the parameter.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The dataType of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
      * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
      */
    val dataType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the parameter.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The KMS key id or arn for encrypting a SecureString.
      */
    val keyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
      */
    val overwrite: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard` and `Advanced`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
      */
    val tier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
      */
    val `type`: Input[ParameterType] = js.native
    
    /**
      * The value of the parameter.
      */
    val value: Input[String] = js.native
  }
  object ParameterArgs {
    
    @scala.inline
    def apply(`type`: Input[ParameterType], value: Input[String]): ParameterArgs = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterArgs]
    }
    
    @scala.inline
    implicit class ParameterArgsMutableBuilder[Self <: ParameterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedPattern(value: Input[String]): Self = StObject.set(x, "allowedPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPatternUndefined: Self = StObject.set(x, "allowedPattern", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDataType(value: Input[String]): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Input[Boolean]): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTier(value: Input[String]): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
      
      @scala.inline
      def setType(value: Input[ParameterType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParameterState extends StObject {
    
    /**
      * A regular expression used to validate the parameter value.
      */
    val allowedPattern: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the parameter.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The dataType of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
      * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
      */
    val dataType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the parameter.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The KMS key id or arn for encrypting a SecureString.
      */
    val keyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
      */
    val overwrite: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard` and `Advanced`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
      */
    val tier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
      */
    val `type`: js.UndefOr[Input[ParameterType]] = js.native
    
    /**
      * The value of the parameter.
      */
    val value: js.UndefOr[Input[String]] = js.native
    
    /**
      * The version of the parameter.
      */
    val version: js.UndefOr[Input[Double]] = js.native
  }
  object ParameterState {
    
    @scala.inline
    def apply(): ParameterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterState]
    }
    
    @scala.inline
    implicit class ParameterStateMutableBuilder[Self <: ParameterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedPattern(value: Input[String]): Self = StObject.set(x, "allowedPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPatternUndefined: Self = StObject.set(x, "allowedPattern", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDataType(value: Input[String]): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Input[Boolean]): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTier(value: Input[String]): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
      
      @scala.inline
      def setType(value: Input[ParameterType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
