package typings.store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreJsEngine extends js.Object {
  
  def createStore(storages: js.Array[_]): StoreJsAPI = js.native
  def createStore(storages: js.Array[_], plugins: js.UndefOr[scala.Nothing], namespace: String): StoreJsAPI = js.native
  def createStore(storages: js.Array[_], plugins: js.Array[_]): StoreJsAPI = js.native
  def createStore(storages: js.Array[_], plugins: js.Array[_], namespace: String): StoreJsAPI = js.native
}
