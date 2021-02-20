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

object deploymentMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/deployment", "Deployment")
  @js.native
  class Deployment protected () extends CustomResource {
    /**
      * Create a Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentArgs) = this()
    def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * Whether the deployment was automatically released.
      */
    val autoDeployed: Output_[Boolean] = js.native
    
    /**
      * The description for the deployment resource. Must be less than or equal to 1024 characters in length.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
      */
    val triggers: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Deployment {
    
    /**
      * Get an existing Deployment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigatewayv2/deployment", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID]): Deployment = js.native
    @JSImport("@pulumi/aws/apigatewayv2/deployment", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Deployment = js.native
    @JSImport("@pulumi/aws/apigatewayv2/deployment", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentState): Deployment = js.native
    @JSImport("@pulumi/aws/apigatewayv2/deployment", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentState, opts: CustomResourceOptions): Deployment = js.native
    
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigatewayv2/deployment", "Deployment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/deployment.Deployment */ Boolean = js.native
  }
  
  @js.native
  trait DeploymentArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String] = js.native
    
    /**
      * The description for the deployment resource. Must be less than or equal to 1024 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
      */
    val triggers: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object DeploymentArgs {
    
    @scala.inline
    def apply(apiId: Input[String]): DeploymentArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentArgs]
    }
    
    @scala.inline
    implicit class DeploymentArgsMutableBuilder[Self <: DeploymentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTriggers(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    }
  }
  
  @js.native
  trait DeploymentState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the deployment was automatically released.
      */
    val autoDeployed: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The description for the deployment resource. Must be less than or equal to 1024 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
      */
    val triggers: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object DeploymentState {
    
    @scala.inline
    def apply(): DeploymentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentState]
    }
    
    @scala.inline
    implicit class DeploymentStateMutableBuilder[Self <: DeploymentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setAutoDeployed(value: Input[Boolean]): Self = StObject.set(x, "autoDeployed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeployedUndefined: Self = StObject.set(x, "autoDeployed", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTriggers(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    }
  }
}
