package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.MetaDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  meta :stremio-addon-sdk.stremio-addon-sdk.MetaDetail} & stremio-addon-sdk.stremio-addon-sdk.Cache */
trait metaMetaDetailCache extends StObject {
  
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  
  var meta: MetaDetail
  
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.undefined
  
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.undefined
}
object metaMetaDetailCache {
  
  inline def apply(meta: MetaDetail): metaMetaDetailCache = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[metaMetaDetailCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: metaMetaDetailCache] (val x: Self) extends AnyVal {
    
    inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    inline def setMeta(value: MetaDetail): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setStaleError(value: Double): Self = StObject.set(x, "staleError", value.asInstanceOf[js.Any])
    
    inline def setStaleErrorUndefined: Self = StObject.set(x, "staleError", js.undefined)
    
    inline def setStaleRevalidate(value: Double): Self = StObject.set(x, "staleRevalidate", value.asInstanceOf[js.Any])
    
    inline def setStaleRevalidateUndefined: Self = StObject.set(x, "staleRevalidate", js.undefined)
  }
}
