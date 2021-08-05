package typings.pulumiAws

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisMod {
  
  @JSImport("@pulumi/aws/kinesis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/kinesis", "AnalyticsApplication")
  @js.native
  class AnalyticsApplication protected ()
    extends typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication {
    /**
      * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AnalyticsApplicationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AnalyticsApplicationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AnalyticsApplication {
    
    @JSImport("@pulumi/aws/kinesis", "AnalyticsApplication")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AnalyticsApplication resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication]
    inline def get(name: String, id: Input[ID], state: AnalyticsApplicationState): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication]
    inline def get(name: String, id: Input[ID], state: AnalyticsApplicationState, opts: CustomResourceOptions): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication]
    
    /**
      * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ Boolean]
  }
  
  @JSImport("@pulumi/aws/kinesis", "FirehoseDeliveryStream")
  @js.native
  class FirehoseDeliveryStream protected ()
    extends typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream {
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
    
    @JSImport("@pulumi/aws/kinesis", "FirehoseDeliveryStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream]
    inline def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream]
    inline def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream]
    
    /**
      * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean]
  }
  
  @JSImport("@pulumi/aws/kinesis", "Stream")
  @js.native
  class Stream protected ()
    extends typings.pulumiAws.streamMod.Stream {
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
    
    @JSImport("@pulumi/aws/kinesis", "Stream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Stream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.streamMod.Stream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.streamMod.Stream]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.streamMod.Stream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.streamMod.Stream]
    inline def get(name: String, id: Input[ID], state: StreamState): typings.pulumiAws.streamMod.Stream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.streamMod.Stream]
    inline def get(name: String, id: Input[ID], state: StreamState, opts: CustomResourceOptions): typings.pulumiAws.streamMod.Stream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.streamMod.Stream]
    
    /**
      * Returns true if the given object is an instance of Stream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/stream.Stream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kinesis/stream.Stream */ Boolean]
  }
  
  @JSImport("@pulumi/aws/kinesis", "StreamEventSubscription")
  @js.native
  class StreamEventSubscription protected ()
    extends typings.pulumiAws.kinesisMixinsMod.StreamEventSubscription {
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
  
  @JSImport("@pulumi/aws/kinesis", "VideoStream")
  @js.native
  class VideoStream protected ()
    extends typings.pulumiAws.videoStreamMod.VideoStream {
    /**
      * Create a VideoStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VideoStreamArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: VideoStreamArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VideoStream {
    
    @JSImport("@pulumi/aws/kinesis", "VideoStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VideoStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.videoStreamMod.VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.videoStreamMod.VideoStream]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.videoStreamMod.VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.videoStreamMod.VideoStream]
    inline def get(name: String, id: Input[ID], state: VideoStreamState): typings.pulumiAws.videoStreamMod.VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.videoStreamMod.VideoStream]
    inline def get(name: String, id: Input[ID], state: VideoStreamState, opts: CustomResourceOptions): typings.pulumiAws.videoStreamMod.VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.videoStreamMod.VideoStream]
    
    /**
      * Returns true if the given object is an instance of VideoStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean]
  }
  
  inline def getStream(args: GetStreamArgs): js.Promise[GetStreamResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetStreamResult]]
  inline def getStream(args: GetStreamArgs, opts: InvokeOptions): js.Promise[GetStreamResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetStreamResult]]
  
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
