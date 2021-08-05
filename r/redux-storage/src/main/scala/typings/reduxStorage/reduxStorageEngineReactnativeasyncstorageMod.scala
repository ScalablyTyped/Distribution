package typings.reduxStorage

import typings.reduxStorage.mod.StorageEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxStorageEngineReactnativeasyncstorageMod {
  
  @JSImport("redux-storage-engine-reactnativeasyncstorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(key: String): ReactNativeAsyncStorageEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[ReactNativeAsyncStorageEngine]
  
  type ReactNativeAsyncStorageEngine = StorageEngine
}
