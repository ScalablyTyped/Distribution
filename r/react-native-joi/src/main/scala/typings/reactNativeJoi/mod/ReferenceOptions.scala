package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceOptions extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  var contextPrefix: js.UndefOr[String] = js.undefined
  
  var functions: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object ReferenceOptions {
  
  inline def apply(): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions]
  }
  
  extension [Self <: ReferenceOptions](x: Self) {
    
    inline def setContextPrefix(value: String): Self = StObject.set(x, "contextPrefix", value.asInstanceOf[js.Any])
    
    inline def setContextPrefixUndefined: Self = StObject.set(x, "contextPrefix", js.undefined)
    
    inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
