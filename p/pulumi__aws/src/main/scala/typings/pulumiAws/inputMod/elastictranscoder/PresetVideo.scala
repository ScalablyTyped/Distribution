package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresetVideo extends js.Object {
  
  /**
    * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `maxWidth`, `maxHeight`, `sizingPolicy`, `paddingPolicy`, and `displayAspectRatio` instead of `resolution` and `aspectRatio`.)
    */
  var aspectRatio: js.UndefOr[Input[String]] = js.native
  
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
    */
  var bitRate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
    */
  var codec: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
    */
  var displayAspectRatio: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
    */
  var fixedGop: js.UndefOr[Input[String]] = js.native
  
  /**
    * The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
    */
  var frameRate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum number of frames between key frames. Not applicable for containers of type gif.
    */
  var keyframesMaxDist: js.UndefOr[Input[String]] = js.native
  
  /**
    * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
    */
  var maxFrameRate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum height of the output video in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072, inclusive.
    */
  var maxHeight: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum width of the output video in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096, inclusive.
    */
  var maxWidth: js.UndefOr[Input[String]] = js.native
  
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `maxWidth` and `maxHeight`.
    */
  var paddingPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspectRatio`)
    */
  var resolution: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value that controls scaling of the output video. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, `ShrinkToFill`.
    */
  var sizingPolicy: js.UndefOr[Input[String]] = js.native
}
object PresetVideo {
  
  @scala.inline
  def apply(): PresetVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetVideo]
  }
  
  @scala.inline
  implicit class PresetVideoOps[Self <: PresetVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAspectRatio(value: Input[String]): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setBitRate(value: Input[String]): Self = this.set("bitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitRate: Self = this.set("bitRate", js.undefined)
    
    @scala.inline
    def setCodec(value: Input[String]): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    
    @scala.inline
    def setDisplayAspectRatio(value: Input[String]): Self = this.set("displayAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAspectRatio: Self = this.set("displayAspectRatio", js.undefined)
    
    @scala.inline
    def setFixedGop(value: Input[String]): Self = this.set("fixedGop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedGop: Self = this.set("fixedGop", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Input[String]): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setKeyframesMaxDist(value: Input[String]): Self = this.set("keyframesMaxDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyframesMaxDist: Self = this.set("keyframesMaxDist", js.undefined)
    
    @scala.inline
    def setMaxFrameRate(value: Input[String]): Self = this.set("maxFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFrameRate: Self = this.set("maxFrameRate", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Input[String]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Input[String]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setPaddingPolicy(value: Input[String]): Self = this.set("paddingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingPolicy: Self = this.set("paddingPolicy", js.undefined)
    
    @scala.inline
    def setResolution(value: Input[String]): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setSizingPolicy(value: Input[String]): Self = this.set("sizingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizingPolicy: Self = this.set("sizingPolicy", js.undefined)
  }
}
