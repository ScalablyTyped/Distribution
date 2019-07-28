package typings.reservoir.reservoirMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservoirArray[T] extends Array[T] {
  /**
    * datum: one or more elements to consider for inclusion into the reservoir.
    * Returns the current length of the reservoir.
    */
  def pushSome(datum: T*): Double = js.native
}

