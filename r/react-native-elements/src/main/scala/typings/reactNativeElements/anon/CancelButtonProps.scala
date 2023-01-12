package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButtonProps extends StObject {
  
  var cancelButtonTitle: String
  
  var clearIcon: Name
  
  def onBlur(): Any
  
  def onCancel(): Any
  
  def onChangeText(): Any
  
  def onClear(): Any
  
  def onFocus(): Any
  
  var searchIcon: Name
  
  var showCancel: Boolean
  
  var showLoading: Boolean
  
  var value: String
}
object CancelButtonProps {
  
  inline def apply(
    cancelButtonTitle: String,
    clearIcon: Name,
    onBlur: () => Any,
    onCancel: () => Any,
    onChangeText: () => Any,
    onClear: () => Any,
    onFocus: () => Any,
    searchIcon: Name,
    showCancel: Boolean,
    showLoading: Boolean,
    value: String
  ): CancelButtonProps = {
    val __obj = js.Dynamic.literal(cancelButtonTitle = cancelButtonTitle.asInstanceOf[js.Any], clearIcon = clearIcon.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onCancel = js.Any.fromFunction0(onCancel), onChangeText = js.Any.fromFunction0(onChangeText), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), searchIcon = searchIcon.asInstanceOf[js.Any], showCancel = showCancel.asInstanceOf[js.Any], showLoading = showLoading.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelButtonProps] (val x: Self) extends AnyVal {
    
    inline def setCancelButtonTitle(value: String): Self = StObject.set(x, "cancelButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setClearIcon(value: Name): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: () => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnCancel(value: () => Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnChangeText(value: () => Any): Self = StObject.set(x, "onChangeText", js.Any.fromFunction0(value))
    
    inline def setOnClear(value: () => Any): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnFocus(value: () => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setSearchIcon(value: Name): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
    
    inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    inline def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
