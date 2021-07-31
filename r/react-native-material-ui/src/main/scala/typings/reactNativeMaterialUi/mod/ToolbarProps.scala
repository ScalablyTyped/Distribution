package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarProps extends StObject {
  
  var centerElement: js.UndefOr[Element | String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var isSearchActive: js.UndefOr[Boolean] = js.undefined
  
  var leftElement: js.UndefOr[Element | String] = js.undefined
  
  var onLeftElementPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onRightElementPress: js.UndefOr[js.Function1[/* e */ RightElementPressEvent, Unit]] = js.undefined
  
  var rightElement: js.UndefOr[Element | String | js.Array[String] | ToolBarRightElement] = js.undefined
  
  var searchable: js.UndefOr[Searchable] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[ToolbarStyle] = js.undefined
}
object ToolbarProps {
  
  @scala.inline
  def apply(): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarProps]
  }
  
  @scala.inline
  implicit class ToolbarPropsMutableBuilder[Self <: ToolbarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterElement(value: Element | String): Self = StObject.set(x, "centerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterElementUndefined: Self = StObject.set(x, "centerElement", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIsSearchActive(value: Boolean): Self = StObject.set(x, "isSearchActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchActiveUndefined: Self = StObject.set(x, "isSearchActive", js.undefined)
    
    @scala.inline
    def setLeftElement(value: Element | String): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    @scala.inline
    def setOnLeftElementPress(value: () => Unit): Self = StObject.set(x, "onLeftElementPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLeftElementPressUndefined: Self = StObject.set(x, "onLeftElementPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnRightElementPress(value: /* e */ RightElementPressEvent => Unit): Self = StObject.set(x, "onRightElementPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRightElementPressUndefined: Self = StObject.set(x, "onRightElementPress", js.undefined)
    
    @scala.inline
    def setRightElement(value: Element | String | js.Array[String] | ToolBarRightElement): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    @scala.inline
    def setRightElementVarargs(value: String*): Self = StObject.set(x, "rightElement", js.Array(value :_*))
    
    @scala.inline
    def setSearchable(value: Searchable): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: ToolbarStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
