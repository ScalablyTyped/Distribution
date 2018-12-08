package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentRefinementsProvided extends js.Object {
  /**
     * all the filters, the value is to pass to the refine function for removing all currentrefinements,
     * label is for the display. When existing several refinements for the same atribute name, then you
     * get a nested items object that contains a label and a value function to use to remove a single filter.
     * attribute and currentRefinement are metadata containing row values.
     */
  var items: js.Array[Refinement] = js.native
  /** the search query */
  var query: java.lang.String = js.native
  /** a function to remove a single filter */
  def refine(refinement: js.Array[RefinementValue]): scala.Unit = js.native
  /** a function to remove a single filter */
  def refine(refinement: RefinementValue): scala.Unit = js.native
}

