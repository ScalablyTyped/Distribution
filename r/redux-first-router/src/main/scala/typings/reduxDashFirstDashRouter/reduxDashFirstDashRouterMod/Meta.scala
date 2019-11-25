package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var location: ActionMetaLocation
  var navigation: js.UndefOr[NavigationAction] = js.undefined
  var notFoundPath: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
  var search: js.UndefOr[String] = js.undefined
}

object Meta {
  @scala.inline
  def apply(
    location: ActionMetaLocation,
    navigation: NavigationAction = null,
    notFoundPath: String = null,
    query: Query = null,
    search: String = null
  ): Meta = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (notFoundPath != null) __obj.updateDynamic("notFoundPath")(notFoundPath.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

