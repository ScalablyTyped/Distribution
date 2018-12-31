package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoSearchProvided[THit] extends js.Object {
  /** the refinement currently applied */
  var currentRefinement: NESW
  /** the records that matched the search */
  var hits: js.Array[THit]
  /** true if the current refinement is set with the map bounds */
  var isRefinedWithMap: scala.Boolean
  /** the position of the search */
  var position: reactDashInstantsearchDashCoreLib.Anon_Lat
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to toggle the refinement */
  def refine(refinement: NESW): scala.Unit
}

