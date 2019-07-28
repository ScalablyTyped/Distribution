package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatioBitRate extends js.Object {
  var aspectRatio: js.UndefOr[String] = js.undefined
  var bitRate: js.UndefOr[String] = js.undefined
  var codec: js.UndefOr[String] = js.undefined
  var displayAspectRatio: js.UndefOr[String] = js.undefined
  var fixedGop: js.UndefOr[String] = js.undefined
  var frameRate: js.UndefOr[String] = js.undefined
  var keyframesMaxDist: js.UndefOr[String] = js.undefined
  var maxFrameRate: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var paddingPolicy: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[String] = js.undefined
  var sizingPolicy: js.UndefOr[String] = js.undefined
}

object Anon_AspectRatioBitRate {
  @scala.inline
  def apply(
    aspectRatio: String = null,
    bitRate: String = null,
    codec: String = null,
    displayAspectRatio: String = null,
    fixedGop: String = null,
    frameRate: String = null,
    keyframesMaxDist: String = null,
    maxFrameRate: String = null,
    maxHeight: String = null,
    maxWidth: String = null,
    paddingPolicy: String = null,
    resolution: String = null,
    sizingPolicy: String = null
  ): Anon_AspectRatioBitRate = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (displayAspectRatio != null) __obj.updateDynamic("displayAspectRatio")(displayAspectRatio)
    if (fixedGop != null) __obj.updateDynamic("fixedGop")(fixedGop)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate)
    if (keyframesMaxDist != null) __obj.updateDynamic("keyframesMaxDist")(keyframesMaxDist)
    if (maxFrameRate != null) __obj.updateDynamic("maxFrameRate")(maxFrameRate)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (paddingPolicy != null) __obj.updateDynamic("paddingPolicy")(paddingPolicy)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy)
    __obj.asInstanceOf[Anon_AspectRatioBitRate]
  }
}

