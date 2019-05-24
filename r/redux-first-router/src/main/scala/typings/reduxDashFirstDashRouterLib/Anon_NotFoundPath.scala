package typings
package reduxDashFirstDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotFoundPath extends js.Object {
  var notFoundPath: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Query] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NotFoundPath {
  @scala.inline
  def apply(
    notFoundPath: java.lang.String = null,
    query: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Query = null,
    search: java.lang.String = null
  ): Anon_NotFoundPath = {
    val __obj = js.Dynamic.literal()
    if (notFoundPath != null) __obj.updateDynamic("notFoundPath")(notFoundPath)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Anon_NotFoundPath]
  }
}

