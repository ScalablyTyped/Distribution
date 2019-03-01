package typings
package reactDashMultiDashRefLib.reactDashMultiDashRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiRef[K, V] extends js.Object {
  val map: stdLib.Map[K, V]
  def ref(key: K): js.Function1[/* value */ V | scala.Null, _]
}

object MultiRef {
  @scala.inline
  def apply[K, V](map: stdLib.Map[K, V], ref: js.Function1[K, js.Function1[/* value */ V | scala.Null, _]]): MultiRef[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[MultiRef[K, V]]
  }
}

