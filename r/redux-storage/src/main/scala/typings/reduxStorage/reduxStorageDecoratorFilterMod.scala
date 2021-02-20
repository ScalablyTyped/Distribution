package typings.reduxStorage

import org.scalablytyped.runtime.NumberDictionary
import typings.reduxStorage.mod.StorageEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxStorageDecoratorFilterMod {
  
  @JSImport("redux-storage-decorator-filter", JSImport.Default)
  @js.native
  def default(engine: StorageEngine): StorageEngine = js.native
  @JSImport("redux-storage-decorator-filter", JSImport.Default)
  @js.native
  def default(engine: StorageEngine, whitelist: js.UndefOr[scala.Nothing], blacklist: FilterList): StorageEngine = js.native
  @JSImport("redux-storage-decorator-filter", JSImport.Default)
  @js.native
  def default(engine: StorageEngine, whitelist: FilterList): StorageEngine = js.native
  @JSImport("redux-storage-decorator-filter", JSImport.Default)
  @js.native
  def default(engine: StorageEngine, whitelist: FilterList, blacklist: FilterList): StorageEngine = js.native
  
  type FilterList = NumberDictionary[String | js.Array[String]]
}
