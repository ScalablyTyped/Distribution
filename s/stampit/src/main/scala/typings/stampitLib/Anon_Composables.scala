package typings
package stampitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Composables extends js.Object {
  var composables: js.Array[stampitLib.stampitMod.Composable] = js.native
  @JSName("stamp")
  var stamp_Original: stampitLib.stampitMod.Stamp = js.native
  /**
    * Invokes the stamp and returns a new object instance.
    * @param state Properties you wish to set on the new objects.
    * @param encloseArgs The remaining arguments are passed to all .enclose() functions.
    * WARNING Avoid using two different .enclose() functions that expect different arguments.
    * .enclose() functions that take arguments should not be considered safe to compose
    * with other .enclose() functions that also take arguments. Taking arguments with
    * an .enclose() function is an anti-pattern that should be avoided, when possible.
    * @return A new object composed of the Stamps and prototypes provided.
    */
  def stamp(): js.Any = js.native
  def stamp(state: js.Object, encloseArgs: js.Any*): js.Any = js.native
}

