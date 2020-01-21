package typings.reactAutocomplete

import typings.reactAutocomplete.reactAutocompleteStrings.backward
import typings.reactAutocomplete.reactAutocompleteStrings.forward
import typings.reactAutocomplete.reactAutocompleteStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnBackward extends js.Object {
  def apply(start: Double, end: Double): Unit = js.native
  def apply(start: Double, end: Double, direction: backward): Unit = js.native
  def apply(start: Double, end: Double, direction: forward): Unit = js.native
  def apply(start: Double, end: Double, direction: none): Unit = js.native
}

