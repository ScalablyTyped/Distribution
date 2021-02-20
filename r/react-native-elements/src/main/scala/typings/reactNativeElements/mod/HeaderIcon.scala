package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderIcon
  extends IconObject
     with _HeaderSubComponent {
  
  var icon: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object HeaderIcon {
  
  @scala.inline
  def apply(): HeaderIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderIcon]
  }
  
  @scala.inline
  implicit class HeaderIconMutableBuilder[Self <: HeaderIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
