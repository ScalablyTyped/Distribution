package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresetThumbnails extends js.Object {
  
  /**
    * The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
    */
  var aspectRatio: js.UndefOr[Input[String]] = js.native
  
  /**
    * The format of thumbnails, if any. Valid formats are jpg and png.
    */
  var format: js.UndefOr[Input[String]] = js.native
  
  /**
    * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
    */
  var interval: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
    */
  var maxHeight: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
    */
  var maxWidth: js.UndefOr[Input[String]] = js.native
  
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
    */
  var paddingPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `maxWidth`, `maxHeight`, `sizingPolicy`, and `paddingPolicy` instead of `resolution` and `aspectRatio`. The two groups of settings are mutually exclusive. Do not use them together)
    */
  var resolution: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
    */
  var sizingPolicy: js.UndefOr[Input[String]] = js.native
}
object PresetThumbnails {
  
  @scala.inline
  def apply(): PresetThumbnails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetThumbnails]
  }
  
  @scala.inline
  implicit class PresetThumbnailsOps[Self <: PresetThumbnails] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: Input[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInterval(value: Input[String]): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
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
