package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var location: ActionMetaLocation
  var navigation: js.UndefOr[NavigationAction] = js.undefined
  var notFoundPath: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
}

object Meta {
  @scala.inline
  def apply(
    location: ActionMetaLocation,
    navigation: NavigationAction = null,
    notFoundPath: java.lang.String = null,
    query: js.Object = null,
    search: java.lang.String = null
  ): Meta = {
    val __obj = js.Dynamic.literal(location = location)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (notFoundPath != null) __obj.updateDynamic("notFoundPath")(notFoundPath)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Meta]
  }
}

