package typings.reduxFirstRouter.anon

import typings.reduxFirstRouter.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFoundPath extends js.Object {
  var notFoundPath: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
  var search: js.UndefOr[String] = js.undefined
}

object NotFoundPath {
  @scala.inline
  def apply(notFoundPath: String = null, query: Query = null, search: String = null): NotFoundPath = {
    val __obj = js.Dynamic.literal()
    if (notFoundPath != null) __obj.updateDynamic("notFoundPath")(notFoundPath.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotFoundPath]
  }
}

