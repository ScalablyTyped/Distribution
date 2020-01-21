package typings.reactVirtualized

import typings.reactVirtualized.mod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignmentIndex extends js.Object {
  var alignment: js.UndefOr[Alignment] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object AnonAlignmentIndex {
  @scala.inline
  def apply(alignment: Alignment = null, index: Int | Double = null): AnonAlignmentIndex = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignmentIndex]
  }
}

