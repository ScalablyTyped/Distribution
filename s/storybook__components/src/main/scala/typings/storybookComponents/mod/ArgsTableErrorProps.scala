package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsTableErrorProps extends StObject {
  
  var error: ArgsTableError
}
object ArgsTableErrorProps {
  
  inline def apply(error: ArgsTableError): ArgsTableErrorProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsTableErrorProps]
  }
  
  extension [Self <: ArgsTableErrorProps](x: Self) {
    
    inline def setError(value: ArgsTableError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
