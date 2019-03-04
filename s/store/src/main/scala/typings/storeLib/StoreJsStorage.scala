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
    clearAll: js.Function0[scala.Unit],
    each: js.Function1[
      js.Function2[/* val */ java.lang.String, /* key */ java.lang.String, _], 
      scala.Unit
    ],
    name: java.lang.String,
    read: js.Function1[java.lang.String, java.lang.String | scala.Null],
    remove: js.Function1[java.lang.String, scala.Unit],
    write: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(clearAll = clearAll, each = each, name = name, read = read, remove = remove, write = write)
  
    __obj.asInstanceOf[StoreJsStorage]
  }
}

