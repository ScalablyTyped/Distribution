package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputContentSizeChangeEventData extends StObject {
  
  var contentSize: Width
}
object TextInputContentSizeChangeEventData {
  
  inline def apply(contentSize: Width): TextInputContentSizeChangeEventData = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputContentSizeChangeEventData]
  }
  
  extension [Self <: TextInputContentSizeChangeEventData](x: Self) {
    
    inline def setContentSize(value: Width): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
  }
}
