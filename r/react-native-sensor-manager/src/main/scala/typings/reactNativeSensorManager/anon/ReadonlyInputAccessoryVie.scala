package typings.reactNativeSensorManager.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.InputAccessoryViewProps> */
trait ReadonlyInputAccessoryVie extends StObject {
  
  val backgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val nativeID: js.UndefOr[String] = js.undefined
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ReadonlyInputAccessoryVie {
  
  inline def apply(): ReadonlyInputAccessoryVie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyInputAccessoryVie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyInputAccessoryVie] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
