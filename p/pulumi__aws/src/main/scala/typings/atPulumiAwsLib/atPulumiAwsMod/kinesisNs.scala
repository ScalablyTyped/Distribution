package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kinesis")
@js.native
object kinesisNs extends js.Object {
  @js.native
  class AnalyticsApplication protected ()
    extends atPulumiAwsLib.kinesisMod.AnalyticsApplication {
    /**
      * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class FirehoseDeliveryStream protected ()
    extends atPulumiAwsLib.kinesisMod.FirehoseDeliveryStream {
    /**
      * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Stream protected ()
    extends atPulumiAwsLib.kinesisMod.Stream {
    /**
      * Create a Stream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.kinesisStreamMod.StreamArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.kinesisStreamMod.StreamArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class StreamEventSubscription protected ()
    extends atPulumiAwsLib.kinesisMod.StreamEventSubscription {
    def this(name: java.lang.String, stream: atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream, handler: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventHandler, args: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs) = this()
    def this(name: java.lang.String, stream: atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream, handler: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventHandler, args: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  def getStream(args: atPulumiAwsLib.kinesisGetStreamMod.GetStreamArgs): js.Promise[atPulumiAwsLib.kinesisGetStreamMod.GetStreamResult] = js.native
  def getStream(
    args: atPulumiAwsLib.kinesisGetStreamMod.GetStreamArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.kinesisGetStreamMod.GetStreamResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationState
    ): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
    /**
      * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState
    ): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    /**
      * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kinesisStreamMod.StreamState
    ): atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.kinesisStreamMod.StreamState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream = js.native
    /**
      * Returns true if the given object is an instance of Stream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/kinesisMixins.@pulumi/aws/kinesis/stream.Stream */ scala.Boolean = js.native
  }
  
}

