package typings.reactDashVirtualized

import typings.reactDashVirtualized.reactDashVirtualizedMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignmentIndex extends js.Object {
  var alignment: js.UndefOr[Alignment] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object Anon_AlignmentIndex {
  @scala.inline
  def apply(alignment: Alignment = null, index: Int | Double = null): Anon_AlignmentIndex = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignmentIndex]
  }
}

