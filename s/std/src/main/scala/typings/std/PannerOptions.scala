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
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    coneInnerAngle: Int | Double = null,
    coneOuterAngle: Int | Double = null,
    coneOuterGain: Int | Double = null,
    distanceModel: DistanceModelType = null,
    maxDistance: Int | Double = null,
    orientationX: Int | Double = null,
    orientationY: Int | Double = null,
    orientationZ: Int | Double = null,
    panningModel: PanningModelType = null,
    positionX: Int | Double = null,
    positionY: Int | Double = null,
    positionZ: Int | Double = null,
    refDistance: Int | Double = null,
    rolloffFactor: Int | Double = null
  ): PannerOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (coneInnerAngle != null) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.asInstanceOf[js.Any])
    if (coneOuterAngle != null) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.asInstanceOf[js.Any])
    if (coneOuterGain != null) __obj.updateDynamic("coneOuterGain")(coneOuterGain.asInstanceOf[js.Any])
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel.asInstanceOf[js.Any])
    if (maxDistance != null) __obj.updateDynamic("maxDistance")(maxDistance.asInstanceOf[js.Any])
    if (orientationX != null) __obj.updateDynamic("orientationX")(orientationX.asInstanceOf[js.Any])
    if (orientationY != null) __obj.updateDynamic("orientationY")(orientationY.asInstanceOf[js.Any])
    if (orientationZ != null) __obj.updateDynamic("orientationZ")(orientationZ.asInstanceOf[js.Any])
    if (panningModel != null) __obj.updateDynamic("panningModel")(panningModel.asInstanceOf[js.Any])
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (positionZ != null) __obj.updateDynamic("positionZ")(positionZ.asInstanceOf[js.Any])
    if (refDistance != null) __obj.updateDynamic("refDistance")(refDistance.asInstanceOf[js.Any])
    if (rolloffFactor != null) __obj.updateDynamic("rolloffFactor")(rolloffFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PannerOptions]
  }
}

