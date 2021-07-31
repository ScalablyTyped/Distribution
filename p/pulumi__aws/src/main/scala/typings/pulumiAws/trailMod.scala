package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cloudtrail.TrailEventSelector
import typings.pulumiAws.outputMod.cloudtrail.TrailInsightSelector
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailMod {
  
  @JSImport("@pulumi/aws/cloudtrail/trail", "Trail")
  @js.native
  class Trail protected () extends CustomResource {
    /**
      * Create a Trail resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TrailArgs) = this()
    def this(name: String, args: TrailArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name of the trail.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies a log group name using an Amazon Resource Name (ARN),
      * that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
      */
    val cloudWatchLogsGroupArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the role for the CloudWatch Logs
      * endpoint to assume to write to a user’s log group.
      */
    val cloudWatchLogsRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies whether log file integrity validation is enabled.
      * Defaults to `false`.
      */
    val enableLogFileValidation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Enables logging for the trail. Defaults to `true`.
      * Setting this to `false` will pause logging.
      */
    val enableLogging: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
      */
    val eventSelectors: Output_[js.UndefOr[js.Array[TrailEventSelector]]] = js.native
    
    /**
      * The region in which the trail was created.
      */
    val homeRegion: Output_[String] = js.native
    
    /**
      * Specifies whether the trail is publishing events
      * from global services such as IAM to the log files. Defaults to `true`.
      */
    val includeGlobalServiceEvents: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies an insight selector for identifying unusual operational activity. Fields documented below.
      */
    val insightSelectors: Output_[js.UndefOr[js.Array[TrailInsightSelector]]] = js.native
    
    /**
      * Specifies whether the trail is created in the current
      * region or in all regions. Defaults to `false`.
      */
    val isMultiRegionTrail: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
      */
    val isOrganizationTrail: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the name of the trail.
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies the name of the S3 bucket designated for publishing log files.
      */
    val s3BucketName: Output_[String] = js.native
    
    /**
      * Specifies the S3 key prefix that follows
      * the name of the bucket you have designated for log file delivery.
      */
    val s3KeyPrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the name of the Amazon SNS topic
      * defined for notification of log file delivery.
      */
    val snsTopicName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the trail
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Trail {
    
    @JSImport("@pulumi/aws/cloudtrail/trail", "Trail")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Trail resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Trail = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Trail]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Trail = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Trail]
    @scala.inline
    def get(name: String, id: Input[ID], state: TrailState): Trail = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Trail]
    @scala.inline
    def get(name: String, id: Input[ID], state: TrailState, opts: CustomResourceOptions): Trail = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Trail]
    
    /**
      * Returns true if the given object is an instance of Trail.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudtrail/trail.Trail */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudtrail/trail.Trail */ Boolean]
  }
  
  trait TrailArgs extends StObject {
    
    /**
      * Specifies a log group name using an Amazon Resource Name (ARN),
      * that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
      */
    val cloudWatchLogsGroupArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the role for the CloudWatch Logs
      * endpoint to assume to write to a user’s log group.
      */
    val cloudWatchLogsRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether log file integrity validation is enabled.
      * Defaults to `false`.
      */
    val enableLogFileValidation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Enables logging for the trail. Defaults to `true`.
      * Setting this to `false` will pause logging.
      */
    val enableLogging: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
      */
    val eventSelectors: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailEventSelector]]]] = js.undefined
    
    /**
      * Specifies whether the trail is publishing events
      * from global services such as IAM to the log files. Defaults to `true`.
      */
    val includeGlobalServiceEvents: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies an insight selector for identifying unusual operational activity. Fields documented below.
      */
    val insightSelectors: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailInsightSelector]]]
      ] = js.undefined
    
    /**
      * Specifies whether the trail is created in the current
      * region or in all regions. Defaults to `false`.
      */
    val isMultiRegionTrail: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
      */
    val isOrganizationTrail: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the trail.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the S3 bucket designated for publishing log files.
      */
    val s3BucketName: Input[String]
    
    /**
      * Specifies the S3 key prefix that follows
      * the name of the bucket you have designated for log file delivery.
      */
    val s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the Amazon SNS topic
      * defined for notification of log file delivery.
      */
    val snsTopicName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the trail
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TrailArgs {
    
    @scala.inline
    def apply(s3BucketName: Input[String]): TrailArgs = {
      val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrailArgs]
    }
    
    @scala.inline
    implicit class TrailArgsMutableBuilder[Self <: TrailArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudWatchLogsGroupArn(value: Input[String]): Self = StObject.set(x, "cloudWatchLogsGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudWatchLogsGroupArnUndefined: Self = StObject.set(x, "cloudWatchLogsGroupArn", js.undefined)
      
      @scala.inline
      def setCloudWatchLogsRoleArn(value: Input[String]): Self = StObject.set(x, "cloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "cloudWatchLogsRoleArn", js.undefined)
      
      @scala.inline
      def setEnableLogFileValidation(value: Input[Boolean]): Self = StObject.set(x, "enableLogFileValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLogFileValidationUndefined: Self = StObject.set(x, "enableLogFileValidation", js.undefined)
      
      @scala.inline
      def setEnableLogging(value: Input[Boolean]): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
      
      @scala.inline
      def setEventSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailEventSelector]]]): Self = StObject.set(x, "eventSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSelectorsUndefined: Self = StObject.set(x, "eventSelectors", js.undefined)
      
      @scala.inline
      def setEventSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.cloudtrail.TrailEventSelector]*): Self = StObject.set(x, "eventSelectors", js.Array(value :_*))
      
      @scala.inline
      def setIncludeGlobalServiceEvents(value: Input[Boolean]): Self = StObject.set(x, "includeGlobalServiceEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGlobalServiceEventsUndefined: Self = StObject.set(x, "includeGlobalServiceEvents", js.undefined)
      
      @scala.inline
      def setInsightSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailInsightSelector]]]): Self = StObject.set(x, "insightSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsightSelectorsUndefined: Self = StObject.set(x, "insightSelectors", js.undefined)
      
      @scala.inline
      def setInsightSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.cloudtrail.TrailInsightSelector]*): Self = StObject.set(x, "insightSelectors", js.Array(value :_*))
      
      @scala.inline
      def setIsMultiRegionTrail(value: Input[Boolean]): Self = StObject.set(x, "isMultiRegionTrail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultiRegionTrailUndefined: Self = StObject.set(x, "isMultiRegionTrail", js.undefined)
      
      @scala.inline
      def setIsOrganizationTrail(value: Input[Boolean]): Self = StObject.set(x, "isOrganizationTrail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOrganizationTrailUndefined: Self = StObject.set(x, "isOrganizationTrail", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
      
      @scala.inline
      def setSnsTopicName(value: Input[String]): Self = StObject.set(x, "snsTopicName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicNameUndefined: Self = StObject.set(x, "snsTopicName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait TrailState extends StObject {
    
    /**
      * The Amazon Resource Name of the trail.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies a log group name using an Amazon Resource Name (ARN),
      * that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
      */
    val cloudWatchLogsGroupArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the role for the CloudWatch Logs
      * endpoint to assume to write to a user’s log group.
      */
    val cloudWatchLogsRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether log file integrity validation is enabled.
      * Defaults to `false`.
      */
    val enableLogFileValidation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Enables logging for the trail. Defaults to `true`.
      * Setting this to `false` will pause logging.
      */
    val enableLogging: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
      */
    val eventSelectors: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailEventSelector]]]] = js.undefined
    
    /**
      * The region in which the trail was created.
      */
    val homeRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the trail is publishing events
      * from global services such as IAM to the log files. Defaults to `true`.
      */
    val includeGlobalServiceEvents: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies an insight selector for identifying unusual operational activity. Fields documented below.
      */
    val insightSelectors: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailInsightSelector]]]
      ] = js.undefined
    
    /**
      * Specifies whether the trail is created in the current
      * region or in all regions. Defaults to `false`.
      */
    val isMultiRegionTrail: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
      */
    val isOrganizationTrail: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the trail.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the S3 bucket designated for publishing log files.
      */
    val s3BucketName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the S3 key prefix that follows
      * the name of the bucket you have designated for log file delivery.
      */
    val s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the Amazon SNS topic
      * defined for notification of log file delivery.
      */
    val snsTopicName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the trail
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TrailState {
    
    @scala.inline
    def apply(): TrailState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrailState]
    }
    
    @scala.inline
    implicit class TrailStateMutableBuilder[Self <: TrailState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCloudWatchLogsGroupArn(value: Input[String]): Self = StObject.set(x, "cloudWatchLogsGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudWatchLogsGroupArnUndefined: Self = StObject.set(x, "cloudWatchLogsGroupArn", js.undefined)
      
      @scala.inline
      def setCloudWatchLogsRoleArn(value: Input[String]): Self = StObject.set(x, "cloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "cloudWatchLogsRoleArn", js.undefined)
      
      @scala.inline
      def setEnableLogFileValidation(value: Input[Boolean]): Self = StObject.set(x, "enableLogFileValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLogFileValidationUndefined: Self = StObject.set(x, "enableLogFileValidation", js.undefined)
      
      @scala.inline
      def setEnableLogging(value: Input[Boolean]): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
      
      @scala.inline
      def setEventSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailEventSelector]]]): Self = StObject.set(x, "eventSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSelectorsUndefined: Self = StObject.set(x, "eventSelectors", js.undefined)
      
      @scala.inline
      def setEventSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.cloudtrail.TrailEventSelector]*): Self = StObject.set(x, "eventSelectors", js.Array(value :_*))
      
      @scala.inline
      def setHomeRegion(value: Input[String]): Self = StObject.set(x, "homeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeRegionUndefined: Self = StObject.set(x, "homeRegion", js.undefined)
      
      @scala.inline
      def setIncludeGlobalServiceEvents(value: Input[Boolean]): Self = StObject.set(x, "includeGlobalServiceEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGlobalServiceEventsUndefined: Self = StObject.set(x, "includeGlobalServiceEvents", js.undefined)
      
      @scala.inline
      def setInsightSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cloudtrail.TrailInsightSelector]]]): Self = StObject.set(x, "insightSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsightSelectorsUndefined: Self = StObject.set(x, "insightSelectors", js.undefined)
      
      @scala.inline
      def setInsightSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.cloudtrail.TrailInsightSelector]*): Self = StObject.set(x, "insightSelectors", js.Array(value :_*))
      
      @scala.inline
      def setIsMultiRegionTrail(value: Input[Boolean]): Self = StObject.set(x, "isMultiRegionTrail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultiRegionTrailUndefined: Self = StObject.set(x, "isMultiRegionTrail", js.undefined)
      
      @scala.inline
      def setIsOrganizationTrail(value: Input[Boolean]): Self = StObject.set(x, "isOrganizationTrail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOrganizationTrailUndefined: Self = StObject.set(x, "isOrganizationTrail", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
      
      @scala.inline
      def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
      
      @scala.inline
      def setSnsTopicName(value: Input[String]): Self = StObject.set(x, "snsTopicName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicNameUndefined: Self = StObject.set(x, "snsTopicName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
