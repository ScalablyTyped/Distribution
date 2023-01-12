package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRulesPath extends StObject {
  
  var customRulesPath: js.UndefOr[String] = js.undefined
}
object CustomRulesPath {
  
  inline def apply(): CustomRulesPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRulesPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomRulesPath] (val x: Self) extends AnyVal {
    
    inline def setCustomRulesPath(value: String): Self = StObject.set(x, "customRulesPath", value.asInstanceOf[js.Any])
    
    inline def setCustomRulesPathUndefined: Self = StObject.set(x, "customRulesPath", js.undefined)
  }
}
