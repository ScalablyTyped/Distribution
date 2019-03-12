package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxProvided extends js.Object {
  /** the current query used */
  var currentRefinement: java.lang.String
  /** a flag that indicates if InstantSearch has detected that searches are stalled */
  var isSearchStalled: scala.Boolean
  /** a function to change the current query */
  def refine(args: js.Any*): js.Any
}

object SearchBoxProvided {
  @scala.inline
  def apply(
    currentRefinement: java.lang.String,
    isSearchStalled: scala.Boolean,
    refine: /* repeated */ js.Any => js.Any
  ): SearchBoxProvided = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement, isSearchStalled = isSearchStalled, refine = js.Any.fromFunction1(refine))
  
    __obj.asInstanceOf[SearchBoxProvided]
  }
}

