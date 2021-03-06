package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.opsworks.HaproxyLayerEbsVolume
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object haproxyLayerMod {
  
  @JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer")
  @js.native
  class HaproxyLayer protected () extends CustomResource {
    /**
      * Create a HaproxyLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HaproxyLayerArgs) = this()
    def this(name: String, args: HaproxyLayerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name(ARN) of the layer.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Whether to automatically assign an elastic IP address to the layer's instances.
      */
    val autoAssignElasticIps: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
      */
    val autoAssignPublicIps: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Whether to enable auto-healing for the layer.
      */
    val autoHealing: Output_[js.UndefOr[Boolean]] = js.native
    
    val customConfigureRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    val customDeployRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ARN of an IAM profile that will be used for the layer's instances.
      */
    val customInstanceProfileArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Custom JSON attributes to apply to the layer.
      */
    val customJson: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Ids for a set of security groups to apply to the layer's instances.
      */
    val customSecurityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    val customSetupRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    val customShutdownRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    val customUndeployRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Whether to enable Elastic Load Balancing connection draining.
      */
    val drainElbOnShutdown: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
      */
    val ebsVolumes: Output_[js.UndefOr[js.Array[HaproxyLayerEbsVolume]]] = js.native
    
    /**
      * Name of an Elastic Load Balancer to attach to this layer
      */
    val elasticLoadBalancer: Output_[js.UndefOr[String]] = js.native
    
    /**
      * HTTP method to use for instance healthchecks. Defaults to "OPTIONS".
      */
    val healthcheckMethod: Output_[js.UndefOr[String]] = js.native
    
    /**
      * URL path to use for instance healthchecks. Defaults to "/".
      */
    val healthcheckUrl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether to install OS and package updates on each instance when it boots.
      */
    val installUpdatesOnBoot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
      */
    val instanceShutdownTimeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A human-readable name for the layer.
      */
    val name: Output_[String] = js.native
    
    /**
      * The id of the stack the layer will belong to.
      */
    val stackId: Output_[String] = js.native
    
    /**
      * Whether to enable HAProxy stats.
      */
    val statsEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The password to use for HAProxy stats.
      */
    val statsPassword: Output_[String] = js.native
    
    /**
      * The HAProxy stats URL. Defaults to "/haproxy?stats".
      */
    val statsUrl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The username for HAProxy stats. Defaults to "opsworks".
      */
    val statsUser: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Names of a set of system packages to install on the layer's instances.
      */
    val systemPackages: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Whether to use EBS-optimized instances.
      */
    val useEbsOptimizedInstances: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object HaproxyLayer {
    
    /**
      * Get an existing HaproxyLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): HaproxyLayer = js.native
    @JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): HaproxyLayer = js.native
    @JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState): HaproxyLayer = js.native
    @JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState, opts: CustomResourceOptions): HaproxyLayer = js.native
    
    /**
      * Returns true if the given object is an instance of HaproxyLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks/haproxyLayer", "HaproxyLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/haproxyLayer.HaproxyLayer */ Boolean = js.native
  }
  
  @js.native
  trait HaproxyLayerArgs extends StObject {
    
    /**
      * Whether to automatically assign an elastic IP address to the layer's instances.
      */
    val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
      */
    val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to enable auto-healing for the layer.
      */
    val autoHealing: js.UndefOr[Input[Boolean]] = js.native
    
    val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN of an IAM profile that will be used for the layer's instances.
      */
    val customInstanceProfileArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Custom JSON attributes to apply to the layer.
      */
    val customJson: js.UndefOr[Input[String]] = js.native
    
    /**
      * Ids for a set of security groups to apply to the layer's instances.
      */
    val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Whether to enable Elastic Load Balancing connection draining.
      */
    val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
      */
    val ebsVolumes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.HaproxyLayerEbsVolume]]]
      ] = js.native
    
    /**
      * Name of an Elastic Load Balancer to attach to this layer
      */
    val elasticLoadBalancer: js.UndefOr[Input[String]] = js.native
    
    /**
      * HTTP method to use for instance healthchecks. Defaults to "OPTIONS".
      */
    val healthcheckMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * URL path to use for instance healthchecks. Defaults to "/".
      */
    val healthcheckUrl: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to install OS and package updates on each instance when it boots.
      */
    val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
      */
    val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A human-readable name for the layer.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The id of the stack the layer will belong to.
      */
    val stackId: Input[String] = js.native
    
    /**
      * Whether to enable HAProxy stats.
      */
    val statsEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The password to use for HAProxy stats.
      */
    val statsPassword: Input[String] = js.native
    
    /**
      * The HAProxy stats URL. Defaults to "/haproxy?stats".
      */
    val statsUrl: js.UndefOr[Input[String]] = js.native
    
    /**
      * The username for HAProxy stats. Defaults to "opsworks".
      */
    val statsUser: js.UndefOr[Input[String]] = js.native
    
    /**
      * Names of a set of system packages to install on the layer's instances.
      */
    val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Whether to use EBS-optimized instances.
      */
    val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.native
  }
  object HaproxyLayerArgs {
    
    @scala.inline
    def apply(stackId: Input[String], statsPassword: Input[String]): HaproxyLayerArgs = {
      val __obj = js.Dynamic.literal(stackId = stackId.asInstanceOf[js.Any], statsPassword = statsPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[HaproxyLayerArgs]
    }
    
    @scala.inline
    implicit class HaproxyLayerArgsMutableBuilder[Self <: HaproxyLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAssignElasticIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignElasticIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAssignElasticIpsUndefined: Self = StObject.set(x, "autoAssignElasticIps", js.undefined)
      
      @scala.inline
      def setAutoAssignPublicIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignPublicIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAssignPublicIpsUndefined: Self = StObject.set(x, "autoAssignPublicIps", js.undefined)
      
      @scala.inline
      def setAutoHealing(value: Input[Boolean]): Self = StObject.set(x, "autoHealing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHealingUndefined: Self = StObject.set(x, "autoHealing", js.undefined)
      
      @scala.inline
      def setCustomConfigureRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customConfigureRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomConfigureRecipesUndefined: Self = StObject.set(x, "customConfigureRecipes", js.undefined)
      
      @scala.inline
      def setCustomConfigureRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customConfigureRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomDeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customDeployRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDeployRecipesUndefined: Self = StObject.set(x, "customDeployRecipes", js.undefined)
      
      @scala.inline
      def setCustomDeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customDeployRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "customInstanceProfileArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInstanceProfileArnUndefined: Self = StObject.set(x, "customInstanceProfileArn", js.undefined)
      
      @scala.inline
      def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      @scala.inline
      def setCustomSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSecurityGroupIdsUndefined: Self = StObject.set(x, "customSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setCustomSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "customSecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setCustomSetupRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSetupRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSetupRecipesUndefined: Self = StObject.set(x, "customSetupRecipes", js.undefined)
      
      @scala.inline
      def setCustomSetupRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customSetupRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomShutdownRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customShutdownRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomShutdownRecipesUndefined: Self = StObject.set(x, "customShutdownRecipes", js.undefined)
      
      @scala.inline
      def setCustomShutdownRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customShutdownRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomUndeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customUndeployRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndeployRecipesUndefined: Self = StObject.set(x, "customUndeployRecipes", js.undefined)
      
      @scala.inline
      def setCustomUndeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customUndeployRecipes", js.Array(value :_*))
      
      @scala.inline
      def setDrainElbOnShutdown(value: Input[Boolean]): Self = StObject.set(x, "drainElbOnShutdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrainElbOnShutdownUndefined: Self = StObject.set(x, "drainElbOnShutdown", js.undefined)
      
      @scala.inline
      def setEbsVolumes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.HaproxyLayerEbsVolume]]]): Self = StObject.set(x, "ebsVolumes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsVolumesUndefined: Self = StObject.set(x, "ebsVolumes", js.undefined)
      
      @scala.inline
      def setEbsVolumesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.HaproxyLayerEbsVolume]*): Self = StObject.set(x, "ebsVolumes", js.Array(value :_*))
      
      @scala.inline
      def setElasticLoadBalancer(value: Input[String]): Self = StObject.set(x, "elasticLoadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticLoadBalancerUndefined: Self = StObject.set(x, "elasticLoadBalancer", js.undefined)
      
      @scala.inline
      def setHealthcheckMethod(value: Input[String]): Self = StObject.set(x, "healthcheckMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthcheckMethodUndefined: Self = StObject.set(x, "healthcheckMethod", js.undefined)
      
      @scala.inline
      def setHealthcheckUrl(value: Input[String]): Self = StObject.set(x, "healthcheckUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthcheckUrlUndefined: Self = StObject.set(x, "healthcheckUrl", js.undefined)
      
      @scala.inline
      def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = StObject.set(x, "installUpdatesOnBoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "installUpdatesOnBoot", js.undefined)
      
      @scala.inline
      def setInstanceShutdownTimeout(value: Input[Double]): Self = StObject.set(x, "instanceShutdownTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceShutdownTimeoutUndefined: Self = StObject.set(x, "instanceShutdownTimeout", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsEnabled(value: Input[Boolean]): Self = StObject.set(x, "statsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsEnabledUndefined: Self = StObject.set(x, "statsEnabled", js.undefined)
      
      @scala.inline
      def setStatsPassword(value: Input[String]): Self = StObject.set(x, "statsPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUrl(value: Input[String]): Self = StObject.set(x, "statsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUrlUndefined: Self = StObject.set(x, "statsUrl", js.undefined)
      
      @scala.inline
      def setStatsUser(value: Input[String]): Self = StObject.set(x, "statsUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUserUndefined: Self = StObject.set(x, "statsUser", js.undefined)
      
      @scala.inline
      def setSystemPackages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "systemPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemPackagesUndefined: Self = StObject.set(x, "systemPackages", js.undefined)
      
      @scala.inline
      def setSystemPackagesVarargs(value: Input[String]*): Self = StObject.set(x, "systemPackages", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUseEbsOptimizedInstances(value: Input[Boolean]): Self = StObject.set(x, "useEbsOptimizedInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEbsOptimizedInstancesUndefined: Self = StObject.set(x, "useEbsOptimizedInstances", js.undefined)
    }
  }
  
  @js.native
  trait HaproxyLayerState extends StObject {
    
    /**
      * The Amazon Resource Name(ARN) of the layer.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to automatically assign an elastic IP address to the layer's instances.
      */
    val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
      */
    val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether to enable auto-healing for the layer.
      */
    val autoHealing: js.UndefOr[Input[Boolean]] = js.native
    
    val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN of an IAM profile that will be used for the layer's instances.
      */
    val customInstanceProfileArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Custom JSON attributes to apply to the layer.
      */
    val customJson: js.UndefOr[Input[String]] = js.native
    
    /**
      * Ids for a set of security groups to apply to the layer's instances.
      */
    val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Whether to enable Elastic Load Balancing connection draining.
      */
    val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
      */
    val ebsVolumes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.HaproxyLayerEbsVolume]]]
      ] = js.native
    
    /**
      * Name of an Elastic Load Balancer to attach to this layer
      */
    val elasticLoadBalancer: js.UndefOr[Input[String]] = js.native
    
    /**
      * HTTP method to use for instance healthchecks. Defaults to "OPTIONS".
      */
    val healthcheckMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * URL path to use for instance healthchecks. Defaults to "/".
      */
    val healthcheckUrl: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to install OS and package updates on each instance when it boots.
      */
    val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
      */
    val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A human-readable name for the layer.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The id of the stack the layer will belong to.
      */
    val stackId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to enable HAProxy stats.
      */
    val statsEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The password to use for HAProxy stats.
      */
    val statsPassword: js.UndefOr[Input[String]] = js.native
    
    /**
      * The HAProxy stats URL. Defaults to "/haproxy?stats".
      */
    val statsUrl: js.UndefOr[Input[String]] = js.native
    
    /**
      * The username for HAProxy stats. Defaults to "opsworks".
      */
    val statsUser: js.UndefOr[Input[String]] = js.native
    
    /**
      * Names of a set of system packages to install on the layer's instances.
      */
    val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Whether to use EBS-optimized instances.
      */
    val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.native
  }
  object HaproxyLayerState {
    
    @scala.inline
    def apply(): HaproxyLayerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HaproxyLayerState]
    }
    
    @scala.inline
    implicit class HaproxyLayerStateMutableBuilder[Self <: HaproxyLayerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoAssignElasticIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignElasticIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAssignElasticIpsUndefined: Self = StObject.set(x, "autoAssignElasticIps", js.undefined)
      
      @scala.inline
      def setAutoAssignPublicIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignPublicIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAssignPublicIpsUndefined: Self = StObject.set(x, "autoAssignPublicIps", js.undefined)
      
      @scala.inline
      def setAutoHealing(value: Input[Boolean]): Self = StObject.set(x, "autoHealing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHealingUndefined: Self = StObject.set(x, "autoHealing", js.undefined)
      
      @scala.inline
      def setCustomConfigureRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customConfigureRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomConfigureRecipesUndefined: Self = StObject.set(x, "customConfigureRecipes", js.undefined)
      
      @scala.inline
      def setCustomConfigureRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customConfigureRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomDeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customDeployRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDeployRecipesUndefined: Self = StObject.set(x, "customDeployRecipes", js.undefined)
      
      @scala.inline
      def setCustomDeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customDeployRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "customInstanceProfileArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInstanceProfileArnUndefined: Self = StObject.set(x, "customInstanceProfileArn", js.undefined)
      
      @scala.inline
      def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      @scala.inline
      def setCustomSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSecurityGroupIdsUndefined: Self = StObject.set(x, "customSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setCustomSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "customSecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setCustomSetupRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSetupRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSetupRecipesUndefined: Self = StObject.set(x, "customSetupRecipes", js.undefined)
      
      @scala.inline
      def setCustomSetupRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customSetupRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomShutdownRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customShutdownRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomShutdownRecipesUndefined: Self = StObject.set(x, "customShutdownRecipes", js.undefined)
      
      @scala.inline
      def setCustomShutdownRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customShutdownRecipes", js.Array(value :_*))
      
      @scala.inline
      def setCustomUndeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customUndeployRecipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndeployRecipesUndefined: Self = StObject.set(x, "customUndeployRecipes", js.undefined)
      
      @scala.inline
      def setCustomUndeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customUndeployRecipes", js.Array(value :_*))
      
      @scala.inline
      def setDrainElbOnShutdown(value: Input[Boolean]): Self = StObject.set(x, "drainElbOnShutdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrainElbOnShutdownUndefined: Self = StObject.set(x, "drainElbOnShutdown", js.undefined)
      
      @scala.inline
      def setEbsVolumes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.HaproxyLayerEbsVolume]]]): Self = StObject.set(x, "ebsVolumes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsVolumesUndefined: Self = StObject.set(x, "ebsVolumes", js.undefined)
      
      @scala.inline
      def setEbsVolumesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.HaproxyLayerEbsVolume]*): Self = StObject.set(x, "ebsVolumes", js.Array(value :_*))
      
      @scala.inline
      def setElasticLoadBalancer(value: Input[String]): Self = StObject.set(x, "elasticLoadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticLoadBalancerUndefined: Self = StObject.set(x, "elasticLoadBalancer", js.undefined)
      
      @scala.inline
      def setHealthcheckMethod(value: Input[String]): Self = StObject.set(x, "healthcheckMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthcheckMethodUndefined: Self = StObject.set(x, "healthcheckMethod", js.undefined)
      
      @scala.inline
      def setHealthcheckUrl(value: Input[String]): Self = StObject.set(x, "healthcheckUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthcheckUrlUndefined: Self = StObject.set(x, "healthcheckUrl", js.undefined)
      
      @scala.inline
      def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = StObject.set(x, "installUpdatesOnBoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "installUpdatesOnBoot", js.undefined)
      
      @scala.inline
      def setInstanceShutdownTimeout(value: Input[Double]): Self = StObject.set(x, "instanceShutdownTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceShutdownTimeoutUndefined: Self = StObject.set(x, "instanceShutdownTimeout", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      @scala.inline
      def setStatsEnabled(value: Input[Boolean]): Self = StObject.set(x, "statsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsEnabledUndefined: Self = StObject.set(x, "statsEnabled", js.undefined)
      
      @scala.inline
      def setStatsPassword(value: Input[String]): Self = StObject.set(x, "statsPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsPasswordUndefined: Self = StObject.set(x, "statsPassword", js.undefined)
      
      @scala.inline
      def setStatsUrl(value: Input[String]): Self = StObject.set(x, "statsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUrlUndefined: Self = StObject.set(x, "statsUrl", js.undefined)
      
      @scala.inline
      def setStatsUser(value: Input[String]): Self = StObject.set(x, "statsUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUserUndefined: Self = StObject.set(x, "statsUser", js.undefined)
      
      @scala.inline
      def setSystemPackages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "systemPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemPackagesUndefined: Self = StObject.set(x, "systemPackages", js.undefined)
      
      @scala.inline
      def setSystemPackagesVarargs(value: Input[String]*): Self = StObject.set(x, "systemPackages", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUseEbsOptimizedInstances(value: Input[Boolean]): Self = StObject.set(x, "useEbsOptimizedInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEbsOptimizedInstancesUndefined: Self = StObject.set(x, "useEbsOptimizedInstances", js.undefined)
    }
  }
}
