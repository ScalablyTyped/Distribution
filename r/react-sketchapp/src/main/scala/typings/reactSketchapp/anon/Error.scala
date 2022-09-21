package typings.reactSketchapp.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: Validator[String | js.Error]
}
object Error {
  
  inline def apply(error: Validator[String | js.Error]): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Validator[String | js.Error]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
