package typings.pulumiAws.mod

import typings.pulumiAws.analyticsApplicationMod.AnalyticsApplicationArgs
import typings.pulumiAws.analyticsApplicationMod.AnalyticsApplicationState
import typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs
import typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStreamState
import typings.pulumiAws.getStreamMod.GetStreamArgs
import typings.pulumiAws.getStreamMod.GetStreamResult
import typings.pulumiAws.kinesisMixinsMod.StreamEventHandler
import typings.pulumiAws.kinesisMixinsMod.StreamEventSubscriptionArgs
import typings.pulumiAws.streamMod.StreamArgs
import typings.pulumiAws.streamMod.StreamState
import typings.pulumiAws.videoStreamMod.VideoStreamArgs
import typings.pulumiAws.videoStreamMod.VideoStreamState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesis {
  
  @JSImport("@pulumi/aws", "kinesis.AnalyticsApplication")
  @js.native
  class AnalyticsApplication protected ()
    extends typings.pulumiAws.kinesisMod.AnalyticsApplication {
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
    @JSImport("@pulumi/aws", "kinesis.AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = js.native
    @JSImport("@pulumi/aws", "kinesis.AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = js.native
    @JSImport("@pulumi/aws", "kinesis.AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsApplicationState): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = js.native
    @JSImport("@pulumi/aws", "kinesis.AnalyticsApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsApplicationState, opts: CustomResourceOptions): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = js.native
    
    /**
      * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kinesis.AnalyticsApplication.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream")
  @js.native
  class FirehoseDeliveryStream protected ()
    extends typings.pulumiAws.kinesisMod.FirehoseDeliveryStream {
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
  /* static members */
  object FirehoseDeliveryStream {
    
    /**
      * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    @JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    @JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    @JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
    
    /**
      * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kinesis.Stream")
  @js.native
  class Stream protected ()
    extends typings.pulumiAws.kinesisMod.Stream {
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
  /* static members */
  object Stream {
    
    /**
      * Get an existing Stream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kinesis.Stream.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.streamMod.Stream = js.native
    @JSImport("@pulumi/aws", "kinesis.Stream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.streamMod.Stream = js.native
    @JSImport("@pulumi/aws", "kinesis.Stream.get")
    @js.native
    def get(name: String, id: Input[ID], state: StreamState): typings.pulumiAws.streamMod.Stream = js.native
    @JSImport("@pulumi/aws", "kinesis.Stream.get")
    @js.native
    def get(name: String, id: Input[ID], state: StreamState, opts: CustomResourceOptions): typings.pulumiAws.streamMod.Stream = js.native
    
    /**
      * Returns true if the given object is an instance of Stream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kinesis.Stream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/stream.Stream */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kinesis.StreamEventSubscription")
  @js.native
  class StreamEventSubscription protected ()
    extends typings.pulumiAws.kinesisMod.StreamEventSubscription {
    def this(
      name: String,
      stream: typings.pulumiAws.streamMod.Stream,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      stream: typings.pulumiAws.streamMod.Stream,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws", "kinesis.VideoStream")
  @js.native
  class VideoStream protected ()
    extends typings.pulumiAws.kinesisMod.VideoStream {
    /**
      * Create a VideoStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VideoStreamArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: VideoStreamArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VideoStream {
    
    /**
      * Get an existing VideoStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "kinesis.VideoStream.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.videoStreamMod.VideoStream = js.native
    @JSImport("@pulumi/aws", "kinesis.VideoStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.videoStreamMod.VideoStream = js.native
    @JSImport("@pulumi/aws", "kinesis.VideoStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: VideoStreamState): typings.pulumiAws.videoStreamMod.VideoStream = js.native
    @JSImport("@pulumi/aws", "kinesis.VideoStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: VideoStreamState, opts: CustomResourceOptions): typings.pulumiAws.videoStreamMod.VideoStream = js.native
    
    /**
      * Returns true if the given object is an instance of VideoStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "kinesis.VideoStream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "kinesis.getStream")
  @js.native
  def getStream(args: GetStreamArgs): js.Promise[GetStreamResult] = js.native
  @JSImport("@pulumi/aws", "kinesis.getStream")
  @js.native
  def getStream(args: GetStreamArgs, opts: InvokeOptions): js.Promise[GetStreamResult] = js.native
  
  /* augmented module */
  object pulumiAwsKinesisStreamAugmentingMod {
    
    @js.native
    trait Stream extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Stream to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: StreamEventHandler, args: StreamEventSubscriptionArgs): typings.pulumiAws.kinesisMixinsMod.StreamEventSubscription = js.native
      def onEvent(
        name: String,
        handler: StreamEventHandler,
        args: StreamEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.kinesisMixinsMod.StreamEventSubscription = js.native
    }
  }
}
