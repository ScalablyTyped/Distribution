package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBarOptions extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object NavigationBarOptions {
  
  @scala.inline
  def apply(): NavigationBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarOptions]
  }
  
  @scala.inline
  implicit class NavigationBarOptionsMutableBuilder[Self <: NavigationBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
