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
    
    @JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InfrastructureConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[InfrastructureConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InfrastructureConfiguration]
    inline def get(name: String, id: Input[ID], state: InfrastructureConfigurationState): InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[InfrastructureConfiguration]
    inline def get(name: String, id: Input[ID], state: InfrastructureConfigurationState, opts: CustomResourceOptions): InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InfrastructureConfiguration]
    
    /**
      * Returns true if the given object is an instance of InfrastructureConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/infrastructureConfiguration.InfrastructureConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/imagebuilder/infrastructureConfiguration.InfrastructureConfiguration */ Boolean]
  }
  
  trait InfrastructureConfigurationArgs extends StObject {
    
    /**
      * Description for the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of IAM Instance Profile.
      */
    val instanceProfileName: Input[String]
    
    /**
      * Set of EC2 Instance Types.
      */
    val instanceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Name of EC2 Key Pair.
      */
    val keyPair: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with logging settings. Detailed below.
      */
    val logging: js.UndefOr[
        Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]
      ] = js.undefined
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags to assign to infrastructure created by the configuration.
      */
    val resourceTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Set of EC2 Security Group identifiers.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of SNS Topic.
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EC2 Subnet identifier. Also requires `securityGroupIds` argument.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags to assign to the configuration.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
      */
    val terminateInstanceOnFailure: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object InfrastructureConfigurationArgs {
    
    inline def apply(instanceProfileName: Input[String]): InfrastructureConfigurationArgs = {
      val __obj = js.Dynamic.literal(instanceProfileName = instanceProfileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationArgs]
    }
    
    extension [Self <: InfrastructureConfigurationArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setInstanceProfileName(value: Input[String]): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
      
      inline def setInstanceTypesVarargs(value: Input[String]*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      inline def setKeyPair(value: Input[String]): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
      
      inline def setLogging(value: Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResourceTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      inline def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTerminateInstanceOnFailure(value: Input[Boolean]): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
    }
  }
  
  trait InfrastructureConfigurationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Date when the configuration was created.
      */
    val dateCreated: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Date when the configuration was updated.
      */
    val dateUpdated: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description for the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of IAM Instance Profile.
      */
    val instanceProfileName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of EC2 Instance Types.
      */
    val instanceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Name of EC2 Key Pair.
      */
    val keyPair: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with logging settings. Detailed below.
      */
    val logging: js.UndefOr[
        Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]
      ] = js.undefined
    
    /**
      * Name for the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags to assign to infrastructure created by the configuration.
      */
    val resourceTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Set of EC2 Security Group identifiers.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of SNS Topic.
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EC2 Subnet identifier. Also requires `securityGroupIds` argument.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags to assign to the configuration.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
      */
    val terminateInstanceOnFailure: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object InfrastructureConfigurationState {
    
    inline def apply(): InfrastructureConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfrastructureConfigurationState]
    }
    
    extension [Self <: InfrastructureConfigurationState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDateCreated(value: Input[String]): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: Input[String]): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setInstanceProfileName(value: Input[String]): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
      
      inline def setInstanceProfileNameUndefined: Self = StObject.set(x, "instanceProfileName", js.undefined)
      
      inline def setInstanceTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
      
      inline def setInstanceTypesVarargs(value: Input[String]*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      inline def setKeyPair(value: Input[String]): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
      
      inline def setLogging(value: Input[typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResourceTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      inline def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTerminateInstanceOnFailure(value: Input[Boolean]): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
    }
  }
}
