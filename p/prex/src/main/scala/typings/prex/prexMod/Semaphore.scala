package typings.prex.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "Semaphore")
@js.native
class Semaphore protected ()
  extends typings.prex.outLibSemaphoreMod.Semaphore {
  /**
    * Initializes a new instance of the Semaphore class.
    *
    * @param initialCount The initial number of entries.
    * @param maxCount The maximum number of entries.
    */
  def this(initialCount: Double) = this()
  def this(initialCount: Double, maxCount: Double) = this()
}

