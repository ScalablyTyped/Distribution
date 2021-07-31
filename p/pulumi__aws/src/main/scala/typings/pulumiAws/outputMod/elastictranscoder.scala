package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elastictranscoder {
  
  trait PipelineContentConfig extends StObject {
    
    /**
      * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
      */
    var bucket: String
    
    /**
      * The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
      */
    var storageClass: js.UndefOr[String] = js.undefined
  }
  object PipelineContentConfig {
    
    @scala.inline
    def apply(bucket: String): PipelineContentConfig = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineContentConfig]
    }
    
    @scala.inline
    implicit class PipelineContentConfigMutableBuilder[Self <: PipelineContentConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    }
  }
  
  trait PipelineContentConfigPermission extends StObject {
    
    /**
      * The permission that you want to give to the AWS user that you specified in `content_config_permissions.grantee`
      */
    var accesses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The AWS user or group that you want to have access to transcoded files and playlists.
      */
    var grantee: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the type of value that appears in the `content_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
      */
    var granteeType: js.UndefOr[String] = js.undefined
  }
  object PipelineContentConfigPermission {
    
    @scala.inline
    def apply(): PipelineContentConfigPermission = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineContentConfigPermission]
    }
    
    @scala.inline
    implicit class PipelineContentConfigPermissionMutableBuilder[Self <: PipelineContentConfigPermission] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccesses(value: js.Array[String]): Self = StObject.set(x, "accesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessesUndefined: Self = StObject.set(x, "accesses", js.undefined)
      
      @scala.inline
      def setAccessesVarargs(value: String*): Self = StObject.set(x, "accesses", js.Array(value :_*))
      
      @scala.inline
      def setGrantee(value: String): Self = StObject.set(x, "grantee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeType(value: String): Self = StObject.set(x, "granteeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeTypeUndefined: Self = StObject.set(x, "granteeType", js.undefined)
      
      @scala.inline
      def setGranteeUndefined: Self = StObject.set(x, "grantee", js.undefined)
    }
  }
  
  trait PipelineNotifications extends StObject {
    
    /**
      * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing a job in this pipeline.
      */
    var completed: js.UndefOr[String] = js.undefined
    
    /**
      * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition while processing a job in this pipeline.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process a job in this pipeline.
      */
    var progressing: js.UndefOr[String] = js.undefined
    
    /**
      * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition while processing a job in this pipeline.
      */
    var warning: js.UndefOr[String] = js.undefined
  }
  object PipelineNotifications {
    
    @scala.inline
    def apply(): PipelineNotifications = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineNotifications]
    }
    
    @scala.inline
    implicit class PipelineNotificationsMutableBuilder[Self <: PipelineNotifications] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setProgressing(value: String): Self = StObject.set(x, "progressing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressingUndefined: Self = StObject.set(x, "progressing", js.undefined)
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait PipelineThumbnailConfig extends StObject {
    
    /**
      * The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
      */
    var bucket: String
    
    /**
      * The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
      */
    var storageClass: js.UndefOr[String] = js.undefined
  }
  object PipelineThumbnailConfig {
    
    @scala.inline
    def apply(bucket: String): PipelineThumbnailConfig = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineThumbnailConfig]
    }
    
    @scala.inline
    implicit class PipelineThumbnailConfigMutableBuilder[Self <: PipelineThumbnailConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    }
  }
  
  trait PipelineThumbnailConfigPermission extends StObject {
    
    /**
      * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`.
      */
    var accesses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The AWS user or group that you want to have access to thumbnail files.
      */
    var grantee: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object.
      */
    var granteeType: js.UndefOr[String] = js.undefined
  }
  object PipelineThumbnailConfigPermission {
    
    @scala.inline
    def apply(): PipelineThumbnailConfigPermission = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineThumbnailConfigPermission]
    }
    
    @scala.inline
    implicit class PipelineThumbnailConfigPermissionMutableBuilder[Self <: PipelineThumbnailConfigPermission] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccesses(value: js.Array[String]): Self = StObject.set(x, "accesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessesUndefined: Self = StObject.set(x, "accesses", js.undefined)
      
      @scala.inline
      def setAccessesVarargs(value: String*): Self = StObject.set(x, "accesses", js.Array(value :_*))
      
      @scala.inline
      def setGrantee(value: String): Self = StObject.set(x, "grantee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeType(value: String): Self = StObject.set(x, "granteeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeTypeUndefined: Self = StObject.set(x, "granteeType", js.undefined)
      
      @scala.inline
      def setGranteeUndefined: Self = StObject.set(x, "grantee", js.undefined)
    }
  }
  
  trait PresetAudio extends StObject {
    
    /**
      * The method of organizing audio channels and tracks. Use Audio:Channels to specify the number of channels in your output, and Audio:AudioPackingMode to specify the number of tracks and their relation to the channels. If you do not specify an Audio:AudioPackingMode, Elastic Transcoder uses SingleTrack.
      */
    var audioPackingMode: js.UndefOr[String] = js.undefined
    
    /**
      * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320, inclusive.
      */
    var bitRate: js.UndefOr[String] = js.undefined
    
    /**
      * The number of audio channels in the output file
      */
    var channels: js.UndefOr[String] = js.undefined
    
    /**
      * The audio codec for the output file. Valid values are `AAC`, `flac`, `mp2`, `mp3`, `pcm`, and `vorbis`.
      */
    var codec: js.UndefOr[String] = js.undefined
    
    /**
      * The sample rate of the audio stream in the output file, in hertz. Valid values are: `auto`, `22050`, `32000`, `44100`, `48000`, `96000`
      */
    var sampleRate: js.UndefOr[String] = js.undefined
  }
  object PresetAudio {
    
    @scala.inline
    def apply(): PresetAudio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresetAudio]
    }
    
    @scala.inline
    implicit class PresetAudioMutableBuilder[Self <: PresetAudio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioPackingMode(value: String): Self = StObject.set(x, "audioPackingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioPackingModeUndefined: Self = StObject.set(x, "audioPackingMode", js.undefined)
      
      @scala.inline
      def setBitRate(value: String): Self = StObject.set(x, "bitRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitRateUndefined: Self = StObject.set(x, "bitRate", js.undefined)
      
      @scala.inline
      def setChannels(value: String): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
      
      @scala.inline
      def setSampleRate(value: String): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
  
  trait PresetAudioCodecOptions extends StObject {
    
    /**
      * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
      */
    var bitDepth: js.UndefOr[String] = js.undefined
    
    /**
      * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
      */
    var bitOrder: js.UndefOr[String] = js.undefined
    
    /**
      * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
      */
    var profile: js.UndefOr[String] = js.undefined
    
    /**
      * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
      */
    var signed: js.UndefOr[String] = js.undefined
  }
  object PresetAudioCodecOptions {
    
    @scala.inline
    def apply(): PresetAudioCodecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresetAudioCodecOptions]
    }
    
    @scala.inline
    implicit class PresetAudioCodecOptionsMutableBuilder[Self <: PresetAudioCodecOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitDepth(value: String): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      @scala.inline
      def setBitOrder(value: String): Self = StObject.set(x, "bitOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitOrderUndefined: Self = StObject.set(x, "bitOrder", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setSigned(value: String): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  trait PresetThumbnails extends StObject {
    
    /**
      * The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
      */
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    /**
      * The format of thumbnails, if any. Valid formats are jpg and png.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
      */
    var interval: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
      */
    var maxHeight: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
      */
    var maxWidth: js.UndefOr[String] = js.undefined
    
    /**
      * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
      */
    var paddingPolicy: js.UndefOr[String] = js.undefined
    
    /**
      * The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `maxWidth`, `maxHeight`, `sizingPolicy`, and `paddingPolicy` instead of `resolution` and `aspectRatio`. The two groups of settings are mutually exclusive. Do not use them together)
      */
    var resolution: js.UndefOr[String] = js.undefined
    
    /**
      * A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
      */
    var sizingPolicy: js.UndefOr[String] = js.undefined
  }
  object PresetThumbnails {
    
    @scala.inline
    def apply(): PresetThumbnails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresetThumbnails]
    }
    
    @scala.inline
    implicit class PresetThumbnailsMutableBuilder[Self <: PresetThumbnails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPaddingPolicy(value: String): Self = StObject.set(x, "paddingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingPolicyUndefined: Self = StObject.set(x, "paddingPolicy", js.undefined)
      
      @scala.inline
      def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setSizingPolicy(value: String): Self = StObject.set(x, "sizingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizingPolicyUndefined: Self = StObject.set(x, "sizingPolicy", js.undefined)
    }
  }
  
  trait PresetVideo extends StObject {
    
    /**
      * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `maxWidth`, `maxHeight`, `sizingPolicy`, `paddingPolicy`, and `displayAspectRatio` instead of `resolution` and `aspectRatio`.)
      */
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    /**
      * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
      */
    var bitRate: js.UndefOr[String] = js.undefined
    
    /**
      * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
      */
    var codec: js.UndefOr[String] = js.undefined
    
    /**
      * The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
      */
    var displayAspectRatio: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
      */
    var fixedGop: js.UndefOr[String] = js.undefined
    
    /**
      * The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
      */
    var frameRate: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum number of frames between key frames. Not applicable for containers of type gif.
      */
    var keyframesMaxDist: js.UndefOr[String] = js.undefined
    
    /**
      * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
      */
    var maxFrameRate: String
    
    /**
      * The maximum height of the output video in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072, inclusive.
      */
    var maxHeight: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum width of the output video in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096, inclusive.
      */
    var maxWidth: js.UndefOr[String] = js.undefined
    
    /**
      * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `maxWidth` and `maxHeight`.
      */
    var paddingPolicy: js.UndefOr[String] = js.undefined
    
    /**
      * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspectRatio`)
      */
    var resolution: js.UndefOr[String] = js.undefined
    
    /**
      * A value that controls scaling of the output video. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, `ShrinkToFill`.
      */
    var sizingPolicy: js.UndefOr[String] = js.undefined
  }
  object PresetVideo {
    
    @scala.inline
    def apply(maxFrameRate: String): PresetVideo = {
      val __obj = js.Dynamic.literal(maxFrameRate = maxFrameRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetVideo]
    }
    
    @scala.inline
    implicit class PresetVideoMutableBuilder[Self <: PresetVideo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setBitRate(value: String): Self = StObject.set(x, "bitRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitRateUndefined: Self = StObject.set(x, "bitRate", js.undefined)
      
      @scala.inline
      def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
      
      @scala.inline
      def setDisplayAspectRatio(value: String): Self = StObject.set(x, "displayAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayAspectRatioUndefined: Self = StObject.set(x, "displayAspectRatio", js.undefined)
      
      @scala.inline
      def setFixedGop(value: String): Self = StObject.set(x, "fixedGop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedGopUndefined: Self = StObject.set(x, "fixedGop", js.undefined)
      
      @scala.inline
      def setFrameRate(value: String): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
      
      @scala.inline
      def setKeyframesMaxDist(value: String): Self = StObject.set(x, "keyframesMaxDist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframesMaxDistUndefined: Self = StObject.set(x, "keyframesMaxDist", js.undefined)
      
      @scala.inline
      def setMaxFrameRate(value: String): Self = StObject.set(x, "maxFrameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPaddingPolicy(value: String): Self = StObject.set(x, "paddingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingPolicyUndefined: Self = StObject.set(x, "paddingPolicy", js.undefined)
      
      @scala.inline
      def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setSizingPolicy(value: String): Self = StObject.set(x, "sizingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizingPolicyUndefined: Self = StObject.set(x, "sizingPolicy", js.undefined)
    }
  }
  
  trait PresetVideoWatermark extends StObject {
    
    /**
      * The horizontal position of the watermark unless you specify a nonzero value for `horzontalOffset`.
      */
    var horizontalAlign: js.UndefOr[String] = js.undefined
    
    /**
      * The amount by which you want the horizontal position of the watermark to be offset from the position specified by `horizontalAlign`.
      */
    var horizontalOffset: js.UndefOr[String] = js.undefined
    
    /**
      * A unique identifier for the settings for one watermark. The value of Id can be up to 40 characters long. You can specify settings for up to four watermarks.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum height of the watermark.
      */
    var maxHeight: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum width of the watermark.
      */
    var maxWidth: js.UndefOr[String] = js.undefined
    
    /**
      * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
      */
    var opacity: js.UndefOr[String] = js.undefined
    
    /**
      * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
      */
    var sizingPolicy: js.UndefOr[String] = js.undefined
    
    /**
      * A value that determines how Elastic Transcoder interprets values that you specified for `video_watermarks.horizontal_offset`, `video_watermarks.vertical_offset`, `video_watermarks.max_width`, and `video_watermarks.max_height`. Valid values are `Content` and `Frame`.
      */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * The vertical position of the watermark unless you specify a nonzero value for `verticalAlign`. Valid values are `Top`, `Bottom`, `Center`.
      */
    var verticalAlign: js.UndefOr[String] = js.undefined
    
    /**
      * The amount by which you want the vertical position of the watermark to be offset from the position specified by `verticalAlign`
      */
    var verticalOffset: js.UndefOr[String] = js.undefined
  }
  object PresetVideoWatermark {
    
    @scala.inline
    def apply(): PresetVideoWatermark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresetVideoWatermark]
    }
    
    @scala.inline
    implicit class PresetVideoWatermarkMutableBuilder[Self <: PresetVideoWatermark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontalAlign(value: String): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
      
      @scala.inline
      def setHorizontalOffset(value: String): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSizingPolicy(value: String): Self = StObject.set(x, "sizingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizingPolicyUndefined: Self = StObject.set(x, "sizingPolicy", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVerticalOffset(value: String): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
}
