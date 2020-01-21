package typings.store2.mod

import typings.store2.store2Booleans.`false`
import typings.store2.store2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreAPI extends js.Object {
  def add(key: js.Any, data: js.Any): js.Any = js.native
  def clear(): StoreAPI = js.native
  def clearAll(): StoreAPI = js.native
  @JSName("each")
  def each_false(callback: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _]): StoreAPI = js.native
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
  def remove(key: js.Any, alt: js.Any): js.Any = js.native
  def set(key: js.Any, data: js.Any): js.Any = js.native
  def set(key: js.Any, data: js.Any, overwrite: Boolean): js.Any = js.native
  def setAll(data: js.Object): StoredData = js.native
  def setAll(data: js.Object, overwrite: Boolean): StoredData = js.native
  def size(): Double = js.native
  def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
  def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
}

