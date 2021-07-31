package typings.reactMapGl.mod

import typings.reactMapGl.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapError extends StObject {
  
  var error: js.UndefOr[Message] = js.undefined
  
  var status: Double
}
object MapError {
  
  @scala.inline
  def apply(status: Double): MapError = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapError]
  }
  
  @scala.inline
  implicit class MapErrorMutableBuilder[Self <: MapError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
