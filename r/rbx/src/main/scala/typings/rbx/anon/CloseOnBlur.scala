package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseOnBlur extends StObject {
  
  var closeOnBlur: Boolean = js.native
  
  var closeOnEsc: Boolean = js.native
}
object CloseOnBlur {
  
  @scala.inline
  def apply(closeOnBlur: Boolean, closeOnEsc: Boolean): CloseOnBlur = {
    val __obj = js.Dynamic.literal(closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOnBlur]
  }
  
  @scala.inline
  implicit class CloseOnBlurMutableBuilder[Self <: CloseOnBlur] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
  }
}
