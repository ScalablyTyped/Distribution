package typings.reactNativeElements.mod

import typings.reactNative.mod.ActivityIndicatorProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarBase extends InputProps {
  
  /**
    * Override the clear Icon props or use a custom component. Use null or false to hide the icon.
    */
  var clearIcon: js.UndefOr[IconNode] = js.native
  
  /**
    * Optional props to pass to the ActivityIndicator
    */
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.native
  
  /**
    * Callback fired when the input is blurred via the keyboard
    */
  @JSName("onBlur")
  var onBlur_SearchBarBase: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback fired when the clear button is pressed
    */
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback fired when the input is focused
    */
  @JSName("onFocus")
  var onFocus_SearchBarBase: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Override the search Icon props or use a custom component. Use null or false to hide the icon.
    */
  var searchIcon: js.UndefOr[IconNode] = js.native
  
  /**
    * If to show the loading indicator
    *
    * @default false
    */
  var showLoading: js.UndefOr[Boolean] = js.native
}
object SearchBarBase {
  
  @scala.inline
  def apply(): SearchBarBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarBase]
  }
  
  @scala.inline
  implicit class SearchBarBaseOps[Self <: SearchBarBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearIcon(value: IconNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setLoadingProps(value: ActivityIndicatorProperties): Self = this.set("loadingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingProps: Self = this.set("loadingProps", js.undefined)
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setSearchIcon(value: IconNode): Self = this.set("searchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchIcon: Self = this.set("searchIcon", js.undefined)
    
    @scala.inline
    def setShowLoading(value: Boolean): Self = this.set("showLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLoading: Self = this.set("showLoading", js.undefined)
  }
}
