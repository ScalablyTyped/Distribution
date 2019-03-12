package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteExposed extends js.Object {
  var defaultRefinement: js.UndefOr[java.lang.String] = js.undefined
}

object AutocompleteExposed {
  @scala.inline
  def apply(defaultRefinement: java.lang.String = null): AutocompleteExposed = {
    val __obj = js.Dynamic.literal()
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement)
    __obj.asInstanceOf[AutocompleteExposed]
  }
}

