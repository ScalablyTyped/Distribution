package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var term: js.UndefOr[java.lang.String] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(page: scala.Int | scala.Double = null, term: java.lang.String = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term)
    __obj.asInstanceOf[QueryOptions]
  }
}

