package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProvided[TDoc] extends js.Object {
  var currentRefinement: String = js.native
  var hits: js.Array[Hit[TDoc]] = js.native
  def refine(): Unit = js.native
  def refine(value: String): Unit = js.native
}

