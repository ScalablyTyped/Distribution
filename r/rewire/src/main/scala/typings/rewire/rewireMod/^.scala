package typings.rewire.rewireMod

import typings.rewire.rewireMod.RewireInterfacesNs.RewiredModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rewire", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a rewired version of the module found at filename. Use rewire() exactly like require().
    */
  def apply[T](filename: String): RewiredModule with T = js.native
}

