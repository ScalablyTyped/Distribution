package typings
package store2Lib.store2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreAPI extends js.Object {
  def add(key: js.Any, data: js.Any): js.Any = js.native
  def clear(): StoreAPI = js.native
  def clearAll(): StoreAPI = js.native
  def each(
    callback: js.Function2[/* key */ js.Any, /* data */ js.Any, store2Lib.store2LibNumbers.`false` | _]
  ): StoreAPI = js.native
  def get(key: js.Any): js.Any = js.native
  def get(key: js.Any, alt: js.Any): js.Any = js.native
  def getAll(): StoredData = js.native
  def getAll(fillObj: StoredData): StoredData = js.native
  def has(key: js.Any): scala.Boolean = js.native
  def isFake(): scala.Boolean = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def keys(fillList: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def namespace(namespace: java.lang.String): StoreAPI = js.native
  def namespace(namespace: java.lang.String, noSession: store2Lib.store2LibNumbers.`true`): StoreAPI = js.native
  def remove(key: js.Any): js.Any = js.native
  def set(key: js.Any, data: js.Any): js.Any = js.native
  def set(key: js.Any, data: js.Any, overwrite: scala.Boolean): js.Any = js.native
  def setAll(data: js.Object): StoredData = js.native
  def setAll(data: js.Object, overwrite: scala.Boolean): StoredData = js.native
  def size(): scala.Double = js.native
  def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
  def transact(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
}

