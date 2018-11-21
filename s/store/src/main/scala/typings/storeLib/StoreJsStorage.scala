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

