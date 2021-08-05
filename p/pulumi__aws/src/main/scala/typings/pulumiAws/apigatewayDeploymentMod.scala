package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayDeploymentMod {
  
  @JSImport("@pulumi/aws/apigateway/deployment", "Deployment")
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
      * The creation date of the deployment
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The description of the deployment
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The execution ARN to be used in `lambdaPermission` resource's `sourceArn`
      * when allowing API Gateway to invoke a Lambda function,
      * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
      */
    val executionArn: Output_[String] = js.native
    
    /**
      * The URL to invoke the API pointing to the stage,
      * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
      */
    val invokeUrl: Output_[String] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Output_[String] = js.native
    
    /**
      * The description of the stage
      */
    val stageDescription: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
      */
    val stageName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
      */
    val triggers: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map that defines variables for the stage
      */
    val variables: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Deployment {
    
    @JSImport("@pulumi/aws/apigateway/deployment", "Deployment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Deployment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Deployment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Deployment]
    inline def get(name: String, id: Input[ID], state: DeploymentState): Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Deployment]
    inline def get(name: String, id: Input[ID], state: DeploymentState, opts: CustomResourceOptions): Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Deployment]
    
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/deployment.Deployment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/deployment.Deployment */ Boolean]
  }
  
  trait DeploymentArgs extends StObject {
    
    /**
      * The description of the deployment
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi]
    
    /**
      * The description of the stage
      */
    val stageDescription: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
      */
    val stageName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
      */
    val triggers: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map that defines variables for the stage
      */
    val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DeploymentArgs {
    
    inline def apply(restApi: Input[String | RestApi]): DeploymentArgs = {
      val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentArgs]
    }
    
    extension [Self <: DeploymentArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setStageDescription(value: Input[String]): Self = StObject.set(x, "stageDescription", value.asInstanceOf[js.Any])
      
      inline def setStageDescriptionUndefined: Self = StObject.set(x, "stageDescription", js.undefined)
      
      inline def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
      
      inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
      
      inline def setTriggers(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
      
      inline def setVariables(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait DeploymentState extends StObject {
    
    /**
      * The creation date of the deployment
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the deployment
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The execution ARN to be used in `lambdaPermission` resource's `sourceArn`
      * when allowing API Gateway to invoke a Lambda function,
      * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
      */
    val executionArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL to invoke the API pointing to the stage,
      * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
      */
    val invokeUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.undefined
    
    /**
      * The description of the stage
      */
    val stageDescription: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
      */
    val stageName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
      */
    val triggers: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map that defines variables for the stage
      */
    val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DeploymentState {
    
    inline def apply(): DeploymentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentState]
    }
    
    extension [Self <: DeploymentState](x: Self) {
      
      inline def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExecutionArn(value: Input[String]): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
      
      inline def setExecutionArnUndefined: Self = StObject.set(x, "executionArn", js.undefined)
      
      inline def setInvokeUrl(value: Input[String]): Self = StObject.set(x, "invokeUrl", value.asInstanceOf[js.Any])
      
      inline def setInvokeUrlUndefined: Self = StObject.set(x, "invokeUrl", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      inline def setStageDescription(value: Input[String]): Self = StObject.set(x, "stageDescription", value.asInstanceOf[js.Any])
      
      inline def setStageDescriptionUndefined: Self = StObject.set(x, "stageDescription", js.undefined)
      
      inline def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
      
      inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
      
      inline def setTriggers(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
      
      inline def setVariables(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
}
