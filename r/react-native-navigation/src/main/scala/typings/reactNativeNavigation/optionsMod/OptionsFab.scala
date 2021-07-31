package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.left
import typings.reactNativeNavigation.reactNativeNavigationStrings.mini
import typings.reactNativeNavigation.reactNativeNavigationStrings.regular
import typings.reactNativeNavigation.reactNativeNavigationStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsFab extends StObject {
  
  var alignHorizontally: js.UndefOr[left | right] = js.undefined
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var clickColor: js.UndefOr[Color] = js.undefined
  
  var hideOnScroll: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[ImageResource] = js.undefined
  
  var iconColor: js.UndefOr[Color] = js.undefined
  
  var id: String
  
  var rippleColor: js.UndefOr[Color] = js.undefined
  
  var size: js.UndefOr[mini | regular] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OptionsFab {
  
  @scala.inline
  def apply(id: String): OptionsFab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsFab]
  }
  
  @scala.inline
  implicit class OptionsFabMutableBuilder[Self <: OptionsFab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignHorizontally(value: left | right): Self = StObject.set(x, "alignHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignHorizontallyUndefined: Self = StObject.set(x, "alignHorizontally", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setClickColor(value: Color): Self = StObject.set(x, "clickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickColorUndefined: Self = StObject.set(x, "clickColor", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageResource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: Color): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColor(value: Color): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setSize(value: mini | regular): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
