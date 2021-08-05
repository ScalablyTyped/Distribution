package typings.pulumiAws

import typings.pulumiAws.outputMod.codedeploy.DeploymentConfigMinimumHealthyHosts
import typings.pulumiAws.outputMod.codedeploy.DeploymentConfigTrafficRoutingConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentConfigMod {
  
  @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig")
  @js.native
  class DeploymentConfig protected () extends CustomResource {
    /**
      * Create a DeploymentConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentConfigArgs) = this()
    def this(name: String, args: DeploymentConfigArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
      */
    val computePlatform: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The AWS Assigned deployment config id
      */
    val deploymentConfigId: Output_[String] = js.native
    
    /**
      * The name of the deployment config.
      */
    val deploymentConfigName: Output_[String] = js.native
    
    /**
      * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
      */
    val minimumHealthyHosts: Output_[js.UndefOr[DeploymentConfigMinimumHealthyHosts]] = js.native
    
    /**
      * A trafficRoutingConfig block. Traffic Routing Config is documented below.
      */
    val trafficRoutingConfig: Output_[js.UndefOr[DeploymentConfigTrafficRoutingConfig]] = js.native
  }
  /* static members */
  object DeploymentConfig {
    
    @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DeploymentConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DeploymentConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DeploymentConfig]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DeploymentConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DeploymentConfig]
    inline def get(name: String, id: Input[ID], state: DeploymentConfigState): DeploymentConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DeploymentConfig]
    inline def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): DeploymentConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DeploymentConfig]
    
    /**
      * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean]
  }
  
  trait DeploymentConfigArgs extends StObject {
    
    /**
      * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
      */
    val computePlatform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the deployment config.
      */
    val deploymentConfigName: Input[String]
    
    /**
      * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
      */
    val minimumHealthyHosts: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]] = js.undefined
    
    /**
      * A trafficRoutingConfig block. Traffic Routing Config is documented below.
      */
    val trafficRoutingConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]
      ] = js.undefined
  }
  object DeploymentConfigArgs {
    
    inline def apply(deploymentConfigName: Input[String]): DeploymentConfigArgs = {
      val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentConfigArgs]
    }
    
    extension [Self <: DeploymentConfigArgs](x: Self) {
      
      inline def setComputePlatform(value: Input[String]): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
      
      inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
      
      inline def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      inline def setMinimumHealthyHosts(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]): Self = StObject.set(x, "minimumHealthyHosts", value.asInstanceOf[js.Any])
      
      inline def setMinimumHealthyHostsUndefined: Self = StObject.set(x, "minimumHealthyHosts", js.undefined)
      
      inline def setTrafficRoutingConfig(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]): Self = StObject.set(x, "trafficRoutingConfig", value.asInstanceOf[js.Any])
      
      inline def setTrafficRoutingConfigUndefined: Self = StObject.set(x, "trafficRoutingConfig", js.undefined)
    }
  }
  
  trait DeploymentConfigState extends StObject {
    
    /**
      * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
      */
    val computePlatform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS Assigned deployment config id
      */
    val deploymentConfigId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the deployment config.
      */
    val deploymentConfigName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
      */
    val minimumHealthyHosts: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]] = js.undefined
    
    /**
      * A trafficRoutingConfig block. Traffic Routing Config is documented below.
      */
    val trafficRoutingConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]
      ] = js.undefined
  }
  object DeploymentConfigState {
    
    inline def apply(): DeploymentConfigState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentConfigState]
    }
    
    extension [Self <: DeploymentConfigState](x: Self) {
      
      inline def setComputePlatform(value: Input[String]): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
      
      inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
      
      inline def setDeploymentConfigId(value: Input[String]): Self = StObject.set(x, "deploymentConfigId", value.asInstanceOf[js.Any])
      
      inline def setDeploymentConfigIdUndefined: Self = StObject.set(x, "deploymentConfigId", js.undefined)
      
      inline def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      inline def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
      
      inline def setMinimumHealthyHosts(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]): Self = StObject.set(x, "minimumHealthyHosts", value.asInstanceOf[js.Any])
      
      inline def setMinimumHealthyHostsUndefined: Self = StObject.set(x, "minimumHealthyHosts", js.undefined)
      
      inline def setTrafficRoutingConfig(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]): Self = StObject.set(x, "trafficRoutingConfig", value.asInstanceOf[js.Any])
      
      inline def setTrafficRoutingConfigUndefined: Self = StObject.set(x, "trafficRoutingConfig", js.undefined)
    }
  }
}
