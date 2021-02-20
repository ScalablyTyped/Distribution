package typings.reduxStorageEngineLocalstorage

import typings.reduxStorage.mod.StorageEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-storage-engine-localstorage", JSImport.Default)
  @js.native
  def default(key: String): StorageEngine = js.native
  @JSImport("redux-storage-engine-localstorage", JSImport.Default)
  @js.native
  def default(key: String, replacer: js.UndefOr[scala.Nothing], reviver: Reviver): StorageEngine = js.native
  @JSImport("redux-storage-engine-localstorage", JSImport.Default)
  @js.native
  def default(key: String, replacer: Replacer): StorageEngine = js.native
  @JSImport("redux-storage-engine-localstorage", JSImport.Default)
  @js.native
  def default(key: String, replacer: Replacer, reviver: Reviver): StorageEngine = js.native
  
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  
  type Reviver = Replacer
}
