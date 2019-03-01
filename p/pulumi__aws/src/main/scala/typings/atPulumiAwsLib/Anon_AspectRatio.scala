package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  var aspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var maxHeight: js.UndefOr[java.lang.String] = js.undefined
  var maxWidth: js.UndefOr[java.lang.String] = js.undefined
  var paddingPolicy: js.UndefOr[java.lang.String] = js.undefined
  var resolution: js.UndefOr[java.lang.String] = js.undefined
  var sizingPolicy: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AspectRatio {
  @scala.inline
  def apply(
    aspectRatio: java.lang.String = null,
    format: java.lang.String = null,
    interval: java.lang.String = null,
    maxHeight: java.lang.String = null,
    maxWidth: java.lang.String = null,
    paddingPolicy: java.lang.String = null,
    resolution: java.lang.String = null,
    sizingPolicy: java.lang.String = null
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

