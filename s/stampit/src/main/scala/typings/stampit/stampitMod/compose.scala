package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "compose")
@js.native
object compose extends js.Object {
  /**
    * Take two or more Composables and combine them to produce a new Stamp.
    * Combining overrides properties with last-in priority.
    * @param composables Composable objects used to create the stamp.
    * @return A new Stamp made of all the given composables.
    */
  def apply(composables: Composable*): Stamp = js.native
}

