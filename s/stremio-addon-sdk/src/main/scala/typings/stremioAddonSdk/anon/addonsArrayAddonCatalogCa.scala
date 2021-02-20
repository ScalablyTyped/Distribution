package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.AddonCatalog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  addons :std.Array<stremio-addon-sdk.stremio-addon-sdk.AddonCatalog>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
@js.native
trait addonsArrayAddonCatalogCa extends StObject {
  
  var addons: js.Array[AddonCatalog] = js.native
  
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.native
  
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.native
}
object addonsArrayAddonCatalogCa {
  
  @scala.inline
  def apply(addons: js.Array[AddonCatalog]): addonsArrayAddonCatalogCa = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any])
    __obj.asInstanceOf[addonsArrayAddonCatalogCa]
  }
  
  @scala.inline
  implicit class addonsArrayAddonCatalogCaMutableBuilder[Self <: addonsArrayAddonCatalogCa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddons(value: js.Array[AddonCatalog]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonsVarargs(value: AddonCatalog*): Self = StObject.set(x, "addons", js.Array(value :_*))
    
    @scala.inline
    def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    @scala.inline
    def setStaleError(value: Double): Self = StObject.set(x, "staleError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleErrorUndefined: Self = StObject.set(x, "staleError", js.undefined)
    
    @scala.inline
    def setStaleRevalidate(value: Double): Self = StObject.set(x, "staleRevalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleRevalidateUndefined: Self = StObject.set(x, "staleRevalidate", js.undefined)
  }
}
