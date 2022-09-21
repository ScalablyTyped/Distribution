package typings.reactNativeElements.anon

import typings.reactNative.mod.ActivityIndicatorProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.iconMod.IconNode
import typings.reactNativeElements.reactNativeElementsStrings.android
import typings.reactNativeElements.reactNativeElementsStrings.default
import typings.reactNativeElements.reactNativeElementsStrings.ios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIcon extends StObject {
  
  var clearIcon: js.UndefOr[IconNode] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var loadingProps: js.UndefOr[ActivityIndicatorProps] = js.undefined
  
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var platform: default | ios | android
  
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var searchIcon: js.UndefOr[IconNode] = js.undefined
  
  var showLoading: js.UndefOr[Boolean] = js.undefined
}
object ClearIcon {
  
  inline def apply(platform: default | ios | android): ClearIcon = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearIcon]
  }
  
  extension [Self <: ClearIcon](x: Self) {
    
    inline def setClearIcon(value: IconNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
    
    inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
    
    inline def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setLeftIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftIconContainerStyleNull: Self = StObject.set(x, "leftIconContainerStyle", null)
    
    inline def setLeftIconContainerStyleUndefined: Self = StObject.set(x, "leftIconContainerStyle", js.undefined)
    
    inline def setLoadingProps(value: ActivityIndicatorProps): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setPlatform(value: default | ios | android): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRightIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setRightIconContainerStyleNull: Self = StObject.set(x, "rightIconContainerStyle", null)
    
    inline def setRightIconContainerStyleUndefined: Self = StObject.set(x, "rightIconContainerStyle", js.undefined)
    
    inline def setSearchIcon(value: IconNode): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
    
    inline def setSearchIconUndefined: Self = StObject.set(x, "searchIcon", js.undefined)
    
    inline def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    inline def setShowLoadingUndefined: Self = StObject.set(x, "showLoading", js.undefined)
  }
}
