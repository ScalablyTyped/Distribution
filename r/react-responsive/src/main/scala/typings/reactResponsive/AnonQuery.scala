package typings.reactResponsive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var query: js.UndefOr[String] = js.undefined
}

object AnonQuery {
  @scala.inline
  def apply(query: String = null): AnonQuery = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuery]
  }
}

