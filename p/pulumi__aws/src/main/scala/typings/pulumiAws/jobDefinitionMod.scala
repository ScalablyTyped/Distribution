package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.batch.JobDefinitionRetryStrategy
import typings.pulumiAws.outputMod.batch.JobDefinitionTimeout
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobDefinitionMod {
  
  @JSImport("@pulumi/aws/batch/jobDefinition", "JobDefinition")
  @js.native
  class JobDefinition protected () extends CustomResource {
    /**
      * Create a JobDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobDefinitionArgs) = this()
    def this(name: String, args: JobDefinitionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name of the job definition.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
      * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
      */
    val containerProperties: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the name of the job definition.
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies the parameter substitution placeholders to set in the job definition.
      */
    val parameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
      * Maximum number of `retryStrategy` is `1`.  Defined below.
      */
    val retryStrategy: Output_[js.UndefOr[JobDefinitionRetryStrategy]] = js.native
    
    /**
      * The revision of the job definition.
      */
    val revision: Output_[Double] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
      */
    val timeout: Output_[js.UndefOr[JobDefinitionTimeout]] = js.native
    
    /**
      * The type of job definition.  Must be `container`
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object JobDefinition {
    
    @JSImport("@pulumi/aws/batch/jobDefinition", "JobDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[JobDefinition]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[JobDefinition]
    inline def get(name: String, id: Input[ID], state: JobDefinitionState): JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[JobDefinition]
    inline def get(name: String, id: Input[ID], state: JobDefinitionState, opts: CustomResourceOptions): JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[JobDefinition]
    
    /**
      * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean]
  }
  
  trait JobDefinitionArgs extends StObject {
    
    /**
      * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
      * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
      */
    val containerProperties: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the job definition.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the parameter substitution placeholders to set in the job definition.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
      * Maximum number of `retryStrategy` is `1`.  Defined below.
      */
    val retryStrategy: js.UndefOr[Input[typings.pulumiAws.inputMod.batch.JobDefinitionRetryStrategy]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
      */
    val timeout: js.UndefOr[Input[typings.pulumiAws.inputMod.batch.JobDefinitionTimeout]] = js.undefined
    
    /**
      * The type of job definition.  Must be `container`
      */
    val `type`: Input[String]
  }
  object JobDefinitionArgs {
    
    inline def apply(`type`: Input[String]): JobDefinitionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobDefinitionArgs]
    }
    
    extension [Self <: JobDefinitionArgs](x: Self) {
      
      inline def setContainerProperties(value: Input[String]): Self = StObject.set(x, "containerProperties", value.asInstanceOf[js.Any])
      
      inline def setContainerPropertiesUndefined: Self = StObject.set(x, "containerProperties", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setRetryStrategy(value: Input[typings.pulumiAws.inputMod.batch.JobDefinitionRetryStrategy]): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Input[typings.pulumiAws.inputMod.batch.JobDefinitionTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobDefinitionState extends StObject {
    
    /**
      * The Amazon Resource Name of the job definition.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
      * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
      */
    val containerProperties: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the job definition.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the parameter substitution placeholders to set in the job definition.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
      * Maximum number of `retryStrategy` is `1`.  Defined below.
      */
    val retryStrategy: js.UndefOr[Input[typings.pulumiAws.inputMod.batch.JobDefinitionRetryStrategy]] = js.undefined
    
    /**
      * The revision of the job definition.
      */
    val revision: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
      */
    val timeout: js.UndefOr[Input[typings.pulumiAws.inputMod.batch.JobDefinitionTimeout]] = js.undefined
    
    /**
      * The type of job definition.  Must be `container`
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object JobDefinitionState {
    
    inline def apply(): JobDefinitionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobDefinitionState]
    }
    
    extension [Self <: JobDefinitionState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setContainerProperties(value: Input[String]): Self = StObject.set(x, "containerProperties", value.asInstanceOf[js.Any])
      
      inline def setContainerPropertiesUndefined: Self = StObject.set(x, "containerProperties", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setRetryStrategy(value: Input[typings.pulumiAws.inputMod.batch.JobDefinitionRetryStrategy]): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRevision(value: Input[Double]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Input[typings.pulumiAws.inputMod.batch.JobDefinitionTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
