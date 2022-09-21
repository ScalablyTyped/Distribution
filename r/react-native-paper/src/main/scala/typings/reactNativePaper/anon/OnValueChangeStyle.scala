package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnValueChangeStyle extends StObject {
  
  var children: ReactNode
  
  def onValueChange(value: String): Unit
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var value: String
}
object OnValueChangeStyle {
  
  inline def apply(onValueChange: String => Unit, value: String): OnValueChangeStyle = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChangeStyle]
  }
  
  extension [Self <: OnValueChangeStyle](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnValueChange(value: String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
