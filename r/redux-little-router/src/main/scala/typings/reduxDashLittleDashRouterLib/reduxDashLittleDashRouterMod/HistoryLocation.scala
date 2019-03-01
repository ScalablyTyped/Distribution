package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryLocation extends js.Object {
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var pathname: js.UndefOr[java.lang.String] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[ObjectLiteral[_]] = js.undefined
}

object HistoryLocation {
  @scala.inline
  def apply(
    hash: java.lang.String = null,
    key: java.lang.String = null,
    pathname: java.lang.String = null,
    search: java.lang.String = null,
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

