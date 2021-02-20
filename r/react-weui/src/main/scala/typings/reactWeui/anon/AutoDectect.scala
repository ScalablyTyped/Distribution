package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoDectect extends StObject {
  
  var autoDectect: Boolean = js.native
  
  var buttons: js.Array[_] = js.native
  
  var show: Boolean = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
}
object AutoDectect {
  
  @scala.inline
  def apply(autoDectect: Boolean, buttons: js.Array[_], show: Boolean, title: String, `type`: String): AutoDectect = {
    val __obj = js.Dynamic.literal(autoDectect = autoDectect.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDectect]
  }
  
  @scala.inline
  implicit class AutoDectectMutableBuilder[Self <: AutoDectect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDectect(value: Boolean): Self = StObject.set(x, "autoDectect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: js.Array[_]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: js.Any*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
