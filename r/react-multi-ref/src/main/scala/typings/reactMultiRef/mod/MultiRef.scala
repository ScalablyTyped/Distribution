package typings.reactMultiRef.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiRef[K, V] extends js.Object {
  val map: Map[K, V]
  def ref(key: K): js.Function1[/* value */ V | Null, _]
}

object MultiRef {
  @scala.inline
  def apply[K, V](map: Map[K, V], ref: K => js.Function1[/* value */ V | Null, _]): MultiRef[K, V] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
  
    __obj.asInstanceOf[MultiRef[K, V]]
  }
}

