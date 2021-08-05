package typings.reduxStorage

import org.scalablytyped.runtime.NumberDictionary
import typings.reduxStorage.mod.StorageEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxStorageDecoratorFilterMod {
  
  @JSImport("redux-storage-decorator-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(engine: StorageEngine): StorageEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(engine.asInstanceOf[js.Any]).asInstanceOf[StorageEngine]
  inline def default(engine: StorageEngine, whitelist: Unit, blacklist: FilterList): StorageEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(engine.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[StorageEngine]
  inline def default(engine: StorageEngine, whitelist: FilterList): StorageEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(engine.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[StorageEngine]
  inline def default(engine: StorageEngine, whitelist: FilterList, blacklist: FilterList): StorageEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(engine.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[StorageEngine]
  
  type FilterList = NumberDictionary[String | js.Array[String]]
}
