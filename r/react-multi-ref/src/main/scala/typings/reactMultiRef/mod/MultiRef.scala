package typings.reactMultiRef.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiRef[K, V] extends js.Object {
  val map: Map[K, V] = js.native
  def ref(key: K): js.Function1[/* value */ V | Null, _] = js.native
}

object MultiRef {
  @scala.inline
  def apply[K, V](map: Map[K, V], ref: K => js.Function1[/* value */ V | Null, _]): MultiRef[K, V] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[MultiRef[K, V]]
  }
  @scala.inline
  implicit class MultiRefOps[Self <: MultiRef[_, _], K, V] (val x: Self with (MultiRef[K, V])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMap(value: Map[K, V]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: K => js.Function1[/* value */ V | Null, _]): Self = this.set("ref", js.Any.fromFunction1(value))
  }
  
}

