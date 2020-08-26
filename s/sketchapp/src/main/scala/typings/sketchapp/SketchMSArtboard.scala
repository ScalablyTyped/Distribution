package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSArtboard extends js.Object {
  var backgroundColor: SketchMSColor = js.native
  var frame: SketchMSRect = js.native
  var hasBackgroundColor: Boolean = js.native
  var horizontalRulerData: js.UndefOr[SketchMSRulerData] = js.native
  var includeBackgroundColorInExport: js.UndefOr[Boolean] = js.native
  var includeInCloudUpload: js.UndefOr[Boolean] = js.native
  var isFlowHome: js.UndefOr[Boolean] = js.native
  var verticalRulerData: js.UndefOr[SketchMSRulerData] = js.native
}

object SketchMSArtboard {
  @scala.inline
  def apply(backgroundColor: SketchMSColor, frame: SketchMSRect, hasBackgroundColor: Boolean): SketchMSArtboard = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSArtboard]
  }
  @scala.inline
  implicit class SketchMSArtboardOps[Self <: SketchMSArtboard] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: SketchMSColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: SketchMSRect): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasBackgroundColor(value: Boolean): Self = this.set("hasBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalRulerData(value: SketchMSRulerData): Self = this.set("horizontalRulerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalRulerData: Self = this.set("horizontalRulerData", js.undefined)
    @scala.inline
    def setIncludeBackgroundColorInExport(value: Boolean): Self = this.set("includeBackgroundColorInExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeBackgroundColorInExport: Self = this.set("includeBackgroundColorInExport", js.undefined)
    @scala.inline
    def setIncludeInCloudUpload(value: Boolean): Self = this.set("includeInCloudUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInCloudUpload: Self = this.set("includeInCloudUpload", js.undefined)
    @scala.inline
    def setIsFlowHome(value: Boolean): Self = this.set("isFlowHome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFlowHome: Self = this.set("isFlowHome", js.undefined)
    @scala.inline
    def setVerticalRulerData(value: SketchMSRulerData): Self = this.set("verticalRulerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalRulerData: Self = this.set("verticalRulerData", js.undefined)
  }
  
}

