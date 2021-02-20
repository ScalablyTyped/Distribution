package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.outputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions
import typings.pulumiAws.outputMod.kinesis.AnalyticsApplicationInputs
import typings.pulumiAws.outputMod.kinesis.AnalyticsApplicationOutput
import typings.pulumiAws.outputMod.kinesis.AnalyticsApplicationReferenceDataSources
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsApplicationMod {
  
  @JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication")
  @js.native
  class AnalyticsApplication protected () extends CustomResource {
    /**
      * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AnalyticsApplicationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AnalyticsApplicationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Kinesis Analytics Appliation.
      */
    val arn: Output_[ARN] = js.native
    
    /**
      * The CloudWatch log stream options to monitor application errors.
      * See CloudWatch Logging Options below for more details.
      */
    val cloudwatchLoggingOptions: Output_[js.UndefOr[AnalyticsApplicationCloudwatchLoggingOptions]] = js.native
    
    /**
      * SQL Code to transform input data, and generate output.
      */
    val code: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Timestamp when the application version was created.
      */
    val createTimestamp: Output_[String] = js.native
    
    /**
      * Description of the application.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Input configuration of the application. See Inputs below for more details.
      */
    val inputs: Output_[js.UndefOr[AnalyticsApplicationInputs]] = js.native
    
    /**
      * The Timestamp when the application was last updated.
      */
    val lastUpdateTimestamp: Output_[String] = js.native
    
    /**
      * Name of the Kinesis Analytics Application.
      */
    val name: Output_[String] = js.native
    
    /**
      * Output destination configuration of the application. See Outputs below for more details.
      */
    val outputs: Output_[js.UndefOr[js.Array[AnalyticsApplicationOutput]]] = js.native
    
    /**
      * An S3 Reference Data Source for the application.
      * See Reference Data Sources below for more details.
      */
    val referenceDataSources: Output_[js.UndefOr[AnalyticsApplicationReferenceDataSources]] = js.native
    
    /**
      * The Status of the application.
      */
    val status: Output_[String] = js.native
    
    /**
      * Key-value map of tags for the Kinesis Analytics Application.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The Version of the application.
      */
    val version: Output_[Double] = js.native
  }
  /* static members */
  object AnalyticsApplication {
    
    /**
      * Get an existing AnalyticsApplication resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID]): AnalyticsApplication = js.native
    @JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AnalyticsApplication = js.native
    @JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsApplicationState): AnalyticsApplication = js.native
    @JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsApplicationState, opts: CustomResourceOptions): AnalyticsApplication = js.native
    
    /**
      * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ Boolean = js.native
  }
  
  @js.native
  trait AnalyticsApplicationArgs extends StObject {
    
    /**
      * The CloudWatch log stream options to monitor application errors.
      * See CloudWatch Logging Options below for more details.
      */
    val cloudwatchLoggingOptions: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions]
      ] = js.native
    
    /**
      * SQL Code to transform input data, and generate output.
      */
    val code: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the application.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Input configuration of the application. See Inputs below for more details.
      */
    val inputs: js.UndefOr[Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationInputs]] = js.native
    
    /**
      * Name of the Kinesis Analytics Application.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Output destination configuration of the application. See Outputs below for more details.
      */
    val outputs: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput]]]
      ] = js.native
    
    /**
      * An S3 Reference Data Source for the application.
      * See Reference Data Sources below for more details.
      */
    val referenceDataSources: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationReferenceDataSources]
      ] = js.native
    
    /**
      * Key-value map of tags for the Kinesis Analytics Application.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AnalyticsApplicationArgs {
    
    @scala.inline
    def apply(): AnalyticsApplicationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsApplicationArgs]
    }
    
    @scala.inline
    implicit class AnalyticsApplicationArgsMutableBuilder[Self <: AnalyticsApplicationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchLoggingOptions(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions]): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
      
      @scala.inline
      def setCode(value: Input[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setInputs(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationInputs]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput]]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setOutputsVarargs(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput]*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setReferenceDataSources(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationReferenceDataSources]): Self = StObject.set(x, "referenceDataSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceDataSourcesUndefined: Self = StObject.set(x, "referenceDataSources", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait AnalyticsApplicationState extends StObject {
    
    /**
      * The ARN of the Kinesis Analytics Appliation.
      */
    val arn: js.UndefOr[Input[ARN]] = js.native
    
    /**
      * The CloudWatch log stream options to monitor application errors.
      * See CloudWatch Logging Options below for more details.
      */
    val cloudwatchLoggingOptions: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions]
      ] = js.native
    
    /**
      * SQL Code to transform input data, and generate output.
      */
    val code: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Timestamp when the application version was created.
      */
    val createTimestamp: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the application.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Input configuration of the application. See Inputs below for more details.
      */
    val inputs: js.UndefOr[Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationInputs]] = js.native
    
    /**
      * The Timestamp when the application was last updated.
      */
    val lastUpdateTimestamp: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the Kinesis Analytics Application.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Output destination configuration of the application. See Outputs below for more details.
      */
    val outputs: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput]]]
      ] = js.native
    
    /**
      * An S3 Reference Data Source for the application.
      * See Reference Data Sources below for more details.
      */
    val referenceDataSources: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationReferenceDataSources]
      ] = js.native
    
    /**
      * The Status of the application.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags for the Kinesis Analytics Application.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The Version of the application.
      */
    val version: js.UndefOr[Input[Double]] = js.native
  }
  object AnalyticsApplicationState {
    
    @scala.inline
    def apply(): AnalyticsApplicationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsApplicationState]
    }
    
    @scala.inline
    implicit class AnalyticsApplicationStateMutableBuilder[Self <: AnalyticsApplicationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[ARN]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCloudwatchLoggingOptions(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions]): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
      
      @scala.inline
      def setCode(value: Input[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCreateTimestamp(value: Input[String]): Self = StObject.set(x, "createTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimestampUndefined: Self = StObject.set(x, "createTimestamp", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setInputs(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationInputs]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setLastUpdateTimestamp(value: Input[String]): Self = StObject.set(x, "lastUpdateTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdateTimestampUndefined: Self = StObject.set(x, "lastUpdateTimestamp", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput]]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setOutputsVarargs(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput]*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setReferenceDataSources(value: Input[typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationReferenceDataSources]): Self = StObject.set(x, "referenceDataSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceDataSourcesUndefined: Self = StObject.set(x, "referenceDataSources", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
