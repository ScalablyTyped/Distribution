package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryLocation extends js.Object {
  var pathname: String
  var search: js.UndefOr[String] = js.undefined
}

object HistoryLocation {
  @scala.inline
  def apply(pathname: String, search: String = null): HistoryLocation = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryLocation]
  }
}

