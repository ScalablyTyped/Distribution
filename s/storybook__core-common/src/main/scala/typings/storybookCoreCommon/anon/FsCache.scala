package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsCache extends StObject {
  
  var fsCache: js.UndefOr[Boolean] = js.undefined
  
  var lazyCompilation: js.UndefOr[Boolean] = js.undefined
}
object FsCache {
  
  inline def apply(): FsCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsCache]
  }
  
  extension [Self <: FsCache](x: Self) {
    
    inline def setFsCache(value: Boolean): Self = StObject.set(x, "fsCache", value.asInstanceOf[js.Any])
    
    inline def setFsCacheUndefined: Self = StObject.set(x, "fsCache", js.undefined)
    
    inline def setLazyCompilation(value: Boolean): Self = StObject.set(x, "lazyCompilation", value.asInstanceOf[js.Any])
    
    inline def setLazyCompilationUndefined: Self = StObject.set(x, "lazyCompilation", js.undefined)
  }
}
