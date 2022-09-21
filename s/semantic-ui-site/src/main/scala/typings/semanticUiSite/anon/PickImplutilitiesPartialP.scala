package typings.semanticUiSite.anon

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'utilities'> & std.Partial<std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, keyof semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl>> */
trait PickImplutilitiesPartialP
  extends StObject
     with Param {
  
  var cache: js.UndefOr[Any] = js.undefined
  
  var config: js.UndefOr[Any] = js.undefined
  
  var section: js.UndefOr[Any] = js.undefined
  
  var sections: js.UndefOr[Any] = js.undefined
  
  var utilities: Any & js.UndefOr[Any]
}
object PickImplutilitiesPartialP {
  
  inline def apply(utilities: Any & js.UndefOr[Any]): PickImplutilitiesPartialP = {
    val __obj = js.Dynamic.literal(utilities = utilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplutilitiesPartialP]
  }
  
  extension [Self <: PickImplutilitiesPartialP](x: Self) {
    
    inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSections(value: Any): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setUtilities(value: Any & js.UndefOr[Any]): Self = StObject.set(x, "utilities", value.asInstanceOf[js.Any])
  }
}
