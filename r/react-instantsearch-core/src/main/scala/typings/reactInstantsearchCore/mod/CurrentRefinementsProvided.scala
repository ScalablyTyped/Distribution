package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentRefinementsProvided extends StObject {
  
  /**
    * all the filters, the value is to pass to the refine function for removing all currentrefinements,
    * label is for the display. When existing several refinements for the same atribute name, then you
    * get a nested items object that contains a label and a value function to use to remove a single filter.
    * attribute and currentRefinement are metadata containing row values.
    */
  var items: js.Array[Refinement] = js.native
  
  /** the search query */
  var query: String = js.native
  
  def refine(refinement: js.Array[Refinement | RefinementValue]): Unit = js.native
  /** a function to remove a single filter */
  def refine(refinement: RefinementValue): Unit = js.native
}
