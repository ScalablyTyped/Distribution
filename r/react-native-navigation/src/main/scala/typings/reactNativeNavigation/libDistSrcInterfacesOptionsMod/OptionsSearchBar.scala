package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSearchBar extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var cancelText: js.UndefOr[String] = js.undefined
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var hideOnScroll: js.UndefOr[Boolean] = js.undefined
  
  var hideTopBarOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var obscuresBackgroundDuringPresentation: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var tintColor: js.UndefOr[Color] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OptionsSearchBar {
  
  inline def apply(): OptionsSearchBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSearchBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsSearchBar] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    inline def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    inline def setHideTopBarOnFocus(value: Boolean): Self = StObject.set(x, "hideTopBarOnFocus", value.asInstanceOf[js.Any])
    
    inline def setHideTopBarOnFocusUndefined: Self = StObject.set(x, "hideTopBarOnFocus", js.undefined)
    
    inline def setObscuresBackgroundDuringPresentation(value: Boolean): Self = StObject.set(x, "obscuresBackgroundDuringPresentation", value.asInstanceOf[js.Any])
    
    inline def setObscuresBackgroundDuringPresentationUndefined: Self = StObject.set(x, "obscuresBackgroundDuringPresentation", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setTintColor(value: Color): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorNull: Self = StObject.set(x, "tintColor", null)
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
