package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSArtboard extends js.Object {
  var backgroundColor: SketchMSColor
  var frame: SketchMSRect
  var hasBackgroundColor: Boolean
  var horizontalRulerData: js.UndefOr[SketchMSRulerData] = js.undefined
  var includeBackgroundColorInExport: js.UndefOr[Boolean] = js.undefined
  var includeInCloudUpload: js.UndefOr[Boolean] = js.undefined
  var isFlowHome: js.UndefOr[Boolean] = js.undefined
  var verticalRulerData: js.UndefOr[SketchMSRulerData] = js.undefined
}

object SketchMSArtboard {
  @scala.inline
  def apply(
    backgroundColor: SketchMSColor,
    frame: SketchMSRect,
    hasBackgroundColor: Boolean,
    horizontalRulerData: SketchMSRulerData = null,
    includeBackgroundColorInExport: js.UndefOr[Boolean] = js.undefined,
    includeInCloudUpload: js.UndefOr[Boolean] = js.undefined,
    isFlowHome: js.UndefOr[Boolean] = js.undefined,
    verticalRulerData: SketchMSRulerData = null
  ): SketchMSArtboard = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any])
    if (horizontalRulerData != null) __obj.updateDynamic("horizontalRulerData")(horizontalRulerData.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBackgroundColorInExport)) __obj.updateDynamic("includeBackgroundColorInExport")(includeBackgroundColorInExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInCloudUpload)) __obj.updateDynamic("includeInCloudUpload")(includeInCloudUpload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFlowHome)) __obj.updateDynamic("isFlowHome")(isFlowHome.get.asInstanceOf[js.Any])
    if (verticalRulerData != null) __obj.updateDynamic("verticalRulerData")(verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSArtboard]
  }
}

