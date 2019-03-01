package typings
package projectDashOxfordLib.projectDashOxfordMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detect extends js.Object {
   // Analyze face landmarks?
  var analyzesAge: js.UndefOr[scala.Boolean] = js.undefined
   // Stream of an image to be used
  var analyzesFaceLandmarks: js.UndefOr[scala.Boolean] = js.undefined
   // Analyze age?
  var analyzesGender: js.UndefOr[scala.Boolean] = js.undefined
   // Analyze gender?
  var analyzesHeadPose: js.UndefOr[scala.Boolean] = js.undefined
   // URL to image to be used
  var path: js.UndefOr[java.lang.String] = js.undefined
   // Path to image to be used
  var stream: js.UndefOr[nodeLib.streamMod.Stream] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Detect {
  @scala.inline
  def apply(
    analyzesAge: js.UndefOr[scala.Boolean] = js.undefined,
    analyzesFaceLandmarks: js.UndefOr[scala.Boolean] = js.undefined,
    analyzesGender: js.UndefOr[scala.Boolean] = js.undefined,
    analyzesHeadPose: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    stream: nodeLib.streamMod.Stream = null,
    url: java.lang.String = null
  ): Detect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analyzesAge)) __obj.updateDynamic("analyzesAge")(analyzesAge)
    if (!js.isUndefined(analyzesFaceLandmarks)) __obj.updateDynamic("analyzesFaceLandmarks")(analyzesFaceLandmarks)
    if (!js.isUndefined(analyzesGender)) __obj.updateDynamic("analyzesGender")(analyzesGender)
    if (!js.isUndefined(analyzesHeadPose)) __obj.updateDynamic("analyzesHeadPose")(analyzesHeadPose)
    if (path != null) __obj.updateDynamic("path")(path)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Detect]
  }
}

