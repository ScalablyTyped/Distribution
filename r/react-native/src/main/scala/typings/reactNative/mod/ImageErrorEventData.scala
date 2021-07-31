package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageErrorEventData extends StObject {
  
  var error: js.Any
}
object ImageErrorEventData {
  
  @scala.inline
  def apply(error: js.Any): ImageErrorEventData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageErrorEventData]
  }
  
  @scala.inline
  implicit class ImageErrorEventDataMutableBuilder[Self <: ImageErrorEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
