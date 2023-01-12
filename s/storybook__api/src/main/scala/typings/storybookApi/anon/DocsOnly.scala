package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsOnly extends StObject {
  
  var docsOnly: js.UndefOr[Boolean] = js.undefined
  
  var viewMode: js.UndefOr[typings.storybookApi.distTs3Dot9ModulesAddonsMod.ViewMode] = js.undefined
}
object DocsOnly {
  
  inline def apply(): DocsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocsOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocsOnly] (val x: Self) extends AnyVal {
    
    inline def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
    
    inline def setDocsOnlyUndefined: Self = StObject.set(x, "docsOnly", js.undefined)
    
    inline def setViewMode(value: typings.storybookApi.distTs3Dot9ModulesAddonsMod.ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
