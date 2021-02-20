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
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks/stack", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID]): Stack = js.native
    @JSImport("@pulumi/aws/opsworks/stack", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Stack = js.native
    @JSImport("@pulumi/aws/opsworks/stack", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState): Stack = js.native
    @JSImport("@pulumi/aws/opsworks/stack", "Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): Stack = js.native
    
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks/stack", "Stack.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ Boolean = js.native
  }
  
  @js.native
  trait StackArgs extends StObject {
    
    /**
      * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
      */
    val agentVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
      */
    val berkshelfVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Color to paint next to the stack's resources in the OpsWorks console.
      */
    val color: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the configuration manager to use. Defaults to "Chef".
      */
    val configurationManagerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Version of the configuration manager to use. Defaults to "11.4".
      */
    val configurationManagerVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * When `useCustomCookbooks` is set, provide this sub-object as
      * described below.
      */
    val customCookbooksSources: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]
      ] = js.native
    
    /**
      * Custom JSON attributes to apply to the entire stack.
      */
    val customJson: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the availability zone where instances will be created
      * by default. This is required unless you set `vpcId`.
      */
    val defaultAvailabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of an IAM Instance Profile that created instances
      * will have by default.
      */
    val defaultInstanceProfileArn: Input[String] = js.native
    
    /**
      * Name of OS that will be installed on instances by default.
      */
    val defaultOs: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the type of root device instances will have by default.
      */
    val defaultRootDeviceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val defaultSshKeyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Id of the subnet in which instances will be created by default. Mandatory
      * if `vpcId` is set, and forbidden if it isn't.
      */
    val defaultSubnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Keyword representing the naming scheme that will be used for instance hostnames
      * within this stack.
      */
    val hostnameTheme: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
      */
    val manageBerkshelf: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the stack.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the region where the stack will exist.
      */
    val region: Input[String] = js.native
    
    /**
      * The ARN of an IAM role that the OpsWorks service will act as.
      */
    val serviceRoleArn: Input[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Boolean value controlling whether the custom cookbook settings are
      * enabled.
      */
    val useCustomCookbooks: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean value controlling whether the standard OpsWorks
      * security groups apply to created instances.
      */
    val useOpsworksSecurityGroups: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The id of the VPC that this stack belongs to.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object StackArgs {
    
    @scala.inline
    def apply(defaultInstanceProfileArn: Input[String], region: Input[String], serviceRoleArn: Input[String]): StackArgs = {
      val __obj = js.Dynamic.literal(defaultInstanceProfileArn = defaultInstanceProfileArn.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackArgs]
    }
    
    @scala.inline
    implicit class StackArgsMutableBuilder[Self <: StackArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgentVersion(value: Input[String]): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      @scala.inline
      def setBerkshelfVersion(value: Input[String]): Self = StObject.set(x, "berkshelfVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBerkshelfVersionUndefined: Self = StObject.set(x, "berkshelfVersion", js.undefined)
      
      @scala.inline
      def setColor(value: Input[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setConfigurationManagerName(value: Input[String]): Self = StObject.set(x, "configurationManagerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationManagerNameUndefined: Self = StObject.set(x, "configurationManagerName", js.undefined)
      
      @scala.inline
      def setConfigurationManagerVersion(value: Input[String]): Self = StObject.set(x, "configurationManagerVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationManagerVersionUndefined: Self = StObject.set(x, "configurationManagerVersion", js.undefined)
      
      @scala.inline
      def setCustomCookbooksSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]): Self = StObject.set(x, "customCookbooksSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCookbooksSourcesUndefined: Self = StObject.set(x, "customCookbooksSources", js.undefined)
      
      @scala.inline
      def setCustomCookbooksSourcesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]*): Self = StObject.set(x, "customCookbooksSources", js.Array(value :_*))
      
      @scala.inline
      def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      @scala.inline
      def setDefaultAvailabilityZone(value: Input[String]): Self = StObject.set(x, "defaultAvailabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAvailabilityZoneUndefined: Self = StObject.set(x, "defaultAvailabilityZone", js.undefined)
      
      @scala.inline
      def setDefaultInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "defaultInstanceProfileArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOs(value: Input[String]): Self = StObject.set(x, "defaultOs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOsUndefined: Self = StObject.set(x, "defaultOs", js.undefined)
      
      @scala.inline
      def setDefaultRootDeviceType(value: Input[String]): Self = StObject.set(x, "defaultRootDeviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRootDeviceTypeUndefined: Self = StObject.set(x, "defaultRootDeviceType", js.undefined)
      
      @scala.inline
      def setDefaultSshKeyName(value: Input[String]): Self = StObject.set(x, "defaultSshKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSshKeyNameUndefined: Self = StObject.set(x, "defaultSshKeyName", js.undefined)
      
      @scala.inline
      def setDefaultSubnetId(value: Input[String]): Self = StObject.set(x, "defaultSubnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSubnetIdUndefined: Self = StObject.set(x, "defaultSubnetId", js.undefined)
      
      @scala.inline
      def setHostnameTheme(value: Input[String]): Self = StObject.set(x, "hostnameTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameThemeUndefined: Self = StObject.set(x, "hostnameTheme", js.undefined)
      
      @scala.inline
      def setManageBerkshelf(value: Input[Boolean]): Self = StObject.set(x, "manageBerkshelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManageBerkshelfUndefined: Self = StObject.set(x, "manageBerkshelf", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUseCustomCookbooks(value: Input[Boolean]): Self = StObject.set(x, "useCustomCookbooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCustomCookbooksUndefined: Self = StObject.set(x, "useCustomCookbooks", js.undefined)
      
      @scala.inline
      def setUseOpsworksSecurityGroups(value: Input[Boolean]): Self = StObject.set(x, "useOpsworksSecurityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseOpsworksSecurityGroupsUndefined: Self = StObject.set(x, "useOpsworksSecurityGroups", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait StackState extends StObject {
    
    /**
      * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
      */
    val agentVersion: js.UndefOr[Input[String]] = js.native
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
      */
    val berkshelfVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Color to paint next to the stack's resources in the OpsWorks console.
      */
    val color: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the configuration manager to use. Defaults to "Chef".
      */
    val configurationManagerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Version of the configuration manager to use. Defaults to "11.4".
      */
    val configurationManagerVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * When `useCustomCookbooks` is set, provide this sub-object as
      * described below.
      */
    val customCookbooksSources: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]
      ] = js.native
    
    /**
      * Custom JSON attributes to apply to the entire stack.
      */
    val customJson: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the availability zone where instances will be created
      * by default. This is required unless you set `vpcId`.
      */
    val defaultAvailabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of an IAM Instance Profile that created instances
      * will have by default.
      */
    val defaultInstanceProfileArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of OS that will be installed on instances by default.
      */
    val defaultOs: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the type of root device instances will have by default.
      */
    val defaultRootDeviceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the SSH keypair that instances will have by default.
      */
    val defaultSshKeyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Id of the subnet in which instances will be created by default. Mandatory
      * if `vpcId` is set, and forbidden if it isn't.
      */
    val defaultSubnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Keyword representing the naming scheme that will be used for instance hostnames
      * within this stack.
      */
    val hostnameTheme: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
      */
    val manageBerkshelf: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the stack.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the region where the stack will exist.
      */
    val region: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of an IAM role that the OpsWorks service will act as.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.native
    
    val stackEndpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Boolean value controlling whether the custom cookbook settings are
      * enabled.
      */
    val useCustomCookbooks: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean value controlling whether the standard OpsWorks
      * security groups apply to created instances.
      */
    val useOpsworksSecurityGroups: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The id of the VPC that this stack belongs to.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object StackState {
    
    @scala.inline
    def apply(): StackState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackState]
    }
    
    @scala.inline
    implicit class StackStateMutableBuilder[Self <: StackState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgentVersion(value: Input[String]): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBerkshelfVersion(value: Input[String]): Self = StObject.set(x, "berkshelfVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBerkshelfVersionUndefined: Self = StObject.set(x, "berkshelfVersion", js.undefined)
      
      @scala.inline
      def setColor(value: Input[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setConfigurationManagerName(value: Input[String]): Self = StObject.set(x, "configurationManagerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationManagerNameUndefined: Self = StObject.set(x, "configurationManagerName", js.undefined)
      
      @scala.inline
      def setConfigurationManagerVersion(value: Input[String]): Self = StObject.set(x, "configurationManagerVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationManagerVersionUndefined: Self = StObject.set(x, "configurationManagerVersion", js.undefined)
      
      @scala.inline
      def setCustomCookbooksSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]]]): Self = StObject.set(x, "customCookbooksSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCookbooksSourcesUndefined: Self = StObject.set(x, "customCookbooksSources", js.undefined)
      
      @scala.inline
      def setCustomCookbooksSourcesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource]*): Self = StObject.set(x, "customCookbooksSources", js.Array(value :_*))
      
      @scala.inline
      def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      @scala.inline
      def setDefaultAvailabilityZone(value: Input[String]): Self = StObject.set(x, "defaultAvailabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAvailabilityZoneUndefined: Self = StObject.set(x, "defaultAvailabilityZone", js.undefined)
      
      @scala.inline
      def setDefaultInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "defaultInstanceProfileArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInstanceProfileArnUndefined: Self = StObject.set(x, "defaultInstanceProfileArn", js.undefined)
      
      @scala.inline
      def setDefaultOs(value: Input[String]): Self = StObject.set(x, "defaultOs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOsUndefined: Self = StObject.set(x, "defaultOs", js.undefined)
      
      @scala.inline
      def setDefaultRootDeviceType(value: Input[String]): Self = StObject.set(x, "defaultRootDeviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRootDeviceTypeUndefined: Self = StObject.set(x, "defaultRootDeviceType", js.undefined)
      
      @scala.inline
      def setDefaultSshKeyName(value: Input[String]): Self = StObject.set(x, "defaultSshKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSshKeyNameUndefined: Self = StObject.set(x, "defaultSshKeyName", js.undefined)
      
      @scala.inline
      def setDefaultSubnetId(value: Input[String]): Self = StObject.set(x, "defaultSubnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSubnetIdUndefined: Self = StObject.set(x, "defaultSubnetId", js.undefined)
      
      @scala.inline
      def setHostnameTheme(value: Input[String]): Self = StObject.set(x, "hostnameTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameThemeUndefined: Self = StObject.set(x, "hostnameTheme", js.undefined)
      
      @scala.inline
      def setManageBerkshelf(value: Input[Boolean]): Self = StObject.set(x, "manageBerkshelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManageBerkshelfUndefined: Self = StObject.set(x, "manageBerkshelf", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      @scala.inline
      def setStackEndpoint(value: Input[String]): Self = StObject.set(x, "stackEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackEndpointUndefined: Self = StObject.set(x, "stackEndpoint", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUseCustomCookbooks(value: Input[Boolean]): Self = StObject.set(x, "useCustomCookbooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCustomCookbooksUndefined: Self = StObject.set(x, "useCustomCookbooks", js.undefined)
      
      @scala.inline
      def setUseOpsworksSecurityGroups(value: Input[Boolean]): Self = StObject.set(x, "useOpsworksSecurityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseOpsworksSecurityGroupsUndefined: Self = StObject.set(x, "useOpsworksSecurityGroups", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
