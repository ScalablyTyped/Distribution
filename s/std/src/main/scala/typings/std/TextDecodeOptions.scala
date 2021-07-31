package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecodeOptions extends StObject {
  
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}
object TextDecodeOptions {
  
  @scala.inline
  def apply(): TextDecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecodeOptions]
  }
  
  @scala.inline
  implicit class TextDecodeOptionsMutableBuilder[Self <: TextDecodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: scala.Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
