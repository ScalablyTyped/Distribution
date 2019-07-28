package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.kinesisAnalyticsApplicationMod.AnalyticsApplicationArgs
import typings.atPulumiAws.kinesisAnalyticsApplicationMod.AnalyticsApplicationState
import typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs
import typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState
import typings.atPulumiAws.kinesisGetStreamMod.GetStreamArgs
import typings.atPulumiAws.kinesisGetStreamMod.GetStreamResult
import typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventHandler
import typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs
import typings.atPulumiAws.kinesisStreamMod.StreamArgs
import typings.atPulumiAws.kinesisStreamMod.StreamState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kinesis")
@js.native
object kinesisNs extends js.Object {
  @js.native
  class AnalyticsApplication protected ()
    extends typings.atPulumiAws.kinesisMod.AnalyticsApplication {
    /**
      * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AnalyticsApplicationArgs) = this()
    def this(name: String, args: AnalyticsApplicationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class FirehoseDeliveryStream protected ()
    extends typings.atPulumiAws.kinesisMod.FirehoseDeliveryStream {
    /**
      * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirehoseDeliveryStreamArgs) = this()
    def this(name: String, args: FirehoseDeliveryStreamArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Stream protected ()
    extends typings.atPulumiAws.kinesisMod.Stream {
    /**
      * Create a Stream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StreamArgs) = this()
    def this(name: String, args: StreamArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StreamEventSubscription protected ()
    extends typings.atPulumiAws.kinesisMod.StreamEventSubscription {
    def this(
      name: String,
      stream: typings.atPulumiAws.kinesisKinesisMixinsMod.kinesisStreamMod.Stream,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      stream: typings.atPulumiAws.kinesisKinesisMixinsMod.kinesisStreamMod.Stream,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  def getStream(args: GetStreamArgs): js.Promise[GetStreamResult] with GetStreamResult = js.native
  def getStream(args: GetStreamArgs, opts: InvokeOptions): js.Promise[GetStreamResult] with GetStreamResult = js.native
  /* static members */
  @js.native
  object AnalyticsApplication extends js.Object {
    /**
      * Get an existing AnalyticsApplication resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
    def get(name: String, id: Input[ID], state: AnalyticsApplicationState): typings.atPulumiAws.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
    def get(name: String, id: Input[ID], state: AnalyticsApplicationState, opts: CustomResourceOptions): typings.atPulumiAws.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
    /**
      * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FirehoseDeliveryStream extends js.Object {
    /**
      * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    /**
      * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Stream extends js.Object {
    /**
      * Get an existing Stream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.kinesisKinesisMixinsMod.kinesisStreamMod.Stream = js.native
    def get(name: String, id: Input[ID], state: StreamState): typings.atPulumiAws.kinesisKinesisMixinsMod.kinesisStreamMod.Stream = js.native
    def get(name: String, id: Input[ID], state: StreamState, opts: CustomResourceOptions): typings.atPulumiAws.kinesisKinesisMixinsMod.kinesisStreamMod.Stream = js.native
    /**
      * Returns true if the given object is an instance of Stream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/kinesisMixins.@pulumi/aws/kinesis/stream.Stream */ Boolean = js.native
  }
  
}

