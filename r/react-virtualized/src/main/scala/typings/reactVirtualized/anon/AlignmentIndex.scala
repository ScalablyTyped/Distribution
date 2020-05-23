package typings.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignmentIndex extends js.Object {
  var alignment: js.UndefOr[typings.reactVirtualized.mod.Alignment] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object AlignmentIndex {
  @scala.inline
  def apply(alignment: typings.reactVirtualized.mod.Alignment = null, index: js.UndefOr[Double] = js.undefined): AlignmentIndex = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentIndex]
  }
}

