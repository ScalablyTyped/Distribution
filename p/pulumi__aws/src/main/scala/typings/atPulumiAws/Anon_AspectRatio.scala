package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  var aspectRatio: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var paddingPolicy: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[String] = js.undefined
  var sizingPolicy: js.UndefOr[String] = js.undefined
}

object Anon_AspectRatio {
  @scala.inline
  def apply(
    aspectRatio: String = null,
    format: String = null,
    interval: String = null,
    maxHeight: String = null,
    maxWidth: String = null,
    paddingPolicy: String = null,
    resolution: String = null,
    sizingPolicy: String = null
  ): Anon_AspectRatio = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (format != null) __obj.updateDynamic("format")(format)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (paddingPolicy != null) __obj.updateDynamic("paddingPolicy")(paddingPolicy)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy)
    __obj.asInstanceOf[Anon_AspectRatio]
  }
}

