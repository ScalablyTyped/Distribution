package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QElementList extends js.Object {
  // Retrieve an element from the list. Positive and negative indices are allowed. Throws an exception if the index is out of bounds.
  def at(index: scala.Double): QElement = js.native
  // Retrieve an element from the list. Positive and negative indices are allowed. Throws an exception if the index is out of bounds.
  def at(index: scala.Double, nickname: java.lang.String): QElement = js.native
  // Determine the number of elements in the list.
  def length(): scala.Double = js.native
}

