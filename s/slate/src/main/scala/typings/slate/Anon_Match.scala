package typings.slate

import typings.slate.slateMod.ObjectAndType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Match extends js.Object {
  var `match`: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object Anon_Match {
  @scala.inline
  def apply(
    `match`: ObjectAndType | js.Array[ObjectAndType] = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): Anon_Match = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Match]
  }
}

