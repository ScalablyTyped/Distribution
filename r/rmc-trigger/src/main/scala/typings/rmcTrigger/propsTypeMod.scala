package typings.rmcTrigger

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsTypeMod {
  
  trait ITriggerProps extends StObject {
    
    var afterPopupVisibleChange: js.UndefOr[js.Function] = js.undefined
    
    var builtinPlacements: js.UndefOr[js.Any] = js.undefined
    
    var defaultPopupVisible: js.UndefOr[Boolean] = js.undefined
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
    
    var getDocument: js.UndefOr[js.Function] = js.undefined
    
    var getPopupClassNameFromAlign: js.UndefOr[js.Any] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var maskAnimation: js.UndefOr[String] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var maskTransitionName: js.UndefOr[String | js.Object] = js.undefined
    
    var onPopupAlign: js.UndefOr[js.Function] = js.undefined
    
    var onPopupVisibleChange: js.UndefOr[js.Function] = js.undefined
    
    var popup: ReactNode | js.Function
    
    var popupAlign: js.UndefOr[js.Any] = js.undefined
    
    var popupAnimation: js.UndefOr[js.Any] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupPlacement: js.UndefOr[String] = js.undefined
    
    var popupStyle: js.UndefOr[js.Any] = js.undefined
    
    var popupTransitionName: js.UndefOr[String | js.Object] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ITriggerProps {
    
    inline def apply(): ITriggerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITriggerProps]
    }
    
    extension [Self <: ITriggerProps](x: Self) {
      
      inline def setAfterPopupVisibleChange(value: js.Function): Self = StObject.set(x, "afterPopupVisibleChange", value.asInstanceOf[js.Any])
      
      inline def setAfterPopupVisibleChangeUndefined: Self = StObject.set(x, "afterPopupVisibleChange", js.undefined)
      
      inline def setBuiltinPlacements(value: js.Any): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setDefaultPopupVisible(value: Boolean): Self = StObject.set(x, "defaultPopupVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultPopupVisibleUndefined: Self = StObject.set(x, "defaultPopupVisible", js.undefined)
      
      inline def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      inline def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      inline def setGetDocument(value: js.Function): Self = StObject.set(x, "getDocument", value.asInstanceOf[js.Any])
      
      inline def setGetDocumentUndefined: Self = StObject.set(x, "getDocument", js.undefined)
      
      inline def setGetPopupClassNameFromAlign(value: js.Any): Self = StObject.set(x, "getPopupClassNameFromAlign", value.asInstanceOf[js.Any])
      
      inline def setGetPopupClassNameFromAlignUndefined: Self = StObject.set(x, "getPopupClassNameFromAlign", js.undefined)
      
      inline def setGetPopupContainer(value: js.Function): Self = StObject.set(x, "getPopupContainer", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimation(value: String): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskTransitionName(value: String | js.Object): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnPopupAlign(value: js.Function): Self = StObject.set(x, "onPopupAlign", value.asInstanceOf[js.Any])
      
      inline def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      inline def setOnPopupVisibleChange(value: js.Function): Self = StObject.set(x, "onPopupVisibleChange", value.asInstanceOf[js.Any])
      
      inline def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      inline def setPopup(value: ReactNode | js.Function): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupAlign(value: js.Any): Self = StObject.set(x, "popupAlign", value.asInstanceOf[js.Any])
      
      inline def setPopupAlignUndefined: Self = StObject.set(x, "popupAlign", js.undefined)
      
      inline def setPopupAnimation(value: js.Any): Self = StObject.set(x, "popupAnimation", value.asInstanceOf[js.Any])
      
      inline def setPopupAnimationUndefined: Self = StObject.set(x, "popupAnimation", js.undefined)
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupPlacement(value: String): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      inline def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      inline def setPopupStyle(value: js.Any): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      inline def setPopupTransitionName(value: String | js.Object): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      inline def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
