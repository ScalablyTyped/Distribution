package typings.reduxLocalstorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageAdapter[A] extends js.Object {
  var `0`: A
  def del(key: String, callback: AdapterCallback): Unit
  def get(key: String, callback: AdapterCallback): Unit
  def put(key: String, value: js.Any, callback: AdapterCallback): Unit
}

object StorageAdapter {
  @scala.inline
  def apply[A](
    `0`: A,
    del: (String, AdapterCallback) => Unit,
    get: (String, AdapterCallback) => Unit,
    put: (String, js.Any, AdapterCallback) => Unit
  ): StorageAdapter[A] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), put = js.Any.fromFunction3(put))
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAdapter[A]]
  }
}

