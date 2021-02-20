package typings.sidewayAddress.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analysis extends StObject {
  
  /**
    * The error code.
    */
  var code: String = js.native
  
  /**
    * The reason validation failed.
    */
  var error: String = js.native
}
object Analysis {
  
  @scala.inline
  def apply(code: String, error: String): Analysis = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analysis]
  }
  
  @scala.inline
  implicit class AnalysisMutableBuilder[Self <: Analysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
