package typings.reactDashSortableDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expanded extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
}

object Anon_Expanded {
  @scala.inline
  def apply(expanded: js.UndefOr[Boolean] = js.undefined): Anon_Expanded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    __obj.asInstanceOf[Anon_Expanded]
  }
}

