package typings
package reservoirLib.reservoirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservoirArray[T]
  extends stdLib.Array[T] {
  /**
    * datum: one or more elements to consider for inclusion into the reservoir.
    * Returns the current length of the reservoir.
    */
  def pushSome(datum: T*): scala.Double = js.native
}

