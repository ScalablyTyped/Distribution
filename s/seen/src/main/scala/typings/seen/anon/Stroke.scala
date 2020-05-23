package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stroke extends js.Object {
  var stroke: js.UndefOr[String] = js.undefined
  var `stroke-width`: js.UndefOr[Double] = js.undefined
  var `text-anchor`: js.UndefOr[String] = js.undefined
}

object Stroke {
  @scala.inline
  def apply(
    stroke: String = null,
    `stroke-width`: js.UndefOr[Double] = js.undefined,
    `text-anchor`: String = null
  ): Stroke = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-width`)) __obj.updateDynamic("stroke-width")(`stroke-width`.get.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stroke]
  }
}

