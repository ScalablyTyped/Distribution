package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFill extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var `fill-opacity`: js.UndefOr[Double] = js.undefined
  var `text-anchor`: js.UndefOr[String] = js.undefined
}

object AnonFill {
  @scala.inline
  def apply(fill: String = null, `fill-opacity`: Int | Double = null, `text-anchor`: String = null): AnonFill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFill]
  }
}

