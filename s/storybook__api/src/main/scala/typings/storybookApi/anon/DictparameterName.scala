package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictparameterName
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var docsOnly: js.UndefOr[Boolean] = js.undefined
  
  var fileName: String
  
  var options: StringDictionary[Any]
  
  var viewMode: js.UndefOr[typings.storybookApi.distTs3Dot9ModulesAddonsMod.ViewMode] = js.undefined
}
object DictparameterName {
  
  inline def apply(fileName: String, options: StringDictionary[Any]): DictparameterName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictparameterName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictparameterName] (val x: Self) extends AnyVal {
    
    inline def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
    
    inline def setDocsOnlyUndefined: Self = StObject.set(x, "docsOnly", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: typings.storybookApi.distTs3Dot9ModulesAddonsMod.ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
