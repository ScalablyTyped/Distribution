package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheOptions extends StObject {
  
  /** Is the maximum number of files to hold open (optional, default 20) */
  var files: js.UndefOr[Double] = js.undefined
  
  /** Is the maximum number of operations to cache (optional, default 100) */
  var items: js.UndefOr[Double] = js.undefined
  
  /** Is the maximum memory in MB to use for this cache (optional, default 50) */
  var memory: js.UndefOr[Double] = js.undefined
}
object CacheOptions {
  
  inline def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  
  extension [Self <: CacheOptions](x: Self) {
    
    inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
