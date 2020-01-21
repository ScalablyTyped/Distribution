package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.AnonCountIsRefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementListProvided extends js.Object {
  /** a boolean that says whether you can currently refine */
  var canRefine: Boolean
  /** the refinement currently applied */
  var currentRefinement: js.Array[String]
  /** a boolean that says if the items props contains facet values from the global search or from the search inside items. */
  var isFromSearch: Boolean
  /**
    * The list of items the RefinementList can display.
    * If isFromSearch is false, the hit properties like _highlightResult are undefined
    */
  var items: js.Array[Hit[AnonCountIsRefined]]
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to toggle a refinement */
  def refine(value: js.Array[String]): js.Any
  /** a function to toggle a search inside items values */
  def searchForItems(args: js.Any*): js.Any
}

object RefinementListProvided {
  @scala.inline
  def apply(
    canRefine: Boolean,
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: js.Array[String],
    isFromSearch: Boolean,
    items: js.Array[Hit[AnonCountIsRefined]],
    refine: js.Array[String] => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): RefinementListProvided = {
    val __obj = js.Dynamic.literal(canRefine = canRefine.asInstanceOf[js.Any], createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
  
    __obj.asInstanceOf[RefinementListProvided]
  }
}

