package typings.store2.store2Mod

import typings.store2.store2Numbers.`0`
import typings.store2.store2Numbers.`false`
import typings.store2.store2Numbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("store2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val local: StoreAPI = js.native
  val session: StoreAPI = js.native
  def apply(): StoredData = js.native
  def apply(clearIfFalsy: `false` | `0`): StoreAPI = js.native
  def apply(key: js.Any): js.Any = js.native
  def apply(key: js.Any, data: js.Any): js.Any = js.native
  def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
  def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
  def apply(obj: js.Object): StoredData = js.native
  def add(key: js.Any, data: js.Any): js.Any = js.native
  def area(id: String, area: Storage): StoreAPI = js.native
  def clear(): StoreAPI = js.native
  def clearAll(): StoreAPI = js.native
  @JSName("each")
  def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _]): StoreAPI = js.native
  @JSName("each")
  def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _], value: js.Any): StoreAPI = js.native
  def get(key: js.Any): js.Any = js.native
  def get(key: js.Any, alt: js.Any): js.Any = js.native
  def getAll(): StoredData = js.native
  def getAll(fillObj: StoredData): StoredData = js.native
  def has(key: js.Any): Boolean = js.native
  def isFake(): Boolean = js.native
  def keys(): js.Array[String] = js.native
  def keys(fillList: js.Array[String]): js.Array[String] = js.native
  def namespace(namespace: String): StoreAPI = js.native
  @JSName("namespace")
  def namespace_true(namespace: String, noSession: `true`): StoreAPI = js.native
  def remove(key: js.Any): js.Any = js.native
  def set(key: js.Any, data: js.Any): js.Any = js.native
  def set(key: js.Any, data: js.Any, overwrite: Boolean): js.Any = js.native
  def setAll(data: js.Object): StoredData = js.native
  def setAll(data: js.Object, overwrite: Boolean): StoredData = js.native
  def size(): Double = js.native
  def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
  def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
}

