package typings.rollup.anon

import typings.rollup.mod.RollupError
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends RollupWatcherEvent {
  
  var code: ERROR = js.native
  
  var error: RollupError = js.native
}
object Error {
  
  @scala.inline
  def apply(code: ERROR, error: RollupError): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ERROR): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: RollupError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
