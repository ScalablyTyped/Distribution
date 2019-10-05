package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "initializers")
@js.native
object initializers extends js.Object {
  /**
    * A shortcut method for stampit().initializers()
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def apply(functions: Init*): Stamp = js.native
  /**
    * A shortcut method for stampit().initializers()
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def apply(functions: js.Array[Init]): Stamp = js.native
}

