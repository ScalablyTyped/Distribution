package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharp", "counters")
@js.native
object counters extends js.Object {
  /**
    * Provides access to internal task counters.
    * @returns Object containing task counters
    */
  def apply(): SharpCounters = js.native
}

