package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stroke extends js.Object {
  var stroke: js.UndefOr[String] = js.undefined
  var `stroke-width`: js.UndefOr[Double] = js.undefined
  var `text-anchor`: js.UndefOr[String] = js.undefined
}

object Anon_Stroke {
  @scala.inline
  def apply(stroke: String = null, `stroke-width`: Int | Double = null, `text-anchor`: String = null): Anon_Stroke = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`)
    __obj.asInstanceOf[Anon_Stroke]
  }
}

