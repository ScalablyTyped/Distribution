package typings.rcFieldForm.nameMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NameMap like a `Map` but accepts `string[]` as key.
  */
@js.native
trait NameMap[T] extends js.Object {
  var list: js.Any = js.native
  def delete(key: InternalNamePath): Unit = js.native
  def get(key: InternalNamePath): T = js.native
  def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U] = js.native
  def set(key: InternalNamePath, value: T): Unit = js.native
  def toJSON(): StringDictionary[T] = js.native
  def update(key: InternalNamePath, updater: js.Function1[/* origin */ T, T | Null]): Unit = js.native
}

object NameMap {
  @scala.inline
  def apply[T](
    delete: InternalNamePath => Unit,
    get: InternalNamePath => T,
    list: js.Any,
    map: js.Function1[/* kv */ KV[T], js.Any] => js.Array[js.Any],
    set: (InternalNamePath, T) => Unit,
    toJSON: () => StringDictionary[T],
    update: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit
  ): NameMap[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = list.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[NameMap[T]]
  }
  @scala.inline
  implicit class NameMapOps[Self <: NameMap[_], T] (val x: Self with NameMap[T]) extends AnyVal {
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
    def setDelete(value: InternalNamePath => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: InternalNamePath => T): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: js.Any): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: js.Function1[/* kv */ KV[T], js.Any] => js.Array[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (InternalNamePath, T) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setToJSON(value: () => StringDictionary[T]): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

