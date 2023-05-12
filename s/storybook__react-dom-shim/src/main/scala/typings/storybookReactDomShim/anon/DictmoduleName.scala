package typings.storybookReactDomShim.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictmoduleName
  extends StObject
     with /* moduleName */ StringDictionary[js.UndefOr[String]] {
  
  var browser: js.UndefOr[String] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
}
object DictmoduleName {
  
  inline def apply(): DictmoduleName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictmoduleName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictmoduleName] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
  }
}
