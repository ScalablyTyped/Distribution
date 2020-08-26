package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplifiedMap extends SimplifiedSet {
  def get(key: js.Any): js.Any = js.native
}

object SimplifiedMap {
  @scala.inline
  def apply(get: js.Any => js.Any, has: js.Any => Boolean): SimplifiedMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedMap]
  }
  @scala.inline
  implicit class SimplifiedMapOps[Self <: SimplifiedMap] (val x: Self) extends AnyVal {
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
    def setGet(value: js.Any => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

