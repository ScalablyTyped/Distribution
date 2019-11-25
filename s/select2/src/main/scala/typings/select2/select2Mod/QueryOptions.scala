package typings.select2.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var term: js.UndefOr[String] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(page: Int | Double = null, term: String = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

