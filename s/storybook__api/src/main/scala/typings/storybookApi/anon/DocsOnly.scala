package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocsOnly extends StObject {
  
  var docsOnly: js.UndefOr[Boolean] = js.native
  
  var viewMode: js.UndefOr[typings.storybookApi.addonsMod.ViewMode] = js.native
}
object DocsOnly {
  
  @scala.inline
  def apply(): DocsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocsOnly]
  }
  
  @scala.inline
  implicit class DocsOnlyMutableBuilder[Self <: DocsOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsOnlyUndefined: Self = StObject.set(x, "docsOnly", js.undefined)
    
    @scala.inline
    def setViewMode(value: typings.storybookApi.addonsMod.ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
