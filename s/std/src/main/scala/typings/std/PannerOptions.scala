package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PannerOptions extends AudioNodeOptions {
  var coneInnerAngle: js.UndefOr[Double] = js.undefined
  var coneOuterAngle: js.UndefOr[Double] = js.undefined
  var coneOuterGain: js.UndefOr[Double] = js.undefined
  var distanceModel: js.UndefOr[DistanceModelType] = js.undefined
  var maxDistance: js.UndefOr[Double] = js.undefined
  var orientationX: js.UndefOr[Double] = js.undefined
  var orientationY: js.UndefOr[Double] = js.undefined
  var orientationZ: js.UndefOr[Double] = js.undefined
  var panningModel: js.UndefOr[PanningModelType] = js.undefined
  var positionX: js.UndefOr[Double] = js.undefined
  var positionY: js.UndefOr[Double] = js.undefined
  var positionZ: js.UndefOr[Double] = js.undefined
  var refDistance: js.UndefOr[Double] = js.undefined
  var rolloffFactor: js.UndefOr[Double] = js.undefined
}

object PannerOptions {
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    coneInnerAngle: js.UndefOr[Double] = js.undefined,
    coneOuterAngle: js.UndefOr[Double] = js.undefined,
    coneOuterGain: js.UndefOr[Double] = js.undefined,
    distanceModel: DistanceModelType = null,
    maxDistance: js.UndefOr[Double] = js.undefined,
    orientationX: js.UndefOr[Double] = js.undefined,
    orientationY: js.UndefOr[Double] = js.undefined,
    orientationZ: js.UndefOr[Double] = js.undefined,
    panningModel: PanningModelType = null,
    positionX: js.UndefOr[Double] = js.undefined,
    positionY: js.UndefOr[Double] = js.undefined,
    positionZ: js.UndefOr[Double] = js.undefined,
    refDistance: js.UndefOr[Double] = js.undefined,
    rolloffFactor: js.UndefOr[Double] = js.undefined
  ): PannerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(coneInnerAngle)) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coneOuterAngle)) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coneOuterGain)) __obj.updateDynamic("coneOuterGain")(coneOuterGain.get.asInstanceOf[js.Any])
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDistance)) __obj.updateDynamic("maxDistance")(maxDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orientationX)) __obj.updateDynamic("orientationX")(orientationX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orientationY)) __obj.updateDynamic("orientationY")(orientationY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orientationZ)) __obj.updateDynamic("orientationZ")(orientationZ.get.asInstanceOf[js.Any])
    if (panningModel != null) __obj.updateDynamic("panningModel")(panningModel.asInstanceOf[js.Any])
    if (!js.isUndefined(positionX)) __obj.updateDynamic("positionX")(positionX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionY)) __obj.updateDynamic("positionY")(positionY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionZ)) __obj.updateDynamic("positionZ")(positionZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refDistance)) __obj.updateDynamic("refDistance")(refDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rolloffFactor)) __obj.updateDynamic("rolloffFactor")(rolloffFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PannerOptions]
  }
}

