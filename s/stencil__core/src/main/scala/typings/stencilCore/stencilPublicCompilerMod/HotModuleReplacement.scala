package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotModuleReplacement extends StObject {
  
  var componentsUpdated: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludeHmr: js.UndefOr[js.Array[String]] = js.undefined
  
  var externalStylesUpdated: js.UndefOr[js.Array[String]] = js.undefined
  
  var imagesUpdated: js.UndefOr[js.Array[String]] = js.undefined
  
  var indexHtmlUpdated: js.UndefOr[Boolean] = js.undefined
  
  var inlineStylesUpdated: js.UndefOr[js.Array[HmrStyleUpdate]] = js.undefined
  
  var reloadStrategy: PageReloadStrategy
  
  var scriptsAdded: js.UndefOr[js.Array[String]] = js.undefined
  
  var scriptsDeleted: js.UndefOr[js.Array[String]] = js.undefined
  
  var serviceWorkerUpdated: js.UndefOr[Boolean] = js.undefined
  
  var versionId: js.UndefOr[String] = js.undefined
}
object HotModuleReplacement {
  
  inline def apply(): HotModuleReplacement = {
    val __obj = js.Dynamic.literal(reloadStrategy = null)
    __obj.asInstanceOf[HotModuleReplacement]
  }
  
  extension [Self <: HotModuleReplacement](x: Self) {
    
    inline def setComponentsUpdated(value: js.Array[String]): Self = StObject.set(x, "componentsUpdated", value.asInstanceOf[js.Any])
    
    inline def setComponentsUpdatedUndefined: Self = StObject.set(x, "componentsUpdated", js.undefined)
    
    inline def setComponentsUpdatedVarargs(value: String*): Self = StObject.set(x, "componentsUpdated", js.Array(value*))
    
    inline def setExcludeHmr(value: js.Array[String]): Self = StObject.set(x, "excludeHmr", value.asInstanceOf[js.Any])
    
    inline def setExcludeHmrUndefined: Self = StObject.set(x, "excludeHmr", js.undefined)
    
    inline def setExcludeHmrVarargs(value: String*): Self = StObject.set(x, "excludeHmr", js.Array(value*))
    
    inline def setExternalStylesUpdated(value: js.Array[String]): Self = StObject.set(x, "externalStylesUpdated", value.asInstanceOf[js.Any])
    
    inline def setExternalStylesUpdatedUndefined: Self = StObject.set(x, "externalStylesUpdated", js.undefined)
    
    inline def setExternalStylesUpdatedVarargs(value: String*): Self = StObject.set(x, "externalStylesUpdated", js.Array(value*))
    
    inline def setImagesUpdated(value: js.Array[String]): Self = StObject.set(x, "imagesUpdated", value.asInstanceOf[js.Any])
    
    inline def setImagesUpdatedUndefined: Self = StObject.set(x, "imagesUpdated", js.undefined)
    
    inline def setImagesUpdatedVarargs(value: String*): Self = StObject.set(x, "imagesUpdated", js.Array(value*))
    
    inline def setIndexHtmlUpdated(value: Boolean): Self = StObject.set(x, "indexHtmlUpdated", value.asInstanceOf[js.Any])
    
    inline def setIndexHtmlUpdatedUndefined: Self = StObject.set(x, "indexHtmlUpdated", js.undefined)
    
    inline def setInlineStylesUpdated(value: js.Array[HmrStyleUpdate]): Self = StObject.set(x, "inlineStylesUpdated", value.asInstanceOf[js.Any])
    
    inline def setInlineStylesUpdatedUndefined: Self = StObject.set(x, "inlineStylesUpdated", js.undefined)
    
    inline def setInlineStylesUpdatedVarargs(value: HmrStyleUpdate*): Self = StObject.set(x, "inlineStylesUpdated", js.Array(value*))
    
    inline def setReloadStrategy(value: PageReloadStrategy): Self = StObject.set(x, "reloadStrategy", value.asInstanceOf[js.Any])
    
    inline def setReloadStrategyNull: Self = StObject.set(x, "reloadStrategy", null)
    
    inline def setScriptsAdded(value: js.Array[String]): Self = StObject.set(x, "scriptsAdded", value.asInstanceOf[js.Any])
    
    inline def setScriptsAddedUndefined: Self = StObject.set(x, "scriptsAdded", js.undefined)
    
    inline def setScriptsAddedVarargs(value: String*): Self = StObject.set(x, "scriptsAdded", js.Array(value*))
    
    inline def setScriptsDeleted(value: js.Array[String]): Self = StObject.set(x, "scriptsDeleted", value.asInstanceOf[js.Any])
    
    inline def setScriptsDeletedUndefined: Self = StObject.set(x, "scriptsDeleted", js.undefined)
    
    inline def setScriptsDeletedVarargs(value: String*): Self = StObject.set(x, "scriptsDeleted", js.Array(value*))
    
    inline def setServiceWorkerUpdated(value: Boolean): Self = StObject.set(x, "serviceWorkerUpdated", value.asInstanceOf[js.Any])
    
    inline def setServiceWorkerUpdatedUndefined: Self = StObject.set(x, "serviceWorkerUpdated", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
