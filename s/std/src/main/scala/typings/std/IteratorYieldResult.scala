package typings.std

import typings.std.stdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorYieldResult[TYield]
  extends IteratorResult[TYield, js.Any] {
  var done: js.UndefOr[`false`] = js.undefined
  var value: TYield
}

object IteratorYieldResult {
  @scala.inline
  def apply[TYield](value: TYield, done: `false` = null): IteratorYieldResult[TYield] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorYieldResult[TYield]]
  }
}

