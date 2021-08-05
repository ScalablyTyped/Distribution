package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.Deployment
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiAws.outputMod.apigateway.StageAccessLogSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayStageMod {
  
  @JSImport("@pulumi/aws/apigateway/stage", "Stage")
  @js.native
  class Stage protected () extends CustomResource {
    /**
      * Create a Stage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StageArgs) = this()
    def this(name: String, args: StageArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Enables access logs for the API stage. Detailed below.
      */
    val accessLogSettings: Output_[js.UndefOr[StageAccessLogSettings]] = js.native
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies whether a cache cluster is enabled for the stage
      */
    val cacheClusterEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
      */
    val cacheClusterSize: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The identifier of a client certificate for the stage.
      */
    val clientCertificateId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the deployment that the stage points to
      */
    val deployment: Output_[String] = js.native
    
    /**
      * The description of the stage
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The version of the associated API documentation
      */
    val documentationVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The execution ARN to be used in `lambdaPermission`'s `sourceArn`
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
      * The name of the stage
      */
    val stageName: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map that defines the stage variables
      */
    val variables: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Whether active tracing with X-ray is enabled. Defaults to `false`.
      */
    val xrayTracingEnabled: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object Stage {
    
    @JSImport("@pulumi/aws/apigateway/stage", "Stage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Stage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Stage]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Stage]
    inline def get(name: String, id: Input[ID], state: StageState): Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Stage]
    inline def get(name: String, id: Input[ID], state: StageState, opts: CustomResourceOptions): Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Stage]
    
    /**
      * Returns true if the given object is an instance of Stage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/stage.Stage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/stage.Stage */ Boolean]
  }
  
  trait StageArgs extends StObject {
    
    /**
      * Enables access logs for the API stage. Detailed below.
      */
    val accessLogSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.StageAccessLogSettings]] = js.undefined
    
    /**
      * Specifies whether a cache cluster is enabled for the stage
      */
    val cacheClusterEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
      */
    val cacheClusterSize: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of a client certificate for the stage.
      */
    val clientCertificateId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the deployment that the stage points to
      */
    val deployment: Input[String | Deployment]
    
    /**
      * The description of the stage
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the associated API documentation
      */
    val documentationVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi]
    
    /**
      * The name of the stage
      */
    val stageName: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map that defines the stage variables
      */
    val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether active tracing with X-ray is enabled. Defaults to `false`.
      */
    val xrayTracingEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object StageArgs {
    
    inline def apply(deployment: Input[String | Deployment], restApi: Input[String | RestApi], stageName: Input[String]): StageArgs = {
      val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageArgs]
    }
    
    extension [Self <: StageArgs](x: Self) {
      
      inline def setAccessLogSettings(value: Input[typings.pulumiAws.inputMod.apigateway.StageAccessLogSettings]): Self = StObject.set(x, "accessLogSettings", value.asInstanceOf[js.Any])
      
      inline def setAccessLogSettingsUndefined: Self = StObject.set(x, "accessLogSettings", js.undefined)
      
      inline def setCacheClusterEnabled(value: Input[Boolean]): Self = StObject.set(x, "cacheClusterEnabled", value.asInstanceOf[js.Any])
      
      inline def setCacheClusterEnabledUndefined: Self = StObject.set(x, "cacheClusterEnabled", js.undefined)
      
      inline def setCacheClusterSize(value: Input[String]): Self = StObject.set(x, "cacheClusterSize", value.asInstanceOf[js.Any])
      
      inline def setCacheClusterSizeUndefined: Self = StObject.set(x, "cacheClusterSize", js.undefined)
      
      inline def setClientCertificateId(value: Input[String]): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
      
      inline def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
      
      inline def setDeployment(value: Input[String | Deployment]): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDocumentationVersion(value: Input[String]): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
      
      inline def setDocumentationVersionUndefined: Self = StObject.set(x, "documentationVersion", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVariables(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      inline def setXrayTracingEnabled(value: Input[Boolean]): Self = StObject.set(x, "xrayTracingEnabled", value.asInstanceOf[js.Any])
      
      inline def setXrayTracingEnabledUndefined: Self = StObject.set(x, "xrayTracingEnabled", js.undefined)
    }
  }
  
  trait StageState extends StObject {
    
    /**
      * Enables access logs for the API stage. Detailed below.
      */
    val accessLogSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.StageAccessLogSettings]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether a cache cluster is enabled for the stage
      */
    val cacheClusterEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
      */
    val cacheClusterSize: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of a client certificate for the stage.
      */
    val clientCertificateId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the deployment that the stage points to
      */
    val deployment: js.UndefOr[Input[String | Deployment]] = js.undefined
    
    /**
      * The description of the stage
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the associated API documentation
      */
    val documentationVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The execution ARN to be used in `lambdaPermission`'s `sourceArn`
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
      * The name of the stage
      */
    val stageName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map that defines the stage variables
      */
    val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether active tracing with X-ray is enabled. Defaults to `false`.
      */
    val xrayTracingEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object StageState {
    
    inline def apply(): StageState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StageState]
    }
    
    extension [Self <: StageState](x: Self) {
      
      inline def setAccessLogSettings(value: Input[typings.pulumiAws.inputMod.apigateway.StageAccessLogSettings]): Self = StObject.set(x, "accessLogSettings", value.asInstanceOf[js.Any])
      
      inline def setAccessLogSettingsUndefined: Self = StObject.set(x, "accessLogSettings", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCacheClusterEnabled(value: Input[Boolean]): Self = StObject.set(x, "cacheClusterEnabled", value.asInstanceOf[js.Any])
      
      inline def setCacheClusterEnabledUndefined: Self = StObject.set(x, "cacheClusterEnabled", js.undefined)
      
      inline def setCacheClusterSize(value: Input[String]): Self = StObject.set(x, "cacheClusterSize", value.asInstanceOf[js.Any])
      
      inline def setCacheClusterSizeUndefined: Self = StObject.set(x, "cacheClusterSize", js.undefined)
      
      inline def setClientCertificateId(value: Input[String]): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
      
      inline def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
      
      inline def setDeployment(value: Input[String | Deployment]): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
      
      inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDocumentationVersion(value: Input[String]): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
      
      inline def setDocumentationVersionUndefined: Self = StObject.set(x, "documentationVersion", js.undefined)
      
      inline def setExecutionArn(value: Input[String]): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
      
      inline def setExecutionArnUndefined: Self = StObject.set(x, "executionArn", js.undefined)
      
      inline def setInvokeUrl(value: Input[String]): Self = StObject.set(x, "invokeUrl", value.asInstanceOf[js.Any])
      
      inline def setInvokeUrlUndefined: Self = StObject.set(x, "invokeUrl", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      inline def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
      
      inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVariables(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      inline def setXrayTracingEnabled(value: Input[Boolean]): Self = StObject.set(x, "xrayTracingEnabled", value.asInstanceOf[js.Any])
      
      inline def setXrayTracingEnabledUndefined: Self = StObject.set(x, "xrayTracingEnabled", js.undefined)
    }
  }
}
