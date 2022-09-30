package typings.reduxStorageEngineLocalstorage

import typings.reduxStorage.mod.StorageEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-storage-engine-localstorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(key: String): StorageEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[StorageEngine]
  inline def default(key: String, replacer: Unit, reviver: Reviver): StorageEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[StorageEngine]
  inline def default(key: String, replacer: Replacer): StorageEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[StorageEngine]
  inline def default(key: String, replacer: Replacer, reviver: Reviver): StorageEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[StorageEngine]
  
  type Replacer = js.Function2[/* key */ String, /* value */ Any, Any]
  
  type Reviver = Replacer
}
