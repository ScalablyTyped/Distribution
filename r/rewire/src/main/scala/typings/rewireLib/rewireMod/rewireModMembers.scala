package typings
package rewireLib.rewireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rewire", JSImport.Namespace)
@js.native
object rewireModMembers extends js.Object {
  /**
   * Returns a rewired version of the module found at filename. Use rewire() exactly like require().
   */
  def apply[T](filename: java.lang.String): rewireLib.rewireMod.RewireInterfacesNs.RewiredModule with T = js.native
}

