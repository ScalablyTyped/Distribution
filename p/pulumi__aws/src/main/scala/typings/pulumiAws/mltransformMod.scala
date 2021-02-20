package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.MLTransformInputRecordTable
import typings.pulumiAws.outputMod.glue.MLTransformParameters
import typings.pulumiAws.outputMod.glue.MLTransformSchema
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mltransformMod {
  
  @JSImport("@pulumi/aws/glue/mltransform", "MLTransform")
  @js.native
  class MLTransform protected () extends CustomResource {
    /**
      * Create a MLTransform resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MLTransformArgs) = this()
    def this(name: String, args: MLTransformArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of Glue ML Transform.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the ML Transform.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: Output_[String] = js.native
    
    /**
      * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
      */
    val inputRecordTables: Output_[js.Array[MLTransformInputRecordTable]] = js.native
    
    /**
      * The number of labels available for this transform.
      */
    val labelCount: Output_[Double] = js.native
    
    /**
      * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `maxCapacity` is a mutually exclusive option with `numberOfWorkers` and `workerType`.
      */
    val maxCapacity: Output_[Double] = js.native
    
    /**
      * The maximum number of times to retry this ML Transform if it fails.
      */
    val maxRetries: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name you assign to this ML Transform. It must be unique in your account.
      */
    val name: Output_[String] = js.native
    
    /**
      * The number of workers of a defined `workerType` that are allocated when an ML Transform runs. Required with `workerType`.
      */
    val numberOfWorkers: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
      */
    val parameters: Output_[MLTransformParameters] = js.native
    
    /**
      * The ARN of the IAM role associated with this ML Transform.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The object that represents the schema that this transform accepts. see Schema.
      */
    val schemas: Output_[js.Array[MLTransformSchema]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
      */
    val timeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `numberOfWorkers`.
      */
    val workerType: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object MLTransform {
    
    /**
      * Get an existing MLTransform resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/mltransform", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID]): MLTransform = js.native
    @JSImport("@pulumi/aws/glue/mltransform", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MLTransform = js.native
    @JSImport("@pulumi/aws/glue/mltransform", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID], state: MLTransformState): MLTransform = js.native
    @JSImport("@pulumi/aws/glue/mltransform", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID], state: MLTransformState, opts: CustomResourceOptions): MLTransform = js.native
    
    /**
      * Returns true if the given object is an instance of MLTransform.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/mltransform", "MLTransform.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/mltransform.MLTransform */ Boolean = js.native
  }
  
  @js.native
  trait MLTransformArgs extends StObject {
    
    /**
      * Description of the ML Transform.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
      */
    val inputRecordTables: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable]]] = js.native
    
    /**
      * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `maxCapacity` is a mutually exclusive option with `numberOfWorkers` and `workerType`.
      */
    val maxCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The maximum number of times to retry this ML Transform if it fails.
      */
    val maxRetries: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name you assign to this ML Transform. It must be unique in your account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of workers of a defined `workerType` that are allocated when an ML Transform runs. Required with `workerType`.
      */
    val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
      */
    val parameters: Input[typings.pulumiAws.inputMod.glue.MLTransformParameters] = js.native
    
    /**
      * The ARN of the IAM role associated with this ML Transform.
      */
    val roleArn: Input[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
      */
    val timeout: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `numberOfWorkers`.
      */
    val workerType: js.UndefOr[Input[String]] = js.native
  }
  object MLTransformArgs {
    
    @scala.inline
    def apply(
      inputRecordTables: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable]]],
      parameters: Input[typings.pulumiAws.inputMod.glue.MLTransformParameters],
      roleArn: Input[String]
    ): MLTransformArgs = {
      val __obj = js.Dynamic.literal(inputRecordTables = inputRecordTables.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[MLTransformArgs]
    }
    
    @scala.inline
    implicit class MLTransformArgsMutableBuilder[Self <: MLTransformArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      @scala.inline
      def setInputRecordTables(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable]]]): Self = StObject.set(x, "inputRecordTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRecordTablesVarargs(value: Input[typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable]*): Self = StObject.set(x, "inputRecordTables", js.Array(value :_*))
      
      @scala.inline
      def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[typings.pulumiAws.inputMod.glue.MLTransformParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
  
  @js.native
  trait MLTransformState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Glue ML Transform.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the ML Transform.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
      */
    val inputRecordTables: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable]]]
      ] = js.native
    
    /**
      * The number of labels available for this transform.
      */
    val labelCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `maxCapacity` is a mutually exclusive option with `numberOfWorkers` and `workerType`.
      */
    val maxCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The maximum number of times to retry this ML Transform if it fails.
      */
    val maxRetries: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name you assign to this ML Transform. It must be unique in your account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of workers of a defined `workerType` that are allocated when an ML Transform runs. Required with `workerType`.
      */
    val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
      */
    val parameters: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.MLTransformParameters]] = js.native
    
    /**
      * The ARN of the IAM role associated with this ML Transform.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The object that represents the schema that this transform accepts. see Schema.
      */
    val schemas: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.MLTransformSchema]]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
      */
    val timeout: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `numberOfWorkers`.
      */
    val workerType: js.UndefOr[Input[String]] = js.native
  }
  object MLTransformState {
    
    @scala.inline
    def apply(): MLTransformState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MLTransformState]
    }
    
    @scala.inline
    implicit class MLTransformStateMutableBuilder[Self <: MLTransformState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      @scala.inline
      def setInputRecordTables(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable]]]): Self = StObject.set(x, "inputRecordTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRecordTablesUndefined: Self = StObject.set(x, "inputRecordTables", js.undefined)
      
      @scala.inline
      def setInputRecordTablesVarargs(value: Input[typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable]*): Self = StObject.set(x, "inputRecordTables", js.Array(value :_*))
      
      @scala.inline
      def setLabelCount(value: Input[Double]): Self = StObject.set(x, "labelCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelCountUndefined: Self = StObject.set(x, "labelCount", js.undefined)
      
      @scala.inline
      def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[typings.pulumiAws.inputMod.glue.MLTransformParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setSchemas(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.MLTransformSchema]]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      @scala.inline
      def setSchemasVarargs(value: Input[typings.pulumiAws.inputMod.glue.MLTransformSchema]*): Self = StObject.set(x, "schemas", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
}
