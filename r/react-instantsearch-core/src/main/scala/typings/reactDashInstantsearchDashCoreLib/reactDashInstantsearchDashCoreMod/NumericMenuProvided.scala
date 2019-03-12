package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericMenuProvided extends js.Object {
  /**
    * the refinement currently applied. follow the shape of a string with a pattern of '{start}:{end}' which corresponds to the current selected item.
    * For instance, when the selected item is {start: 10, end: 20}, the searchState of the widget is '10:20'. When start isn’t defined, the searchState
    * of the widget is ':{end}', and the same way around when end isn’t defined. However, when neither start nor end are defined, the searchState is an empty string.
    */
  var currentRefinement: java.lang.String
  /** the list of ranges the NumericMenu can display. */
  var items: js.Array[reactDashInstantsearchDashCoreLib.Anon_IsRefined]
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to select a range. */
  def refine(args: js.Any*): js.Any
}

object NumericMenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: java.lang.String,
    items: js.Array[reactDashInstantsearchDashCoreLib.Anon_IsRefined],
    refine: /* repeated */ js.Any => js.Any
  ): NumericMenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement, items = items, refine = js.Any.fromFunction1(refine))
  
    __obj.asInstanceOf[NumericMenuProvided]
  }
}

