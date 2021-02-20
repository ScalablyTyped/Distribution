package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.InfrastructureConfigurationLogging
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infrastructureConfigurationMod {
  
  @JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration")
  @js.native
  class InfrastructureConfiguration protected () extends CustomResource {
    /**
      * Create a InfrastructureConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InfrastructureConfigurationArgs) = this()
    def this(name: String, args: InfrastructureConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Date when the configuration was created.
      */
    val dateCreated: Output_[String] = js.native
    
    /**
      * Date when the configuration was updated.
      */
    val dateUpdated: Output_[String] = js.native
    
    /**
      * Description for the configuration.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of IAM Instance Profile.
      */
    val instanceProfileName: Output_[String] = js.native
    
    /**
      * Set of EC2 Instance Types.
      */
    val instanceTypes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Name of EC2 Key Pair.
      */
    val keyPair: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block with logging settings. Detailed below.
      */
    val logging: Output_[js.UndefOr[InfrastructureConfigurationLogging]] = js.native
    
    /**
      * Name for the configuration.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags to assign to infrastructure created by the configuration.
      */
    val resourceTags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Set of EC2 Security Group identifiers.
      */
    val securityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of SNS Topic.
      */
    val snsTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * EC2 Subnet identifier. Also requires `securityGroupIds` argument.
      */
    val subnetId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags to assign to the configuration.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
      */
    val terminateInstanceOnFailure: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object InfrastructureConfiguration {
    
    /**
      * Get an existing InfrastructureConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): InfrastructureConfiguration = js.native
    @JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): InfrastructureConfiguration = js.native
    @JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: InfrastructureConfigurationState): InfrastructureConfiguration = js.native
    @JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: InfrastructureConfigurationState, opts: CustomResourceOptions): InfrastructureConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of InfrastructureConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/infrastructureConfiguration.InfrastructureConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait InfrastructureConfigurationArgs extends StObject {
    
    /**
      * Description for the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of IAM Instance Profile.
      */
    val instanceProfileName: Input[String] = js.native
    
    /**
      * Set of EC2 Instance Types.
      */
    val instanceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Name of EC2 Key Pair.
      */
    val keyPair: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block with logging settings. Detailed below.
      */
    val logging: js.UndefOr[
        Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]
      ] = js.native
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags to assign to infrastructure created by the configuration.
      */
    val resourceTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Set of EC2 Security Group identifiers.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of SNS Topic.
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * EC2 Subnet identifier. Also requires `securityGroupIds` argument.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags to assign to the configuration.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
      */
    val terminateInstanceOnFailure: js.UndefOr[Input[Boolean]] = js.native
  }
  object InfrastructureConfigurationArgs {
    
    @scala.inline
    def apply(instanceProfileName: Input[String]): InfrastructureConfigurationArgs = {
      val __obj = js.Dynamic.literal(instanceProfileName = instanceProfileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationArgs]
    }
    
    @scala.inline
    implicit class InfrastructureConfigurationArgsMutableBuilder[Self <: InfrastructureConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setInstanceProfileName(value: Input[String]): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
      
      @scala.inline
      def setInstanceTypesVarargs(value: Input[String]*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      @scala.inline
      def setKeyPair(value: Input[String]): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
      
      @scala.inline
      def setLogging(value: Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTerminateInstanceOnFailure(value: Input[Boolean]): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
    }
  }
  
  @js.native
  trait InfrastructureConfigurationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Date when the configuration was created.
      */
    val dateCreated: js.UndefOr[Input[String]] = js.native
    
    /**
      * Date when the configuration was updated.
      */
    val dateUpdated: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description for the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of IAM Instance Profile.
      */
    val instanceProfileName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set of EC2 Instance Types.
      */
    val instanceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Name of EC2 Key Pair.
      */
    val keyPair: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block with logging settings. Detailed below.
      */
    val logging: js.UndefOr[
        Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]
      ] = js.native
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags to assign to infrastructure created by the configuration.
      */
    val resourceTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Set of EC2 Security Group identifiers.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of SNS Topic.
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * EC2 Subnet identifier. Also requires `securityGroupIds` argument.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags to assign to the configuration.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
      */
    val terminateInstanceOnFailure: js.UndefOr[Input[Boolean]] = js.native
  }
  object InfrastructureConfigurationState {
    
    @scala.inline
    def apply(): InfrastructureConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfrastructureConfigurationState]
    }
    
    @scala.inline
    implicit class InfrastructureConfigurationStateMutableBuilder[Self <: InfrastructureConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDateCreated(value: Input[String]): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      @scala.inline
      def setDateUpdated(value: Input[String]): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setInstanceProfileName(value: Input[String]): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceProfileNameUndefined: Self = StObject.set(x, "instanceProfileName", js.undefined)
      
      @scala.inline
      def setInstanceTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
      
      @scala.inline
      def setInstanceTypesVarargs(value: Input[String]*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      @scala.inline
      def setKeyPair(value: Input[String]): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
      
      @scala.inline
      def setLogging(value: Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTerminateInstanceOnFailure(value: Input[Boolean]): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
    }
  }
}
