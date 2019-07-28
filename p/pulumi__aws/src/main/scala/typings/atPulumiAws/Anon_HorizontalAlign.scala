package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HorizontalAlign extends js.Object {
  var horizontalAlign: js.UndefOr[String] = js.undefined
  var horizontalOffset: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[String] = js.undefined
  var sizingPolicy: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var verticalAlign: js.UndefOr[String] = js.undefined
  var verticalOffset: js.UndefOr[String] = js.undefined
}

object Anon_HorizontalAlign {
  @scala.inline
  def apply(
    horizontalAlign: String = null,
    horizontalOffset: String = null,
    id: String = null,
    maxHeight: String = null,
    maxWidth: String = null,
    opacity: String = null,
    sizingPolicy: String = null,
    target: String = null,
    verticalAlign: String = null,
    verticalOffset: String = null
  ): Anon_HorizontalAlign = {
    val __obj = js.Dynamic.literal()
    if (horizontalAlign != null) __obj.updateDynamic("horizontalAlign")(horizontalAlign)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy)
    if (target != null) __obj.updateDynamic("target")(target)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset)
    __obj.asInstanceOf[Anon_HorizontalAlign]
  }
}

