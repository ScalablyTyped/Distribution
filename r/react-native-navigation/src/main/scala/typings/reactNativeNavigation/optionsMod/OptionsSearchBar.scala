package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSearchBar extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  
  var hideTopBarOnFocus: js.UndefOr[Boolean] = js.native
  
  var obscuresBackgroundDuringPresentation: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var tintColor: js.UndefOr[Color] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object OptionsSearchBar {
  
  @scala.inline
  def apply(): OptionsSearchBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSearchBar]
  }
  
  @scala.inline
  implicit class OptionsSearchBarMutableBuilder[Self <: OptionsSearchBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    @scala.inline
    def setHideTopBarOnFocus(value: Boolean): Self = StObject.set(x, "hideTopBarOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTopBarOnFocusUndefined: Self = StObject.set(x, "hideTopBarOnFocus", js.undefined)
    
    @scala.inline
    def setObscuresBackgroundDuringPresentation(value: Boolean): Self = StObject.set(x, "obscuresBackgroundDuringPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObscuresBackgroundDuringPresentationUndefined: Self = StObject.set(x, "obscuresBackgroundDuringPresentation", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setTintColor(value: Color): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
