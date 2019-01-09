package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementListProvided extends js.Object {
  /** a boolean that says whether you can currently refine */
  var canRefine: scala.Boolean
  /** the refinement currently applied */
  var currentRefinement: js.Array[java.lang.String]
  /** a boolean that says if the items props contains facet values from the global search or from the search inside items. */
  var isFromSearch: scala.Boolean
  /**
    * The list of items the RefinementList can display.
    * If isFromSearch is false, the hit properties like _highlightResult are undefined
    */
  var items: js.Array[Hit[reactDashInstantsearchDashCoreLib.Anon_CountIsRefined]]
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to toggle a refinement */
  def refine(value: js.Array[java.lang.String]): js.Any
  /** a function to toggle a search inside items values */
  def searchForItems(args: js.Any*): js.Any
}

