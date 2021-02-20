package typings.reactNative.mod

import typings.reactNative.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputScrollEventData extends StObject {
  
  var contentOffset: X = js.native
}
object TextInputScrollEventData {
  
  @scala.inline
  def apply(contentOffset: X): TextInputScrollEventData = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputScrollEventData]
  }
  
  @scala.inline
  implicit class TextInputScrollEventDataMutableBuilder[Self <: TextInputScrollEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentOffset(value: X): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
  }
}
