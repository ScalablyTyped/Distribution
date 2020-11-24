package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresetVideoWatermark extends js.Object {
  
  /**
    * The horizontal position of the watermark unless you specify a nonzero value for `horzontalOffset`.
    */
  var horizontalAlign: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount by which you want the horizontal position of the watermark to be offset from the position specified by `horizontalAlign`.
    */
  var horizontalOffset: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique identifier for the settings for one watermark. The value of Id can be up to 40 characters long. You can specify settings for up to four watermarks.
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[Input[String]] = js.native
  
  /**
    * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
    */
  var opacity: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value that determines how Elastic Transcoder interprets values that you specified for `video_watermarks.horizontal_offset`, `video_watermarks.vertical_offset`, `video_watermarks.max_width`, and `video_watermarks.max_height`. Valid values are `Content` and `Frame`.
    */
  var target: js.UndefOr[Input[String]] = js.native
  
  /**
    * The vertical position of the watermark unless you specify a nonzero value for `verticalAlign`. Valid values are `Top`, `Bottom`, `Center`.
    */
  var verticalAlign: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount by which you want the vertical position of the watermark to be offset from the position specified by `verticalAlign`
    */
  var verticalOffset: js.UndefOr[Input[String]] = js.native
}
object PresetVideoWatermark {
  
  @scala.inline
  def apply(): PresetVideoWatermark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetVideoWatermark]
  }
  
  @scala.inline
  implicit class PresetVideoWatermarkOps[Self <: PresetVideoWatermark] (val x: Self) extends AnyVal {
    
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
    def setHorizontalAlign(value: Input[String]): Self = this.set("horizontalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlign: Self = this.set("horizontalAlign", js.undefined)
    
    @scala.inline
    def setHorizontalOffset(value: Input[String]): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOffset: Self = this.set("horizontalOffset", js.undefined)
    
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Input[String]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Input[String]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Input[String]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSizingPolicy(value: Input[String]): Self = this.set("sizingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizingPolicy: Self = this.set("sizingPolicy", js.undefined)
    
    @scala.inline
    def setTarget(value: Input[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: Input[String]): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: Input[String]): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOffset: Self = this.set("verticalOffset", js.undefined)
  }
}
