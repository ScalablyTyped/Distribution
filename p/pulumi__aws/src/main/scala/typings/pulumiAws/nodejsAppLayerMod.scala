package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.opsworks.NodejsAppLayerEbsVolume
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodejsAppLayerMod {
  
  @JSImport("@pulumi/aws/opsworks/nodejsAppLayer", "NodejsAppLayer")
  @js.native
  class NodejsAppLayer protected () extends CustomResource {
    /**
      * Create a NodejsAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NodejsAppLayerArgs) = this()
    def this(name: String, args: NodejsAppLayerArgs, opts: CustomResourceOptions) = this()
    
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
    val ebsVolumes: Output_[js.UndefOr[js.Array[NodejsAppLayerEbsVolume]]] = js.native
    
    /**
      * Name of an Elastic Load Balancer to attach to this layer
      */
    val elasticLoadBalancer: Output_[js.UndefOr[String]] = js.native
    
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
      * The version of NodeJS to use. Defaults to "0.10.38".
      */
    val nodejsVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The id of the stack the layer will belong to.
      */
    val stackId: Output_[String] = js.native
    
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
  object NodejsAppLayer {
    
    @JSImport("@pulumi/aws/opsworks/nodejsAppLayer", "NodejsAppLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NodejsAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): NodejsAppLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NodejsAppLayer]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NodejsAppLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NodejsAppLayer]
    inline def get(name: String, id: Input[ID], state: NodejsAppLayerState): NodejsAppLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NodejsAppLayer]
    inline def get(name: String, id: Input[ID], state: NodejsAppLayerState, opts: CustomResourceOptions): NodejsAppLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NodejsAppLayer]
    
    /**
      * Returns true if the given object is an instance of NodejsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ Boolean]
  }
  
  trait NodejsAppLayerArgs extends StObject {
    
    /**
      * Whether to automatically assign an elastic IP address to the layer's instances.
      */
    val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
      */
    val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether to enable auto-healing for the layer.
      */
    val autoHealing: js.UndefOr[Input[Boolean]] = js.undefined
    
    val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ARN of an IAM profile that will be used for the layer's instances.
      */
    val customInstanceProfileArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Custom JSON attributes to apply to the layer.
      */
    val customJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Ids for a set of security groups to apply to the layer's instances.
      */
    val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable Elastic Load Balancing connection draining.
      */
    val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
      */
    val ebsVolumes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.NodejsAppLayerEbsVolume]]]
      ] = js.undefined
    
    /**
      * Name of an Elastic Load Balancer to attach to this layer
      */
    val elasticLoadBalancer: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether to install OS and package updates on each instance when it boots.
      */
    val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
      */
    val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A human-readable name for the layer.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of NodeJS to use. Defaults to "0.10.38".
      */
    val nodejsVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the stack the layer will belong to.
      */
    val stackId: Input[String]
    
    /**
      * Names of a set of system packages to install on the layer's instances.
      */
    val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether to use EBS-optimized instances.
      */
    val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object NodejsAppLayerArgs {
    
    inline def apply(stackId: Input[String]): NodejsAppLayerArgs = {
      val __obj = js.Dynamic.literal(stackId = stackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodejsAppLayerArgs]
    }
    
    extension [Self <: NodejsAppLayerArgs](x: Self) {
      
      inline def setAutoAssignElasticIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignElasticIps", value.asInstanceOf[js.Any])
      
      inline def setAutoAssignElasticIpsUndefined: Self = StObject.set(x, "autoAssignElasticIps", js.undefined)
      
      inline def setAutoAssignPublicIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignPublicIps", value.asInstanceOf[js.Any])
      
      inline def setAutoAssignPublicIpsUndefined: Self = StObject.set(x, "autoAssignPublicIps", js.undefined)
      
      inline def setAutoHealing(value: Input[Boolean]): Self = StObject.set(x, "autoHealing", value.asInstanceOf[js.Any])
      
      inline def setAutoHealingUndefined: Self = StObject.set(x, "autoHealing", js.undefined)
      
      inline def setCustomConfigureRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customConfigureRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomConfigureRecipesUndefined: Self = StObject.set(x, "customConfigureRecipes", js.undefined)
      
      inline def setCustomConfigureRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customConfigureRecipes", js.Array(value :_*))
      
      inline def setCustomDeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customDeployRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomDeployRecipesUndefined: Self = StObject.set(x, "customDeployRecipes", js.undefined)
      
      inline def setCustomDeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customDeployRecipes", js.Array(value :_*))
      
      inline def setCustomInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "customInstanceProfileArn", value.asInstanceOf[js.Any])
      
      inline def setCustomInstanceProfileArnUndefined: Self = StObject.set(x, "customInstanceProfileArn", js.undefined)
      
      inline def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      inline def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      inline def setCustomSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setCustomSecurityGroupIdsUndefined: Self = StObject.set(x, "customSecurityGroupIds", js.undefined)
      
      inline def setCustomSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "customSecurityGroupIds", js.Array(value :_*))
      
      inline def setCustomSetupRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSetupRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomSetupRecipesUndefined: Self = StObject.set(x, "customSetupRecipes", js.undefined)
      
      inline def setCustomSetupRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customSetupRecipes", js.Array(value :_*))
      
      inline def setCustomShutdownRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customShutdownRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomShutdownRecipesUndefined: Self = StObject.set(x, "customShutdownRecipes", js.undefined)
      
      inline def setCustomShutdownRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customShutdownRecipes", js.Array(value :_*))
      
      inline def setCustomUndeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customUndeployRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomUndeployRecipesUndefined: Self = StObject.set(x, "customUndeployRecipes", js.undefined)
      
      inline def setCustomUndeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customUndeployRecipes", js.Array(value :_*))
      
      inline def setDrainElbOnShutdown(value: Input[Boolean]): Self = StObject.set(x, "drainElbOnShutdown", value.asInstanceOf[js.Any])
      
      inline def setDrainElbOnShutdownUndefined: Self = StObject.set(x, "drainElbOnShutdown", js.undefined)
      
      inline def setEbsVolumes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.NodejsAppLayerEbsVolume]]]): Self = StObject.set(x, "ebsVolumes", value.asInstanceOf[js.Any])
      
      inline def setEbsVolumesUndefined: Self = StObject.set(x, "ebsVolumes", js.undefined)
      
      inline def setEbsVolumesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.NodejsAppLayerEbsVolume]*): Self = StObject.set(x, "ebsVolumes", js.Array(value :_*))
      
      inline def setElasticLoadBalancer(value: Input[String]): Self = StObject.set(x, "elasticLoadBalancer", value.asInstanceOf[js.Any])
      
      inline def setElasticLoadBalancerUndefined: Self = StObject.set(x, "elasticLoadBalancer", js.undefined)
      
      inline def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = StObject.set(x, "installUpdatesOnBoot", value.asInstanceOf[js.Any])
      
      inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "installUpdatesOnBoot", js.undefined)
      
      inline def setInstanceShutdownTimeout(value: Input[Double]): Self = StObject.set(x, "instanceShutdownTimeout", value.asInstanceOf[js.Any])
      
      inline def setInstanceShutdownTimeoutUndefined: Self = StObject.set(x, "instanceShutdownTimeout", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNodejsVersion(value: Input[String]): Self = StObject.set(x, "nodejsVersion", value.asInstanceOf[js.Any])
      
      inline def setNodejsVersionUndefined: Self = StObject.set(x, "nodejsVersion", js.undefined)
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setSystemPackages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "systemPackages", value.asInstanceOf[js.Any])
      
      inline def setSystemPackagesUndefined: Self = StObject.set(x, "systemPackages", js.undefined)
      
      inline def setSystemPackagesVarargs(value: Input[String]*): Self = StObject.set(x, "systemPackages", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUseEbsOptimizedInstances(value: Input[Boolean]): Self = StObject.set(x, "useEbsOptimizedInstances", value.asInstanceOf[js.Any])
      
      inline def setUseEbsOptimizedInstancesUndefined: Self = StObject.set(x, "useEbsOptimizedInstances", js.undefined)
    }
  }
  
  trait NodejsAppLayerState extends StObject {
    
    /**
      * The Amazon Resource Name(ARN) of the layer.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether to automatically assign an elastic IP address to the layer's instances.
      */
    val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
      */
    val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether to enable auto-healing for the layer.
      */
    val autoHealing: js.UndefOr[Input[Boolean]] = js.undefined
    
    val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ARN of an IAM profile that will be used for the layer's instances.
      */
    val customInstanceProfileArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Custom JSON attributes to apply to the layer.
      */
    val customJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Ids for a set of security groups to apply to the layer's instances.
      */
    val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable Elastic Load Balancing connection draining.
      */
    val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
      */
    val ebsVolumes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.NodejsAppLayerEbsVolume]]]
      ] = js.undefined
    
    /**
      * Name of an Elastic Load Balancer to attach to this layer
      */
    val elasticLoadBalancer: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether to install OS and package updates on each instance when it boots.
      */
    val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
      */
    val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A human-readable name for the layer.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of NodeJS to use. Defaults to "0.10.38".
      */
    val nodejsVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the stack the layer will belong to.
      */
    val stackId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Names of a set of system packages to install on the layer's instances.
      */
    val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether to use EBS-optimized instances.
      */
    val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object NodejsAppLayerState {
    
    inline def apply(): NodejsAppLayerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodejsAppLayerState]
    }
    
    extension [Self <: NodejsAppLayerState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAutoAssignElasticIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignElasticIps", value.asInstanceOf[js.Any])
      
      inline def setAutoAssignElasticIpsUndefined: Self = StObject.set(x, "autoAssignElasticIps", js.undefined)
      
      inline def setAutoAssignPublicIps(value: Input[Boolean]): Self = StObject.set(x, "autoAssignPublicIps", value.asInstanceOf[js.Any])
      
      inline def setAutoAssignPublicIpsUndefined: Self = StObject.set(x, "autoAssignPublicIps", js.undefined)
      
      inline def setAutoHealing(value: Input[Boolean]): Self = StObject.set(x, "autoHealing", value.asInstanceOf[js.Any])
      
      inline def setAutoHealingUndefined: Self = StObject.set(x, "autoHealing", js.undefined)
      
      inline def setCustomConfigureRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customConfigureRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomConfigureRecipesUndefined: Self = StObject.set(x, "customConfigureRecipes", js.undefined)
      
      inline def setCustomConfigureRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customConfigureRecipes", js.Array(value :_*))
      
      inline def setCustomDeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customDeployRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomDeployRecipesUndefined: Self = StObject.set(x, "customDeployRecipes", js.undefined)
      
      inline def setCustomDeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customDeployRecipes", js.Array(value :_*))
      
      inline def setCustomInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "customInstanceProfileArn", value.asInstanceOf[js.Any])
      
      inline def setCustomInstanceProfileArnUndefined: Self = StObject.set(x, "customInstanceProfileArn", js.undefined)
      
      inline def setCustomJson(value: Input[String]): Self = StObject.set(x, "customJson", value.asInstanceOf[js.Any])
      
      inline def setCustomJsonUndefined: Self = StObject.set(x, "customJson", js.undefined)
      
      inline def setCustomSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setCustomSecurityGroupIdsUndefined: Self = StObject.set(x, "customSecurityGroupIds", js.undefined)
      
      inline def setCustomSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "customSecurityGroupIds", js.Array(value :_*))
      
      inline def setCustomSetupRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customSetupRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomSetupRecipesUndefined: Self = StObject.set(x, "customSetupRecipes", js.undefined)
      
      inline def setCustomSetupRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customSetupRecipes", js.Array(value :_*))
      
      inline def setCustomShutdownRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customShutdownRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomShutdownRecipesUndefined: Self = StObject.set(x, "customShutdownRecipes", js.undefined)
      
      inline def setCustomShutdownRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customShutdownRecipes", js.Array(value :_*))
      
      inline def setCustomUndeployRecipes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customUndeployRecipes", value.asInstanceOf[js.Any])
      
      inline def setCustomUndeployRecipesUndefined: Self = StObject.set(x, "customUndeployRecipes", js.undefined)
      
      inline def setCustomUndeployRecipesVarargs(value: Input[String]*): Self = StObject.set(x, "customUndeployRecipes", js.Array(value :_*))
      
      inline def setDrainElbOnShutdown(value: Input[Boolean]): Self = StObject.set(x, "drainElbOnShutdown", value.asInstanceOf[js.Any])
      
      inline def setDrainElbOnShutdownUndefined: Self = StObject.set(x, "drainElbOnShutdown", js.undefined)
      
      inline def setEbsVolumes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.NodejsAppLayerEbsVolume]]]): Self = StObject.set(x, "ebsVolumes", value.asInstanceOf[js.Any])
      
      inline def setEbsVolumesUndefined: Self = StObject.set(x, "ebsVolumes", js.undefined)
      
      inline def setEbsVolumesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.NodejsAppLayerEbsVolume]*): Self = StObject.set(x, "ebsVolumes", js.Array(value :_*))
      
      inline def setElasticLoadBalancer(value: Input[String]): Self = StObject.set(x, "elasticLoadBalancer", value.asInstanceOf[js.Any])
      
      inline def setElasticLoadBalancerUndefined: Self = StObject.set(x, "elasticLoadBalancer", js.undefined)
      
      inline def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = StObject.set(x, "installUpdatesOnBoot", value.asInstanceOf[js.Any])
      
      inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "installUpdatesOnBoot", js.undefined)
      
      inline def setInstanceShutdownTimeout(value: Input[Double]): Self = StObject.set(x, "instanceShutdownTimeout", value.asInstanceOf[js.Any])
      
      inline def setInstanceShutdownTimeoutUndefined: Self = StObject.set(x, "instanceShutdownTimeout", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNodejsVersion(value: Input[String]): Self = StObject.set(x, "nodejsVersion", value.asInstanceOf[js.Any])
      
      inline def setNodejsVersionUndefined: Self = StObject.set(x, "nodejsVersion", js.undefined)
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      inline def setSystemPackages(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "systemPackages", value.asInstanceOf[js.Any])
      
      inline def setSystemPackagesUndefined: Self = StObject.set(x, "systemPackages", js.undefined)
      
      inline def setSystemPackagesVarargs(value: Input[String]*): Self = StObject.set(x, "systemPackages", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUseEbsOptimizedInstances(value: Input[Boolean]): Self = StObject.set(x, "useEbsOptimizedInstances", value.asInstanceOf[js.Any])
      
      inline def setUseEbsOptimizedInstancesUndefined: Self = StObject.set(x, "useEbsOptimizedInstances", js.undefined)
    }
  }
}
