package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteExposed extends js.Object {
  var defaultRefinement: js.UndefOr[String] = js.undefined
}

object AutocompleteExposed {
  @scala.inline
  def apply(defaultRefinement: String = null): AutocompleteExposed = {
    val __obj = js.Dynamic.literal()
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteExposed]
  }
}

