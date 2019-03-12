package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxExposed extends js.Object {
  /** Provide a default value for the query */
  var defaultRefinement: js.UndefOr[java.lang.String] = js.undefined
}

object SearchBoxExposed {
  @scala.inline
  def apply(defaultRefinement: java.lang.String = null): SearchBoxExposed = {
    val __obj = js.Dynamic.literal()
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement)
    __obj.asInstanceOf[SearchBoxExposed]
  }
}

