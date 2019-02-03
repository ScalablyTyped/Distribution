package typings
package simpleDashLruLib.simpleDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-lru", JSImport.Namespace)
@js.native
class namespaced[K, V] protected () extends SimpleLRU[K, V] {
  def this(max: scala.Double) = this()
}

/* static members */
@JSImport("simple-lru", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var version: java.lang.String = js.native
}

