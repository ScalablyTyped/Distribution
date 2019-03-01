package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterAny extends js.Object {
  var filter: js.UndefOr[js.Any | java.lang.String] = js.undefined
}

object Anon_FilterAny {
  @scala.inline
  def apply(filter: js.Any | java.lang.String = null): Anon_FilterAny = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FilterAny]
  }
}

