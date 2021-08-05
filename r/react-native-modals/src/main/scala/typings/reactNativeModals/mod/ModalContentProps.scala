package typings.reactNativeModals.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalContentProps extends StObject {
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ModalContentProps {
  
  inline def apply(): ModalContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalContentProps]
  }
  
  extension [Self <: ModalContentProps](x: Self) {
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
