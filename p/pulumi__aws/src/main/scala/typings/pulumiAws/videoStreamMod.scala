package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoStreamMod {
  
  @JSImport("@pulumi/aws/kinesis/videoStream", "VideoStream")
  @js.native
  class VideoStream protected () extends CustomResource {
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
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
      */
    val arn: Output_[String] = js.native
    
    /**
      * A time stamp that indicates when the stream was created.
      */
    val creationTime: Output_[String] = js.native
    
    /**
      * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
      */
    val dataRetentionInHours: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
      */
    val deviceName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
      */
    val mediaType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The version of the stream.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object VideoStream {
    
    @JSImport("@pulumi/aws/kinesis/videoStream", "VideoStream")
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
    @scala.inline
    def get(name: String, id: Input[ID]): VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VideoStream]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VideoStream]
    @scala.inline
    def get(name: String, id: Input[ID], state: VideoStreamState): VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VideoStream]
    @scala.inline
    def get(name: String, id: Input[ID], state: VideoStreamState, opts: CustomResourceOptions): VideoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VideoStream]
    
    /**
      * Returns true if the given object is an instance of VideoStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean]
  }
  
  trait VideoStreamArgs extends StObject {
    
    /**
      * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
      */
    val dataRetentionInHours: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
      */
    val deviceName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
      */
    val mediaType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VideoStreamArgs {
    
    @scala.inline
    def apply(): VideoStreamArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoStreamArgs]
    }
    
    @scala.inline
    implicit class VideoStreamArgsMutableBuilder[Self <: VideoStreamArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataRetentionInHours(value: Input[Double]): Self = StObject.set(x, "dataRetentionInHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataRetentionInHoursUndefined: Self = StObject.set(x, "dataRetentionInHours", js.undefined)
      
      @scala.inline
      def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMediaType(value: Input[String]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait VideoStreamState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A time stamp that indicates when the stream was created.
      */
    val creationTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
      */
    val dataRetentionInHours: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
      */
    val deviceName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
      */
    val mediaType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The version of the stream.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object VideoStreamState {
    
    @scala.inline
    def apply(): VideoStreamState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoStreamState]
    }
    
    @scala.inline
    implicit class VideoStreamStateMutableBuilder[Self <: VideoStreamState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreationTime(value: Input[String]): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
      
      @scala.inline
      def setDataRetentionInHours(value: Input[Double]): Self = StObject.set(x, "dataRetentionInHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataRetentionInHoursUndefined: Self = StObject.set(x, "dataRetentionInHours", js.undefined)
      
      @scala.inline
      def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMediaType(value: Input[String]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
