package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatioBitRateCodec extends js.Object {
  var aspectRatio: js.UndefOr[Input[String]] = js.undefined
  var bitRate: js.UndefOr[Input[String]] = js.undefined
  var codec: js.UndefOr[Input[String]] = js.undefined
  var displayAspectRatio: js.UndefOr[Input[String]] = js.undefined
  var fixedGop: js.UndefOr[Input[String]] = js.undefined
  var frameRate: js.UndefOr[Input[String]] = js.undefined
  var keyframesMaxDist: js.UndefOr[Input[String]] = js.undefined
  var maxFrameRate: js.UndefOr[Input[String]] = js.undefined
  var maxHeight: js.UndefOr[Input[String]] = js.undefined
  var maxWidth: js.UndefOr[Input[String]] = js.undefined
  var paddingPolicy: js.UndefOr[Input[String]] = js.undefined
  var resolution: js.UndefOr[Input[String]] = js.undefined
  var sizingPolicy: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AspectRatioBitRateCodec {
  @scala.inline
  def apply(
    aspectRatio: Input[String] = null,
    bitRate: Input[String] = null,
    codec: Input[String] = null,
    displayAspectRatio: Input[String] = null,
    fixedGop: Input[String] = null,
    frameRate: Input[String] = null,
    keyframesMaxDist: Input[String] = null,
    maxFrameRate: Input[String] = null,
    maxHeight: Input[String] = null,
    maxWidth: Input[String] = null,
    paddingPolicy: Input[String] = null,
    resolution: Input[String] = null,
    sizingPolicy: Input[String] = null
  ): Anon_AspectRatioBitRateCodec = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (displayAspectRatio != null) __obj.updateDynamic("displayAspectRatio")(displayAspectRatio.asInstanceOf[js.Any])
    if (fixedGop != null) __obj.updateDynamic("fixedGop")(fixedGop.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (keyframesMaxDist != null) __obj.updateDynamic("keyframesMaxDist")(keyframesMaxDist.asInstanceOf[js.Any])
    if (maxFrameRate != null) __obj.updateDynamic("maxFrameRate")(maxFrameRate.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (paddingPolicy != null) __obj.updateDynamic("paddingPolicy")(paddingPolicy.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AspectRatioBitRateCodec]
  }
}

