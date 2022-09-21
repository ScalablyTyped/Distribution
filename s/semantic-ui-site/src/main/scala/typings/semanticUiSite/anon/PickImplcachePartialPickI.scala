package typings.semanticUiSite.anon

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'cache'> & std.Partial<std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, keyof semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl>> */
trait PickImplcachePartialPickI
  extends StObject
     with Param {
  
  var cache: Any & js.UndefOr[Any]
  
  var config: js.UndefOr[Any] = js.undefined
  
  var section: js.UndefOr[Any] = js.undefined
  
  var sections: js.UndefOr[Any] = js.undefined
  
  var utilities: js.UndefOr[Any] = js.undefined
}
object PickImplcachePartialPickI {
  
  inline def apply(cache: Any & js.UndefOr[Any]): PickImplcachePartialPickI = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcachePartialPickI]
  }
  
  extension [Self <: PickImplcachePartialPickI](x: Self) {
    
    inline def setCache(value: Any & js.UndefOr[Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSections(value: Any): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setUtilities(value: Any): Self = StObject.set(x, "utilities", value.asInstanceOf[js.Any])
    
    inline def setUtilitiesUndefined: Self = StObject.set(x, "utilities", js.undefined)
  }
}
