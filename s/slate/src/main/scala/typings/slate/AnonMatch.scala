package typings.slate

import typings.slate.mod.ObjectAndType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatch extends js.Object {
  var `match`: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object AnonMatch {
  @scala.inline
  def apply(
    `match`: ObjectAndType | js.Array[ObjectAndType] = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): AnonMatch = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatch]
  }
}

