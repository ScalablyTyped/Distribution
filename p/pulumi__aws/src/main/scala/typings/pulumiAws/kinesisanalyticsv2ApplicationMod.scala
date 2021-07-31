package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
import typings.pulumiAws.outputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisanalyticsv2ApplicationMod {
  
  @JSImport("@pulumi/aws/kinesisanalyticsv2/application", "Application")
  @js.native
  class Application protected () extends CustomResource {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application's configuration
      */
    val applicationConfiguration: Output_[ApplicationApplicationConfiguration] = js.native
    
    /**
      * The ARN of the application.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A [CloudWatch log stream](https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_stream.html) to monitor application configuration errors.
      */
    val cloudwatchLoggingOptions: Output_[js.UndefOr[ApplicationCloudwatchLoggingOptions]] = js.native
    
    /**
      * The current timestamp when the application was created.
      */
    val createTimestamp: Output_[String] = js.native
    
    /**
      * A summary description of the application.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The current timestamp when the application was last updated.
      */
    val lastUpdateTimestamp: Output_[String] = js.native
    
    /**
      * The name of the application.
      */
    val name: Output_[String] = js.native
    
    /**
      * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`.
      */
    val runtimeEnvironment: Output_[String] = js.native
    
    /**
      * The ARN of the [IAM role](https://www.terraform.io/docs/providers/aws/r/iam_role.html) used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
      */
    val serviceExecutionRole: Output_[String] = js.native
    
    /**
      * The status of the application.
      */
    val status: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the application.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The current application version. Kinesis Data Analytics updates the `versionId` each time the application is updated.
      */
    val versionId: Output_[Double] = js.native
  }
  /* static members */
  object Application {
    
    @JSImport("@pulumi/aws/kinesisanalyticsv2/application", "Application")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Application]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Application]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApplicationState): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Application]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Application]
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesisanalyticsv2/application.Application */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kinesisanalyticsv2/application.Application */ Boolean]
  }
  
  trait ApplicationArgs extends StObject {
    
    /**
      * The application's configuration
      */
    val applicationConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
        ]
      ] = js.undefined
    
    /**
      * A [CloudWatch log stream](https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_stream.html) to monitor application configuration errors.
      */
    val cloudwatchLoggingOptions: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
        ]
      ] = js.undefined
    
    /**
      * A summary description of the application.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the application.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`.
      */
    val runtimeEnvironment: Input[String]
    
    /**
      * The ARN of the [IAM role](https://www.terraform.io/docs/providers/aws/r/iam_role.html) used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
      */
    val serviceExecutionRole: Input[String]
    
    /**
      * A map of tags to assign to the application.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ApplicationArgs {
    
    @scala.inline
    def apply(runtimeEnvironment: Input[String], serviceExecutionRole: Input[String]): ApplicationArgs = {
      val __obj = js.Dynamic.literal(runtimeEnvironment = runtimeEnvironment.asInstanceOf[js.Any], serviceExecutionRole = serviceExecutionRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationArgs]
    }
    
    @scala.inline
    implicit class ApplicationArgsMutableBuilder[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
            ]
      ): Self = StObject.set(x, "applicationConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationConfigurationUndefined: Self = StObject.set(x, "applicationConfiguration", js.undefined)
      
      @scala.inline
      def setCloudwatchLoggingOptions(
        value: Input[
              typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
            ]
      ): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRuntimeEnvironment(value: Input[String]): Self = StObject.set(x, "runtimeEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceExecutionRole(value: Input[String]): Self = StObject.set(x, "serviceExecutionRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ApplicationState extends StObject {
    
    /**
      * The application's configuration
      */
    val applicationConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
        ]
      ] = js.undefined
    
    /**
      * The ARN of the application.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A [CloudWatch log stream](https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_stream.html) to monitor application configuration errors.
      */
    val cloudwatchLoggingOptions: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
        ]
      ] = js.undefined
    
    /**
      * The current timestamp when the application was created.
      */
    val createTimestamp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A summary description of the application.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The current timestamp when the application was last updated.
      */
    val lastUpdateTimestamp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the application.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`.
      */
    val runtimeEnvironment: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the [IAM role](https://www.terraform.io/docs/providers/aws/r/iam_role.html) used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
      */
    val serviceExecutionRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status of the application.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the application.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The current application version. Kinesis Data Analytics updates the `versionId` each time the application is updated.
      */
    val versionId: js.UndefOr[Input[Double]] = js.undefined
  }
  object ApplicationState {
    
    @scala.inline
    def apply(): ApplicationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationState]
    }
    
    @scala.inline
    implicit class ApplicationStateMutableBuilder[Self <: ApplicationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
            ]
      ): Self = StObject.set(x, "applicationConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationConfigurationUndefined: Self = StObject.set(x, "applicationConfiguration", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCloudwatchLoggingOptions(
        value: Input[
              typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
            ]
      ): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
      
      @scala.inline
      def setCreateTimestamp(value: Input[String]): Self = StObject.set(x, "createTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimestampUndefined: Self = StObject.set(x, "createTimestamp", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLastUpdateTimestamp(value: Input[String]): Self = StObject.set(x, "lastUpdateTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdateTimestampUndefined: Self = StObject.set(x, "lastUpdateTimestamp", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRuntimeEnvironment(value: Input[String]): Self = StObject.set(x, "runtimeEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeEnvironmentUndefined: Self = StObject.set(x, "runtimeEnvironment", js.undefined)
      
      @scala.inline
      def setServiceExecutionRole(value: Input[String]): Self = StObject.set(x, "serviceExecutionRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceExecutionRoleUndefined: Self = StObject.set(x, "serviceExecutionRole", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersionId(value: Input[Double]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
}
