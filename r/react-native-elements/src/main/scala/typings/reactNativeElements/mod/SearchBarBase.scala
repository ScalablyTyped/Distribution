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
  
  @scala.inline
  def apply(): SearchBarBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarBase]
  }
  
  @scala.inline
  implicit class SearchBarBaseMutableBuilder[Self <: SearchBarBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIcon(value: IconNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    @scala.inline
    def setLoadingProps(value: ActivityIndicatorProperties): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setSearchIcon(value: IconNode): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchIconUndefined: Self = StObject.set(x, "searchIcon", js.undefined)
    
    @scala.inline
    def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLoadingUndefined: Self = StObject.set(x, "showLoading", js.undefined)
  }
}
