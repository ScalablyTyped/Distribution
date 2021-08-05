package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.auto
import typings.reactNativeNavigation.reactNativeNavigationStrings.hidden
import typings.reactNativeNavigation.reactNativeNavigationStrings.leading
import typings.reactNativeNavigation.reactNativeNavigationStrings.none
import typings.reactNativeNavigation.reactNativeNavigationStrings.overlay
import typings.reactNativeNavigation.reactNativeNavigationStrings.sidebar
import typings.reactNativeNavigation.reactNativeNavigationStrings.trailing
import typings.reactNativeNavigation.reactNativeNavigationStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSplitView extends StObject {
  
  /**
    * Master view display mode
    * @default 'auto'
    */
  var displayMode: js.UndefOr[auto | visible | hidden | overlay] = js.undefined
  
  /**
    * Set the maximum width of master view
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the minimum width of master view
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Set background style of sidebar. Currently works for Mac Catalyst apps only.
    * @default 'none'
    */
  var primaryBackgroundStyle: js.UndefOr[none | sidebar] = js.undefined
  
  /**
    * Master view side. Leading is left. Trailing is right.
    * @default 'leading'
    */
  var primaryEdge: js.UndefOr[leading | trailing] = js.undefined
}
object OptionsSplitView {
  
  inline def apply(): OptionsSplitView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSplitView]
  }
  
  extension [Self <: OptionsSplitView](x: Self) {
    
    inline def setDisplayMode(value: auto | visible | hidden | overlay): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setPrimaryBackgroundStyle(value: none | sidebar): Self = StObject.set(x, "primaryBackgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setPrimaryBackgroundStyleUndefined: Self = StObject.set(x, "primaryBackgroundStyle", js.undefined)
    
    inline def setPrimaryEdge(value: leading | trailing): Self = StObject.set(x, "primaryEdge", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEdgeUndefined: Self = StObject.set(x, "primaryEdge", js.undefined)
  }
}
