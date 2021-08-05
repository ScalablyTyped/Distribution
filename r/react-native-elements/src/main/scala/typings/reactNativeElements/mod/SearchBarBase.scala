package typings.reactNativeElements.mod

import typings.reactNative.mod.ActivityIndicatorProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBarBase
  extends StObject
     with InputProps {
  
  /**
    * Override the clear Icon props or use a custom component. Use null or false to hide the icon.
    */
  var clearIcon: js.UndefOr[IconNode] = js.undefined
  
  /**
    * Optional props to pass to the ActivityIndicator
    */
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.undefined
  
  /**
    * Callback fired when the input is blurred via the keyboard
    */
  @JSName("onBlur")
  var onBlur_SearchBarBase: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback fired when the clear button is pressed
    */
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback fired when the input is focused
    */
  @JSName("onFocus")
  var onFocus_SearchBarBase: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Override the search Icon props or use a custom component. Use null or false to hide the icon.
    */
  var searchIcon: js.UndefOr[IconNode] = js.undefined
  
  /**
    * If to show the loading indicator
    *
    * @default false
    */
  var showLoading: js.UndefOr[Boolean] = js.undefined
}
object SearchBarBase {
  
  inline def apply(): SearchBarBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarBase]
  }
  
  extension [Self <: SearchBarBase](x: Self) {
    
    inline def setClearIcon(value: IconNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setLoadingProps(value: ActivityIndicatorProperties): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setSearchIcon(value: IconNode): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
    
    inline def setSearchIconUndefined: Self = StObject.set(x, "searchIcon", js.undefined)
    
    inline def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    inline def setShowLoadingUndefined: Self = StObject.set(x, "showLoading", js.undefined)
  }
}
