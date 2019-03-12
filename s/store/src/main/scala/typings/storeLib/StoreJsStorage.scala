package typings
package storeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreJsStorage extends js.Object {
  var name: java.lang.String
  def clearAll(): scala.Unit
  def each(callback: js.Function2[/* val */ java.lang.String, /* key */ java.lang.String, _]): scala.Unit
  def read(key: java.lang.String): java.lang.String | scala.Null
  def remove(key: java.lang.String): scala.Unit
  def write(key: java.lang.String, data: java.lang.String): scala.Unit
}

object StoreJsStorage {
  @scala.inline
  def apply(
    clearAll: () => scala.Unit,
    each: js.Function2[/* val */ java.lang.String, /* key */ java.lang.String, _] => scala.Unit,
    name: java.lang.String,
    read: java.lang.String => java.lang.String | scala.Null,
    remove: java.lang.String => scala.Unit,
    write: (java.lang.String, java.lang.String) => scala.Unit
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), each = js.Any.fromFunction1(each), name = name, read = js.Any.fromFunction1(read), remove = js.Any.fromFunction1(remove), write = js.Any.fromFunction2(write))
  
    __obj.asInstanceOf[StoreJsStorage]
  }
}

