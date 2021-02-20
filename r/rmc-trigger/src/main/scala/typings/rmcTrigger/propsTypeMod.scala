package typings.rmcTrigger

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsTypeMod {
  
  @js.native
  trait ITriggerProps extends StObject {
    
    var afterPopupVisibleChange: js.UndefOr[js.Function] = js.native
    
    var builtinPlacements: js.UndefOr[js.Any] = js.native
    
    var defaultPopupVisible: js.UndefOr[Boolean] = js.native
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
    
    var getDocument: js.UndefOr[js.Function] = js.native
    
    var getPopupClassNameFromAlign: js.UndefOr[js.Any] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskAnimation: js.UndefOr[String] = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    var maskTransitionName: js.UndefOr[String | js.Object] = js.native
    
    var onPopupAlign: js.UndefOr[js.Function] = js.native
    
    var onPopupVisibleChange: js.UndefOr[js.Function] = js.native
    
    var popup: ReactNode | js.Function = js.native
    
    var popupAlign: js.UndefOr[js.Any] = js.native
    
    var popupAnimation: js.UndefOr[js.Any] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var popupPlacement: js.UndefOr[String] = js.native
    
    var popupStyle: js.UndefOr[js.Any] = js.native
    
    var popupTransitionName: js.UndefOr[String | js.Object] = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ITriggerProps {
    
    @scala.inline
    def apply(): ITriggerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITriggerProps]
    }
    
    @scala.inline
    implicit class ITriggerPropsMutableBuilder[Self <: ITriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterPopupVisibleChange(value: js.Function): Self = StObject.set(x, "afterPopupVisibleChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterPopupVisibleChangeUndefined: Self = StObject.set(x, "afterPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setBuiltinPlacements(value: js.Any): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setDefaultPopupVisible(value: Boolean): Self = StObject.set(x, "defaultPopupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPopupVisibleUndefined: Self = StObject.set(x, "defaultPopupVisible", js.undefined)
      
      @scala.inline
      def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      @scala.inline
      def setGetDocument(value: js.Function): Self = StObject.set(x, "getDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDocumentUndefined: Self = StObject.set(x, "getDocument", js.undefined)
      
      @scala.inline
      def setGetPopupClassNameFromAlign(value: js.Any): Self = StObject.set(x, "getPopupClassNameFromAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupClassNameFromAlignUndefined: Self = StObject.set(x, "getPopupClassNameFromAlign", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: js.Function): Self = StObject.set(x, "getPopupContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimation(value: String): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String | js.Object): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOnPopupAlign(value: js.Function): Self = StObject.set(x, "onPopupAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      @scala.inline
      def setOnPopupVisibleChange(value: js.Function): Self = StObject.set(x, "onPopupVisibleChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setPopup(value: ReactNode | js.Function): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupAlign(value: js.Any): Self = StObject.set(x, "popupAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupAlignUndefined: Self = StObject.set(x, "popupAlign", js.undefined)
      
      @scala.inline
      def setPopupAnimation(value: js.Any): Self = StObject.set(x, "popupAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupAnimationUndefined: Self = StObject.set(x, "popupAnimation", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupPlacement(value: String): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: js.Any): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPopupTransitionName(value: String | js.Object): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
