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

