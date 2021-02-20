package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxState extends StObject {
  
  val isFocus: Boolean = js.native
  
  val isHover: Boolean = js.native
}
object CheckboxState {
  
  @scala.inline
  def apply(isFocus: Boolean, isHover: Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxState]
  }
  
  @scala.inline
  implicit class CheckboxStateMutableBuilder[Self <: CheckboxState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHover(value: Boolean): Self = StObject.set(x, "isHover", value.asInstanceOf[js.Any])
  }
}
