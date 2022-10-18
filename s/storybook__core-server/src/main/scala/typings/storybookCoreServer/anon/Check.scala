package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  var check: Boolean
  
  var reactDocgen: String
  
  var reactDocgenTypescriptOptions: PropFilter
}
object Check {
  
  inline def apply(check: Boolean, reactDocgen: String, reactDocgenTypescriptOptions: PropFilter): Check = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], reactDocgen = reactDocgen.asInstanceOf[js.Any], reactDocgenTypescriptOptions = reactDocgenTypescriptOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
  
  extension [Self <: Check](x: Self) {
    
    inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setReactDocgen(value: String): Self = StObject.set(x, "reactDocgen", value.asInstanceOf[js.Any])
    
    inline def setReactDocgenTypescriptOptions(value: PropFilter): Self = StObject.set(x, "reactDocgenTypescriptOptions", value.asInstanceOf[js.Any])
  }
}
