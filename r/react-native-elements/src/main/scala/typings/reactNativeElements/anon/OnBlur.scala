package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  def onBlur(): Any
  
  def onCancel(): Any
  
  def onChangeText(): Any
  
  def onClear(): Any
  
  def onFocus(): Any
}
object OnBlur {
  
  inline def apply(
    onBlur: () => Any,
    onCancel: () => Any,
    onChangeText: () => Any,
    onClear: () => Any,
    onFocus: () => Any
  ): OnBlur = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onCancel = js.Any.fromFunction0(onCancel), onChangeText = js.Any.fromFunction0(onChangeText), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus))
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setOnBlur(value: () => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnCancel(value: () => Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnChangeText(value: () => Any): Self = StObject.set(x, "onChangeText", js.Any.fromFunction0(value))
    
    inline def setOnClear(value: () => Any): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnFocus(value: () => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
  }
}
