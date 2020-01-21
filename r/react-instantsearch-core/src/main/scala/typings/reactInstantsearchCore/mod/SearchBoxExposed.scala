package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxExposed extends js.Object {
  /** Provide a default value for the query */
  var defaultRefinement: js.UndefOr[String] = js.undefined
}

object SearchBoxExposed {
  @scala.inline
  def apply(defaultRefinement: String = null): SearchBoxExposed = {
    val __obj = js.Dynamic.literal()
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBoxExposed]
  }
}

