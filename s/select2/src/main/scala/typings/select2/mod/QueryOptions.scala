package typings.select2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var term: js.UndefOr[String] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(page: js.UndefOr[Double] = js.undefined, term: String = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

