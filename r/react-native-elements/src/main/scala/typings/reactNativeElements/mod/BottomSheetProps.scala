package typings.reactNativeElements.mod

import typings.reactNative.mod.ModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomSheetProps extends StObject {
  
  /**
    * To show or hide the Bottom Sheet Component
    * @default false
    */
  var isVisible: Boolean
  
  /**
    * props of react native modal https://reactnative.dev/docs/modal#props
    * @default {}
    */
  var modalProps: ModalProps
}
object BottomSheetProps {
  
  inline def apply(isVisible: Boolean, modalProps: ModalProps): BottomSheetProps = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], modalProps = modalProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomSheetProps]
  }
  
  extension [Self <: BottomSheetProps](x: Self) {
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setModalProps(value: ModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
  }
}
