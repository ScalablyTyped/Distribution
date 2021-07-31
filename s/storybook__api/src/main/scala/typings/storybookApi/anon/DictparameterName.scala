package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictparameterName
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var docsOnly: js.UndefOr[Boolean] = js.undefined
  
  var fileName: String
  
  var options: StringDictionary[js.Any]
  
  var viewMode: js.UndefOr[typings.storybookApi.addonsMod.ViewMode] = js.undefined
}
object DictparameterName {
  
  @scala.inline
  def apply(fileName: String, options: StringDictionary[js.Any]): DictparameterName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictparameterName]
  }
  
  @scala.inline
  implicit class DictparameterNameMutableBuilder[Self <: DictparameterName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsOnlyUndefined: Self = StObject.set(x, "docsOnly", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: typings.storybookApi.addonsMod.ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
