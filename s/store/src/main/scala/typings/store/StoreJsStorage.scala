package typings.store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreJsStorage extends js.Object {
  var name: String
  def clearAll(): Unit
  def each(callback: js.Function2[/* val */ String, /* key */ String, _]): Unit
  def read(key: String): String | Null
  def remove(key: String): Unit
  def write(key: String, data: String): Unit
}

object StoreJsStorage {
  @scala.inline
  def apply(
    clearAll: () => Unit,
    each: js.Function2[/* val */ String, /* key */ String, _] => Unit,
    name: String,
    read: String => String | Null,
    remove: String => Unit,
    write: (String, String) => Unit
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), each = js.Any.fromFunction1(each), name = name, read = js.Any.fromFunction1(read), remove = js.Any.fromFunction1(remove), write = js.Any.fromFunction2(write))
  
    __obj.asInstanceOf[StoreJsStorage]
  }
}

