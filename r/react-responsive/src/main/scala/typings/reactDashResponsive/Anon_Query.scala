package typings.reactDashResponsive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: js.UndefOr[String] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply(query: String = null): Anon_Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Query]
  }
}

