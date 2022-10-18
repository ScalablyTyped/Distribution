package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckJsDirective
  extends StObject
     with TextRange {
  
  var enabled: Boolean
}
object CheckJsDirective {
  
  inline def apply(enabled: Boolean, end: Double, pos: Double): CheckJsDirective = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckJsDirective]
  }
  
  extension [Self <: CheckJsDirective](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
