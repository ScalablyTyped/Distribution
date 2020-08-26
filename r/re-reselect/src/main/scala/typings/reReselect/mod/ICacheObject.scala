package typings.reReselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICacheObject extends js.Object {
  var isValidCacheKey: js.UndefOr[js.Function1[/* key */ js.Any, Boolean]] = js.native
  def clear(): Unit = js.native
  def get(key: js.Any): js.Any = js.native
  def remove(key: js.Any): Unit = js.native
  def set(key: js.Any, selectorFn: js.Any): Unit = js.native
}

object ICacheObject {
  @scala.inline
  def apply(clear: () => Unit, get: js.Any => js.Any, remove: js.Any => Unit, set: (js.Any, js.Any) => Unit): ICacheObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ICacheObject]
  }
  @scala.inline
  implicit class ICacheObjectOps[Self <: ICacheObject] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: js.Any => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setIsValidCacheKey(value: /* key */ js.Any => Boolean): Self = this.set("isValidCacheKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsValidCacheKey: Self = this.set("isValidCacheKey", js.undefined)
  }
  
}

