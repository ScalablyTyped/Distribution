package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightTheme extends StObject {
  
  var lightTheme: Boolean
  
  def onBlur(): Any
  
  def onChangeText(): Any
  
  def onClear(): Any
  
  def onFocus(): Any
  
  var round: Boolean
  
  var showLoading: Boolean
  
  var value: String
}
object LightTheme {
  
  inline def apply(
    lightTheme: Boolean,
    onBlur: () => Any,
    onChangeText: () => Any,
    onClear: () => Any,
    onFocus: () => Any,
    round: Boolean,
    showLoading: Boolean,
    value: String
  ): LightTheme = {
    val __obj = js.Dynamic.literal(lightTheme = lightTheme.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChangeText = js.Any.fromFunction0(onChangeText), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), round = round.asInstanceOf[js.Any], showLoading = showLoading.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightTheme]
  }
  
  extension [Self <: LightTheme](x: Self) {
    
    inline def setLightTheme(value: Boolean): Self = StObject.set(x, "lightTheme", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: () => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnChangeText(value: () => Any): Self = StObject.set(x, "onChangeText", js.Any.fromFunction0(value))
    
    inline def setOnClear(value: () => Any): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnFocus(value: () => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
