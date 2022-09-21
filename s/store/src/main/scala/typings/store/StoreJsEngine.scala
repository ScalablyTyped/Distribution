package typings.store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreJsEngine extends StObject {
  
  def createStore(storages: js.Array[Any]): StoreJsAPI = js.native
  def createStore(storages: js.Array[Any], plugins: js.Array[Any]): StoreJsAPI = js.native
  def createStore(storages: js.Array[Any], plugins: js.Array[Any], namespace: String): StoreJsAPI = js.native
  def createStore(storages: js.Array[Any], plugins: Unit, namespace: String): StoreJsAPI = js.native
}
