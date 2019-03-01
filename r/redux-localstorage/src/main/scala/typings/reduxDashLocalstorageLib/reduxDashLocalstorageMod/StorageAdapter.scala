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
    del: js.Function2[java.lang.String, AdapterCallback, scala.Unit],
    get: js.Function2[java.lang.String, AdapterCallback, scala.Unit],
    put: js.Function3[java.lang.String, js.Any, AdapterCallback, scala.Unit]
  ): StorageAdapter[A] = {
    val __obj = js.Dynamic.literal(`0` = `0`.asInstanceOf[js.Any])
    __obj.updateDynamic("del")(del)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("put")(put)
    __obj.asInstanceOf[StorageAdapter[A]]
  }
}

