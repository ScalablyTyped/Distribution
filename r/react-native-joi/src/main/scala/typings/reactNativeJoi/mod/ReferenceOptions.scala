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
  
  @scala.inline
  def apply(): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions]
  }
  
  @scala.inline
  implicit class ReferenceOptionsMutableBuilder[Self <: ReferenceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextPrefix(value: String): Self = StObject.set(x, "contextPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextPrefixUndefined: Self = StObject.set(x, "contextPrefix", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
