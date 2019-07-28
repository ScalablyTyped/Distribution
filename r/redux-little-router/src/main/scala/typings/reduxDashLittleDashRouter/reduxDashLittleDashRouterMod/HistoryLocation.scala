package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryLocation extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[ObjectLiteral[_]] = js.undefined
}

object HistoryLocation {
  @scala.inline
  def apply(
    hash: String = null,
    key: String = null,
    pathname: String = null,
    search: String = null,
    state: ObjectLiteral[_] = null
  ): HistoryLocation = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (key != null) __obj.updateDynamic("key")(key)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (search != null) __obj.updateDynamic("search")(search)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[HistoryLocation]
  }
}

