package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "statics")
@js.native
object statics extends js.Object {
  /**
    * A shortcut method for stampit().statics()
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    * @return A new Stamp.
    */
  def apply(statics: js.Object*): Stamp = js.native
}

