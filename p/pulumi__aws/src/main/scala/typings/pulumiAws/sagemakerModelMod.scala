package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.sagemaker.ModelContainer
import typings.pulumiAws.outputMod.sagemaker.ModelPrimaryContainer
import typings.pulumiAws.outputMod.sagemaker.ModelVpcConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemakerModelMod {
  
  @JSImport("@pulumi/aws/sagemaker/model", "Model")
  @js.native
  class Model protected () extends CustomResource {
    /**
      * Create a Model resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ModelArgs) = this()
    def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this model.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
      */
    val containers: Output_[js.UndefOr[js.Array[ModelContainer]]] = js.native
    
    /**
      * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
      */
    val enableNetworkIsolation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A role that SageMaker can assume to access model artifacts and docker images for deployment.
      */
    val executionRoleArn: Output_[String] = js.native
    
    /**
      * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
      */
    val primaryContainer: Output_[js.UndefOr[ModelPrimaryContainer]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
      */
    val vpcConfig: Output_[js.UndefOr[ModelVpcConfig]] = js.native
  }
  /* static members */
  object Model {
    
    @JSImport("@pulumi/aws/sagemaker/model", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Model]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Model]
    inline def get(name: String, id: Input[ID], state: ModelState): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Model]
    inline def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Model]
    
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean]
  }
  
  trait ModelArgs extends StObject {
    
    /**
      * Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
      */
    val containers: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.sagemaker.ModelContainer]]]] = js.undefined
    
    /**
      * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
      */
    val enableNetworkIsolation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A role that SageMaker can assume to access model artifacts and docker images for deployment.
      */
    val executionRoleArn: Input[String]
    
    /**
      * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
      */
    val primaryContainer: js.UndefOr[Input[typings.pulumiAws.inputMod.sagemaker.ModelPrimaryContainer]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
      */
    val vpcConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.sagemaker.ModelVpcConfig]] = js.undefined
  }
  object ModelArgs {
    
    inline def apply(executionRoleArn: Input[String]): ModelArgs = {
      val __obj = js.Dynamic.literal(executionRoleArn = executionRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelArgs]
    }
    
    extension [Self <: ModelArgs](x: Self) {
      
      inline def setContainers(value: Input[js.Array[Input[typings.pulumiAws.inputMod.sagemaker.ModelContainer]]]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
      
      inline def setContainersVarargs(value: Input[typings.pulumiAws.inputMod.sagemaker.ModelContainer]*): Self = StObject.set(x, "containers", js.Array(value :_*))
      
      inline def setEnableNetworkIsolation(value: Input[Boolean]): Self = StObject.set(x, "enableNetworkIsolation", value.asInstanceOf[js.Any])
      
      inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "enableNetworkIsolation", js.undefined)
      
      inline def setExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrimaryContainer(value: Input[typings.pulumiAws.inputMod.sagemaker.ModelPrimaryContainer]): Self = StObject.set(x, "primaryContainer", value.asInstanceOf[js.Any])
      
      inline def setPrimaryContainerUndefined: Self = StObject.set(x, "primaryContainer", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.ModelVpcConfig]): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
      
      inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
    }
  }
  
  trait ModelState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this model.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
      */
    val containers: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.sagemaker.ModelContainer]]]] = js.undefined
    
    /**
      * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
      */
    val enableNetworkIsolation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A role that SageMaker can assume to access model artifacts and docker images for deployment.
      */
    val executionRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
      */
    val primaryContainer: js.UndefOr[Input[typings.pulumiAws.inputMod.sagemaker.ModelPrimaryContainer]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
      */
    val vpcConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.sagemaker.ModelVpcConfig]] = js.undefined
  }
  object ModelState {
    
    inline def apply(): ModelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelState]
    }
    
    extension [Self <: ModelState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setContainers(value: Input[js.Array[Input[typings.pulumiAws.inputMod.sagemaker.ModelContainer]]]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
      
      inline def setContainersVarargs(value: Input[typings.pulumiAws.inputMod.sagemaker.ModelContainer]*): Self = StObject.set(x, "containers", js.Array(value :_*))
      
      inline def setEnableNetworkIsolation(value: Input[Boolean]): Self = StObject.set(x, "enableNetworkIsolation", value.asInstanceOf[js.Any])
      
      inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "enableNetworkIsolation", js.undefined)
      
      inline def setExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
      
      inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrimaryContainer(value: Input[typings.pulumiAws.inputMod.sagemaker.ModelPrimaryContainer]): Self = StObject.set(x, "primaryContainer", value.asInstanceOf[js.Any])
      
      inline def setPrimaryContainerUndefined: Self = StObject.set(x, "primaryContainer", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.ModelVpcConfig]): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
      
      inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
    }
  }
}
