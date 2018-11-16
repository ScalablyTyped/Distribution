package typings
package storeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreJsAPI extends js.Object {
  val enabled: scala.Boolean = js.native
  val version: java.lang.String = js.native
  def addPlugin(plugin: js.Function): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def createStore(): StoreJsAPI = js.native
  def createStore(plugins: js.Array[js.Function]): StoreJsAPI = js.native
  def createStore(plugins: js.Array[js.Function], namespace: java.lang.String): StoreJsAPI = js.native
  def each(callback: js.Function2[/* val */ js.Any, /* namespacedKey */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, optionalDefaultValue: js.Any): js.Any = js.native
  def hasNamespace(namespace: java.lang.String): scala.Boolean = js.native
  def namespace(namespace: java.lang.String): StoreJsAPI = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): js.Any = js.native
}

