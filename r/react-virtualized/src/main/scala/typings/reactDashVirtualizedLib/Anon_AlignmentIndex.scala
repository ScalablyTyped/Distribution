package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignmentIndex extends js.Object {
  var alignment: js.UndefOr[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AlignmentIndex {
  @scala.inline
  def apply(
    alignment: reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment = null,
    index: scala.Int | scala.Double = null
  ): Anon_AlignmentIndex = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignmentIndex]
  }
}

