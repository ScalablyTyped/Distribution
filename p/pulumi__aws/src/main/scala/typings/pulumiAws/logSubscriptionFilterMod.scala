package typings.pulumiAws

import typings.pulumiAws.cloudwatchMod.LogGroup
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logSubscriptionFilterMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter")
  @js.native
  class LogSubscriptionFilter protected () extends CustomResource {
    /**
      * Create a LogSubscriptionFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogSubscriptionFilterArgs) = this()
    def this(name: String, args: LogSubscriptionFilterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
      */
    val destinationArn: Output_[String] = js.native
    
    /**
      * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
      */
    val distribution: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
      */
    val filterPattern: Output_[String] = js.native
    
    /**
      * The name of the log group to associate the subscription filter with
      */
    val logGroup: Output_[String] = js.native
    
    /**
      * A name for the subscription filter
      */
    val name: Output_[String] = js.native
    
    /**
      * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
      */
    val roleArn: Output_[String] = js.native
  }
  /* static members */
  object LogSubscriptionFilter {
    
    /**
      * Get an existing LogSubscriptionFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState): LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState, opts: CustomResourceOptions): LogSubscriptionFilter = js.native
    
    /**
      * Returns true if the given object is an instance of LogSubscriptionFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logSubscriptionFilter.LogSubscriptionFilter */ Boolean = js.native
  }
  
  @js.native
  trait LogSubscriptionFilterArgs extends StObject {
    
    /**
      * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
      */
    val destinationArn: Input[String] = js.native
    
    /**
      * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
      */
    val distribution: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
      */
    val filterPattern: Input[String] = js.native
    
    /**
      * The name of the log group to associate the subscription filter with
      */
    val logGroup: Input[String | LogGroup] = js.native
    
    /**
      * A name for the subscription filter
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
  }
  object LogSubscriptionFilterArgs {
    
    @scala.inline
    def apply(destinationArn: Input[String], filterPattern: Input[String], logGroup: Input[String | LogGroup]): LogSubscriptionFilterArgs = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], filterPattern = filterPattern.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogSubscriptionFilterArgs]
    }
    
    @scala.inline
    implicit class LogSubscriptionFilterArgsMutableBuilder[Self <: LogSubscriptionFilterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistribution(value: Input[String]): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
      
      @scala.inline
      def setFilterPattern(value: Input[String]): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroup(value: Input[String | LogGroup]): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
  
  @js.native
  trait LogSubscriptionFilterState extends StObject {
    
    /**
      * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
      */
    val destinationArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
      */
    val distribution: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
      */
    val filterPattern: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the log group to associate the subscription filter with
      */
    val logGroup: js.UndefOr[Input[String | LogGroup]] = js.native
    
    /**
      * A name for the subscription filter
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
  }
  object LogSubscriptionFilterState {
    
    @scala.inline
    def apply(): LogSubscriptionFilterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogSubscriptionFilterState]
    }
    
    @scala.inline
    implicit class LogSubscriptionFilterStateMutableBuilder[Self <: LogSubscriptionFilterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationArnUndefined: Self = StObject.set(x, "destinationArn", js.undefined)
      
      @scala.inline
      def setDistribution(value: Input[String]): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
      
      @scala.inline
      def setFilterPattern(value: Input[String]): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
      
      @scala.inline
      def setLogGroup(value: Input[String | LogGroup]): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupUndefined: Self = StObject.set(x, "logGroup", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
