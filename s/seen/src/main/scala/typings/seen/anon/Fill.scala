package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fill extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var `fill-opacity`: js.UndefOr[Double] = js.undefined
  var `text-anchor`: js.UndefOr[String] = js.undefined
}

object Fill {
  @scala.inline
  def apply(
    fill: String = null,
    `fill-opacity`: js.UndefOr[Double] = js.undefined,
    `text-anchor`: String = null
  ): Fill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(`fill-opacity`)) __obj.updateDynamic("fill-opacity")(`fill-opacity`.get.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

