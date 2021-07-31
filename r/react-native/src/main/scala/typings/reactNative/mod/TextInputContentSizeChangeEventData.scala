package typings.reactNative.mod

import typings.reactNative.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputContentSizeChangeEventData extends StObject {
  
  var contentSize: Height
}
object TextInputContentSizeChangeEventData {
  
  @scala.inline
  def apply(contentSize: Height): TextInputContentSizeChangeEventData = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputContentSizeChangeEventData]
  }
  
  @scala.inline
  implicit class TextInputContentSizeChangeEventDataMutableBuilder[Self <: TextInputContentSizeChangeEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSize(value: Height): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
  }
}
