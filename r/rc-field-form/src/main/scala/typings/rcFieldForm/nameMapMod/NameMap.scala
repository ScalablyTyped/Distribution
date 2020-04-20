package typings.rcFieldForm.nameMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NameMap like a `Map` but accepts `string[]` as key.
  */
trait NameMap[T] extends js.Object {
  var list: js.Any
  def delete(key: InternalNamePath): Unit
  def get(key: InternalNamePath): T
  def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U]
  def set(key: InternalNamePath, value: T): Unit
  def toJSON(): StringDictionary[T]
  def update(key: InternalNamePath, updater: js.Function1[/* origin */ T, T | Null]): Unit
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
}

