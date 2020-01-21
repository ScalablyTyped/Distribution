package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("showdown", "setFlavor")
@js.native
object setFlavor extends js.Object {
  /**
    * Setting a "global" flavor affects all instances of showdown.
    *
    * @param name - The flavor name.
    */
  def apply(name: Flavor): Unit = js.native
}

