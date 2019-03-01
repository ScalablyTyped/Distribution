package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSArtboard extends js.Object {
  var backgroundColor: SketchMSColor
  var frame: SketchMSRect
  var hasBackgroundColor: scala.Boolean
  var horizontalRulerData: js.UndefOr[SketchMSRulerData] = js.undefined
  var includeBackgroundColorInExport: js.UndefOr[scala.Boolean] = js.undefined
  var includeInCloudUpload: js.UndefOr[scala.Boolean] = js.undefined
  var isFlowHome: js.UndefOr[scala.Boolean] = js.undefined
  var verticalRulerData: js.UndefOr[SketchMSRulerData] = js.undefined
}

object SketchMSArtboard {
  @scala.inline
  def apply(
    backgroundColor: SketchMSColor,
    frame: SketchMSRect,
    hasBackgroundColor: scala.Boolean,
    horizontalRulerData: SketchMSRulerData = null,
    includeBackgroundColorInExport: js.UndefOr[scala.Boolean] = js.undefined,
    includeInCloudUpload: js.UndefOr[scala.Boolean] = js.undefined,
    isFlowHome: js.UndefOr[scala.Boolean] = js.undefined,
    verticalRulerData: SketchMSRulerData = null
  ): SketchMSArtboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("frame")(frame)
    __obj.updateDynamic("hasBackgroundColor")(hasBackgroundColor)
    if (horizontalRulerData != null) __obj.updateDynamic("horizontalRulerData")(horizontalRulerData)
    if (!js.isUndefined(includeBackgroundColorInExport)) __obj.updateDynamic("includeBackgroundColorInExport")(includeBackgroundColorInExport)
    if (!js.isUndefined(includeInCloudUpload)) __obj.updateDynamic("includeInCloudUpload")(includeInCloudUpload)
    if (!js.isUndefined(isFlowHome)) __obj.updateDynamic("isFlowHome")(isFlowHome)
    if (verticalRulerData != null) __obj.updateDynamic("verticalRulerData")(verticalRulerData)
    __obj.asInstanceOf[SketchMSArtboard]
  }
}

