package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProvided[TDoc] extends js.Object {
  var currentRefinement: java.lang.String = js.native
  var hits: js.Array[Hit[TDoc]] = js.native
  def refine(): scala.Unit = js.native
  def refine(value: java.lang.String): scala.Unit = js.native
}

