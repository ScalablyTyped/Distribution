package typings.reactNativeVideo.mod

import typings.reactNativeVideo.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadError extends StObject {
  
  var error: _empty
}
object LoadError {
  
  @scala.inline
  def apply(error: _empty): LoadError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadError]
  }
  
  @scala.inline
  implicit class LoadErrorMutableBuilder[Self <: LoadError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: _empty): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
