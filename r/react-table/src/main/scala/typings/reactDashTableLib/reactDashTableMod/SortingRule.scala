package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortingRule extends js.Object {
  var asc: js.UndefOr[reactDashTableLib.reactDashTableLibNumbers.`true`] = js.undefined
  var desc: js.UndefOr[reactDashTableLib.reactDashTableLibNumbers.`true`] = js.undefined
  var id: java.lang.String
  var sort: js.UndefOr[
    reactDashTableLib.reactDashTableLibStrings.desc | reactDashTableLib.reactDashTableLibStrings.asc
  ] = js.undefined
}

object SortingRule {
  @scala.inline
  def apply(
    id: java.lang.String,
    asc: reactDashTableLib.reactDashTableLibNumbers.`true` = null,
    desc: reactDashTableLib.reactDashTableLibNumbers.`true` = null,
    sort: reactDashTableLib.reactDashTableLibStrings.desc | reactDashTableLib.reactDashTableLibStrings.asc = null
  ): SortingRule = {
    val __obj = js.Dynamic.literal(id = id)
    if (asc != null) __obj.updateDynamic("asc")(asc)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingRule]
  }
}

