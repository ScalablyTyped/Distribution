package typings.reactNativeElements.anon

import typings.reactNative.mod.ModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.BottomSheetProps> */
trait PartialBottomSheetProps extends StObject {
  
  var isVisible: js.UndefOr[Boolean] = js.undefined
  
  var modalProps: js.UndefOr[ModalProps] = js.undefined
}
object PartialBottomSheetProps {
  
  @scala.inline
  def apply(): PartialBottomSheetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBottomSheetProps]
  }
  
  @scala.inline
  implicit class PartialBottomSheetPropsMutableBuilder[Self <: PartialBottomSheetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setModalProps(value: ModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
  }
}
