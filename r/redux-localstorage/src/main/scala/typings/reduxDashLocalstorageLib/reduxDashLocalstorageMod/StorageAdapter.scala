package typings
package reduxDashLocalstorageLib.reduxDashLocalstorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageAdapter[A] extends js.Object {
  var `0`: A
  def del(key: java.lang.String, callback: AdapterCallback): scala.Unit
  def get(key: java.lang.String, callback: AdapterCallback): scala.Unit
  def put(key: java.lang.String, value: js.Any, callback: AdapterCallback): scala.Unit
}

object StorageAdapter {
  @scala.inline
  def apply[A](
    `0`: A,
    del: (java.lang.String, AdapterCallback) => scala.Unit,
    get: (java.lang.String, AdapterCallback) => scala.Unit,
    put: (java.lang.String, js.Any, AdapterCallback) => scala.Unit
  ): StorageAdapter[A] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), put = js.Any.fromFunction3(put))
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAdapter[A]]
  }
}

