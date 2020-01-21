package typings.ramda

import typings.ramda.toolsMod.KeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/xprod", JSImport.Namespace)
@js.native
object xprodMod extends js.Object {
  def default[K](as: js.Array[K]): js.Function1[/* bs */ js.Array[_], js.Array[KeyValuePair[K, _]]] = js.native
  def default[K, V](as: js.Array[K], bs: js.Array[V]): js.Array[KeyValuePair[K, V]] = js.native
}

