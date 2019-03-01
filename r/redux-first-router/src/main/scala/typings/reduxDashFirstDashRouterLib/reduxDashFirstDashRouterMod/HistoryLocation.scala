package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryLocation extends js.Object {
  var pathname: java.lang.String
  var search: js.UndefOr[java.lang.String] = js.undefined
}

object HistoryLocation {
  @scala.inline
  def apply(pathname: java.lang.String, search: java.lang.String = null): HistoryLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pathname")(pathname)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[HistoryLocation]
  }
}

