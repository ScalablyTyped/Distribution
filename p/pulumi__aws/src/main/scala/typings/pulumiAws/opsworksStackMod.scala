package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.opsworks.StackCustomCookbooksSource
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opsworksStackMod {
  
  @JSImport("@pulumi/aws/opsworks/stack", "Stack")
  @js.native
  class Stack protected () extends CustomResource {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
    
    /**
      * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
      */
    val agentVersion: Output_[String] = js.native
    
    val arn: Output_[String] = js.native
    
    /**
      * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
      */
    val berkshelfVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Color to paint next to the stack's resources in the OpsWorks console.
      */
    val color: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the configuration manager to use. Defaults to "Chef".
      */
    val configurationManagerName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Version of the configuration manager to use. Defaults to "11.4".
      */
    val configurationManagerVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * When `useCustomCookbooks` is set, provide this sub-object as
      * described below.
      */
    val customCookbooksSources: Output_[js.Array[StackCustomCookbooksSource]] = js.native
    
    /**
      * Custom JSON attributes to apply to the entire stack.
      */
    val customJson: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the availability zone where instances will be created
      * by default. This is required unless you set `vpcId`.
      */
    val defaultAvailabilityZone: Output_[String] = js.native
    
    /**
      * The ARN of an IAM Instance Profile that created instances
      * will have by default.
      */
    val defaultInstanceProfileArn: Output_[String] = js.native
    
    /**
      * Name of OS that will be installed on instances by default.
      */
    val defaultOs: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the type of root device instances will have by default.
      */
    val defaultRootDeviceType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val defaultSshKeyName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Id of the subnet in which instances will be created by default. Mandatory
      * if `vpcId` is set, and forbidden if it isn't.
      */
    val defaultSubnetId: Output_[String] = js.native
    
    /**
      * Keyword representing the naming scheme that will be used for instance hostnames
      * within this stack.
      */
    val hostnameTheme: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
      */
    val manageBerkshelf: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the stack.
      */
    val name: Output_[String] = js.native
    
    /**
      * The name of the region where the stack will exist.
      */
    val region: Output_[String] = js.native
    
    /**
      * The ARN of an IAM role that the OpsWorks service will act as.
      */
    val serviceRoleArn: Output_[String] = js.native
    
    val stackEndpoint: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Boolean value controlling whether the custom cookbook settings are
      * enabled.
      */
    val useCustomCookbooks: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Boolean value controlling whether the standard OpsWorks
      * security groups apply to created instances.
      */
    val useOpsworksSecurityGroups: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The id of the VPC that this stack belongs to.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object Stack {
    
    @JSImport("@pulumi/aws/opsworks/stack", "Stack")
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
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ Boolean]
  }
  
  trait StackArgs extends StObject {
    
    /**
      * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
      */
    val agentVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
      */
    val berkshelfVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Color to paint next to the stack's resources in the OpsWorks console.
      */
    val color: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the configuration manager to use. Defaults to "Chef".
      */
    val configurationManagerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Version of the configuration manager to use. Defaults to "11.4".
      */
    val configurationManagerVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When `useCustomCookbooks` is set, provide this sub-object as
      * described below.
      */
    val customCookbooksSources: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]
      ] = js.undefined
    
    /**
      * Custom JSON attributes to apply to the entire stack.
      */
    val customJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the availability zone where instances will be created
      * by default. This is required unless you set `vpcId`.
      */
    val defaultAvailabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an IAM Instance Profile that created instances
      * will have by default.
      */
    val defaultInstanceProfileArn: Input[String]
    
    /**
      * Name of OS that will be installed on instances by default.
      */
    val defaultOs: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the type of root device instances will have by default.
      */
    val defaultRootDeviceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val defaultSshKeyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Id of the subnet in which instances will be created by default. Mandatory
      * if `vpcId` is set, and forbidden if it isn't.
      */
    val defaultSubnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Keyword representing the naming scheme that will be used for instance hostnames
      * within this stack.
      */
    val hostnameTheme: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
      */
    val manageBerkshelf: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the stack.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the region where the stack will exist.
      */
    val region: Input[String]
    
    /**
      * The ARN of an IAM role that the OpsWorks service will act as.
      */
    val serviceRoleArn: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Boolean value controlling whether the custom cookbook settings are
      * enabled.
      */
    val useCustomCookbooks: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean value controlling whether the standard OpsWorks
      * security groups apply to created instances.
      */
    val useOpsworksSecurityGroups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The id of the VPC that this stack belongs to.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object StackArgs {
    
    inline def apply(defaultInstanceProfileArn: Input[String], region: Input[String], serviceRoleArn: Input[String]): StackArgs = {
      val __obj = js.Dynamic.literal(defaultInstanceProfileArn = defaultInstanceProfileArn.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackArgs]
    }
    
    extension [Self <: StackArgs](x: Self) {
      
      inline def setAgentVersion(value: Input[String]): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setBerkshelfVersion(value: Input[String]): Self = StObject.set(x, "berkshelfVersion", value.asInstanceOf[js.Any])
      
      inline def setBerkshelfVersionUndefined: Self = StObject.set(x, "berkshelfVersion", js.undefined)
      
      inline def setColor(value: Input[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setConfigurationManagerName(value: Input[String]): Self = StObject.set(x, "configurationManagerName", value.asInstanceOf[js.Any])
      
      inline def setConfigurationManagerNameUndefined: Self = StObject.set(x, "configurationManagerName", js.undefined)
      
      inline def setConfigurationManagerVersion(value: Input[String]): Self = StObject.set(x, "configurationManagerVersion", value.asInstanceOf[js.Any])
      
      inline def setConfigurationManagerVersionUndefined: Self = StObject.set(x, "configurationManagerVersion", js.undefined)
      
      inline def setCustomCookbooksSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]): Self = StObject.set(x, "customCookbooksSources", value.asInstanceOf[js.Any])
      
      inline def setCustomCookbooksSourcesUndefined: Self = StObject.set(x, "customCookbooksSources", js.undefined)
      
      inline def setCustomCookbooksSourcesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]*): Self = StObject.set(x, "customCookbooksSources", js.Array(value :_*))
      
      inline def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      inline def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      inline def setDefaultAvailabilityZone(value: Input[String]): Self = StObject.set(x, "defaultAvailabilityZone", value.asInstanceOf[js.Any])
      
      inline def setDefaultAvailabilityZoneUndefined: Self = StObject.set(x, "defaultAvailabilityZone", js.undefined)
      
      inline def setDefaultInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "defaultInstanceProfileArn", value.asInstanceOf[js.Any])
      
      inline def setDefaultOs(value: Input[String]): Self = StObject.set(x, "defaultOs", value.asInstanceOf[js.Any])
      
      inline def setDefaultOsUndefined: Self = StObject.set(x, "defaultOs", js.undefined)
      
      inline def setDefaultRootDeviceType(value: Input[String]): Self = StObject.set(x, "defaultRootDeviceType", value.asInstanceOf[js.Any])
      
      inline def setDefaultRootDeviceTypeUndefined: Self = StObject.set(x, "defaultRootDeviceType", js.undefined)
      
      inline def setDefaultSshKeyName(value: Input[String]): Self = StObject.set(x, "defaultSshKeyName", value.asInstanceOf[js.Any])
      
      inline def setDefaultSshKeyNameUndefined: Self = StObject.set(x, "defaultSshKeyName", js.undefined)
      
      inline def setDefaultSubnetId(value: Input[String]): Self = StObject.set(x, "defaultSubnetId", value.asInstanceOf[js.Any])
      
      inline def setDefaultSubnetIdUndefined: Self = StObject.set(x, "defaultSubnetId", js.undefined)
      
      inline def setHostnameTheme(value: Input[String]): Self = StObject.set(x, "hostnameTheme", value.asInstanceOf[js.Any])
      
      inline def setHostnameThemeUndefined: Self = StObject.set(x, "hostnameTheme", js.undefined)
      
      inline def setManageBerkshelf(value: Input[Boolean]): Self = StObject.set(x, "manageBerkshelf", value.asInstanceOf[js.Any])
      
      inline def setManageBerkshelfUndefined: Self = StObject.set(x, "manageBerkshelf", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUseCustomCookbooks(value: Input[Boolean]): Self = StObject.set(x, "useCustomCookbooks", value.asInstanceOf[js.Any])
      
      inline def setUseCustomCookbooksUndefined: Self = StObject.set(x, "useCustomCookbooks", js.undefined)
      
      inline def setUseOpsworksSecurityGroups(value: Input[Boolean]): Self = StObject.set(x, "useOpsworksSecurityGroups", value.asInstanceOf[js.Any])
      
      inline def setUseOpsworksSecurityGroupsUndefined: Self = StObject.set(x, "useOpsworksSecurityGroups", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait StackState extends StObject {
    
    /**
      * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
      */
    val agentVersion: js.UndefOr[Input[String]] = js.undefined
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
      */
    val berkshelfVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Color to paint next to the stack's resources in the OpsWorks console.
      */
    val color: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the configuration manager to use. Defaults to "Chef".
      */
    val configurationManagerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Version of the configuration manager to use. Defaults to "11.4".
      */
    val configurationManagerVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When `useCustomCookbooks` is set, provide this sub-object as
      * described below.
      */
    val customCookbooksSources: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]
      ] = js.undefined
    
    /**
      * Custom JSON attributes to apply to the entire stack.
      */
    val customJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the availability zone where instances will be created
      * by default. This is required unless you set `vpcId`.
      */
    val defaultAvailabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an IAM Instance Profile that created instances
      * will have by default.
      */
    val defaultInstanceProfileArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of OS that will be installed on instances by default.
      */
    val defaultOs: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the type of root device instances will have by default.
      */
    val defaultRootDeviceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val defaultSshKeyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Id of the subnet in which instances will be created by default. Mandatory
      * if `vpcId` is set, and forbidden if it isn't.
      */
    val defaultSubnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Keyword representing the naming scheme that will be used for instance hostnames
      * within this stack.
      */
    val hostnameTheme: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
      */
    val manageBerkshelf: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the stack.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the region where the stack will exist.
      */
    val region: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an IAM role that the OpsWorks service will act as.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    val stackEndpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Boolean value controlling whether the custom cookbook settings are
      * enabled.
      */
    val useCustomCookbooks: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean value controlling whether the standard OpsWorks
      * security groups apply to created instances.
      */
    val useOpsworksSecurityGroups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The id of the VPC that this stack belongs to.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object StackState {
    
    inline def apply(): StackState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackState]
    }
    
    extension [Self <: StackState](x: Self) {
      
      inline def setAgentVersion(value: Input[String]): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBerkshelfVersion(value: Input[String]): Self = StObject.set(x, "berkshelfVersion", value.asInstanceOf[js.Any])
      
      inline def setBerkshelfVersionUndefined: Self = StObject.set(x, "berkshelfVersion", js.undefined)
      
      inline def setColor(value: Input[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setConfigurationManagerName(value: Input[String]): Self = StObject.set(x, "configurationManagerName", value.asInstanceOf[js.Any])
      
      inline def setConfigurationManagerNameUndefined: Self = StObject.set(x, "configurationManagerName", js.undefined)
      
      inline def setConfigurationManagerVersion(value: Input[String]): Self = StObject.set(x, "configurationManagerVersion", value.asInstanceOf[js.Any])
      
      inline def setConfigurationManagerVersionUndefined: Self = StObject.set(x, "configurationManagerVersion", js.undefined)
      
      inline def setCustomCookbooksSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]): Self = StObject.set(x, "customCookbooksSources", value.asInstanceOf[js.Any])
      
      inline def setCustomCookbooksSourcesUndefined: Self = StObject.set(x, "customCookbooksSources", js.undefined)
      
      inline def setCustomCookbooksSourcesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]*): Self = StObject.set(x, "customCookbooksSources", js.Array(value :_*))
      
      inline def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      inline def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      inline def setDefaultAvailabilityZone(value: Input[String]): Self = StObject.set(x, "defaultAvailabilityZone", value.asInstanceOf[js.Any])
      
      inline def setDefaultAvailabilityZoneUndefined: Self = StObject.set(x, "defaultAvailabilityZone", js.undefined)
      
      inline def setDefaultInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "defaultInstanceProfileArn", value.asInstanceOf[js.Any])
      
      inline def setDefaultInstanceProfileArnUndefined: Self = StObject.set(x, "defaultInstanceProfileArn", js.undefined)
      
      inline def setDefaultOs(value: Input[String]): Self = StObject.set(x, "defaultOs", value.asInstanceOf[js.Any])
      
      inline def setDefaultOsUndefined: Self = StObject.set(x, "defaultOs", js.undefined)
      
      inline def setDefaultRootDeviceType(value: Input[String]): Self = StObject.set(x, "defaultRootDeviceType", value.asInstanceOf[js.Any])
      
      inline def setDefaultRootDeviceTypeUndefined: Self = StObject.set(x, "defaultRootDeviceType", js.undefined)
      
      inline def setDefaultSshKeyName(value: Input[String]): Self = StObject.set(x, "defaultSshKeyName", value.asInstanceOf[js.Any])
      
      inline def setDefaultSshKeyNameUndefined: Self = StObject.set(x, "defaultSshKeyName", js.undefined)
      
      inline def setDefaultSubnetId(value: Input[String]): Self = StObject.set(x, "defaultSubnetId", value.asInstanceOf[js.Any])
      
      inline def setDefaultSubnetIdUndefined: Self = StObject.set(x, "defaultSubnetId", js.undefined)
      
      inline def setHostnameTheme(value: Input[String]): Self = StObject.set(x, "hostnameTheme", value.asInstanceOf[js.Any])
      
      inline def setHostnameThemeUndefined: Self = StObject.set(x, "hostnameTheme", js.undefined)
      
      inline def setManageBerkshelf(value: Input[Boolean]): Self = StObject.set(x, "manageBerkshelf", value.asInstanceOf[js.Any])
      
      inline def setManageBerkshelfUndefined: Self = StObject.set(x, "manageBerkshelf", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      inline def setStackEndpoint(value: Input[String]): Self = StObject.set(x, "stackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setStackEndpointUndefined: Self = StObject.set(x, "stackEndpoint", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUseCustomCookbooks(value: Input[Boolean]): Self = StObject.set(x, "useCustomCookbooks", value.asInstanceOf[js.Any])
      
      inline def setUseCustomCookbooksUndefined: Self = StObject.set(x, "useCustomCookbooks", js.undefined)
      
      inline def setUseOpsworksSecurityGroups(value: Input[Boolean]): Self = StObject.set(x, "useOpsworksSecurityGroups", value.asInstanceOf[js.Any])
      
      inline def setUseOpsworksSecurityGroupsUndefined: Self = StObject.set(x, "useOpsworksSecurityGroups", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
