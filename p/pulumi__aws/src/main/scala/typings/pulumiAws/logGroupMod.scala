package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.lambdaMixinsMod.Callback
import typings.pulumiAws.logGroupMixinsMod.DecodedLogGroupEvent
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logGroupMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup")
  @js.native
  class LogGroup protected () extends CustomResource {
    /**
      * Create a LogGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LogGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LogGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the log group. Any `:*` suffix added by the API, denoting all CloudWatch Log Streams under the CloudWatch Log Group, is removed for greater compatibility with other AWS services that do not accept the suffix.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN of the KMS Key to use when encrypting log data. Please note, after the AWS KMS CMK is disassociated from the log group,
      * AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
      * permissions for the CMK whenever the encrypted data is requested.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the log group. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Creates a new subscription to events fired from this LogGroup to the callback provided,
      * along with options to control the behavior of the subscription.
      *
      * The events will be provided in their decoded form.  Because this event hookup needs to
      * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
      * not a [lambda.Function] instance.
      */
    def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): LogGroupEventSubscription = js.native
    def onDecodedEvent(
      name: String,
      callback: Callback[DecodedLogGroupEvent, Unit],
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): LogGroupEventSubscription = js.native
    def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
    def onDecodedEvent(
      name: String,
      callback: Callback[DecodedLogGroupEvent, Unit],
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): LogGroupEventSubscription = js.native
    
    /**
      * Creates a new subscription to events fired from this LogGroup to the handler provided,
      * along with options to control the behavior of the subscription.
      *
      * The events will be produced in raw (gzipped + base64 encoded) form.
      */
    def onEvent(name: String, handler: LogGroupEventHandler): LogGroupEventSubscription = js.native
    def onEvent(
      name: String,
      handler: LogGroupEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): LogGroupEventSubscription = js.native
    def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
    def onEvent(
      name: String,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): LogGroupEventSubscription = js.native
    
    /**
      * Specifies the number of days
      * you want to retain log events in the specified log group.  Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, 3653, and 0.
      * If you select 0, the events in the log group are always retained and never expire.
      */
    val retentionInDays: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object LogGroup {
    
    /**
      * Get an existing LogGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogGroupState): LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogGroupState, opts: CustomResourceOptions): LogGroup = js.native
    
    /**
      * Returns true if the given object is an instance of LogGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logGroup.LogGroup */ Boolean = js.native
  }
  
  @js.native
  trait LogGroupArgs extends StObject {
    
    /**
      * The ARN of the KMS Key to use when encrypting log data. Please note, after the AWS KMS CMK is disassociated from the log group,
      * AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
      * permissions for the CMK whenever the encrypted data is requested.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the log group. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the number of days
      * you want to retain log events in the specified log group.  Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, 3653, and 0.
      * If you select 0, the events in the log group are always retained and never expire.
      */
    val retentionInDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object LogGroupArgs {
    
    @scala.inline
    def apply(): LogGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogGroupArgs]
    }
    
    @scala.inline
    implicit class LogGroupArgsMutableBuilder[Self <: LogGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRetentionInDays(value: Input[Double]): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionInDaysUndefined: Self = StObject.set(x, "retentionInDays", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait LogGroupState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the log group. Any `:*` suffix added by the API, denoting all CloudWatch Log Streams under the CloudWatch Log Group, is removed for greater compatibility with other AWS services that do not accept the suffix.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the KMS Key to use when encrypting log data. Please note, after the AWS KMS CMK is disassociated from the log group,
      * AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
      * permissions for the CMK whenever the encrypted data is requested.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the log group. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the number of days
      * you want to retain log events in the specified log group.  Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, 3653, and 0.
      * If you select 0, the events in the log group are always retained and never expire.
      */
    val retentionInDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object LogGroupState {
    
    @scala.inline
    def apply(): LogGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogGroupState]
    }
    
    @scala.inline
    implicit class LogGroupStateMutableBuilder[Self <: LogGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRetentionInDays(value: Input[Double]): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionInDaysUndefined: Self = StObject.set(x, "retentionInDays", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
