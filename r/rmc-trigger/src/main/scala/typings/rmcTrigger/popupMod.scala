package typings.rmcTrigger

import typings.react.mod.Component
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("rmc-trigger/lib/Popup", JSImport.Default)
  @js.native
  class default protected () extends Popup {
    def this(props: js.Any) = this()
  }
  
  @js.native
  trait IPopupProps extends StObject {
    
    var align: js.UndefOr[js.Any] = js.native
    
    var animation: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
    
    var getClassNameFromAlign: js.UndefOr[js.Function] = js.native
    
    var getRootDomNode: js.UndefOr[js.Function] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskAnimation: js.UndefOr[String] = js.native
    
    var maskTransitionName: js.UndefOr[String | js.Object] = js.native
    
    var onAlign: js.UndefOr[js.Function] = js.native
    
    var onAnimateLeave: js.UndefOr[js.Function] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var transitionName: js.UndefOr[String | js.Object] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object IPopupProps {
    
    @scala.inline
    def apply(): IPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupProps]
    }
    
    @scala.inline
    implicit class IPopupPropsMutableBuilder[Self <: IPopupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: js.Any): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      @scala.inline
      def setGetClassNameFromAlign(value: js.Function): Self = StObject.set(x, "getClassNameFromAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetClassNameFromAlignUndefined: Self = StObject.set(x, "getClassNameFromAlign", js.undefined)
      
      @scala.inline
      def setGetRootDomNode(value: js.Function): Self = StObject.set(x, "getRootDomNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRootDomNodeUndefined: Self = StObject.set(x, "getRootDomNode", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimation(value: String): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String | js.Object): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOnAlign(value: js.Function): Self = StObject.set(x, "onAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAlignUndefined: Self = StObject.set(x, "onAlign", js.undefined)
      
      @scala.inline
      def setOnAnimateLeave(value: js.Function): Self = StObject.set(x, "onAnimateLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimateLeaveUndefined: Self = StObject.set(x, "onAnimateLeave", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String | js.Object): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait Popup
    extends Component[IPopupProps, js.Any, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MPopup(): Unit = js.native
    
    var currentAlignClassName: String | Null = js.native
    
    def getClassName(currentAlignClassName: js.Any): String = js.native
    
    def getMaskElement(): js.Any = js.native
    
    def getMaskTransitionName(): js.UndefOr[String | js.Object] = js.native
    
    def getPopupDomNode(): Element = js.native
    
    def getPopupElement(): typings.react.mod.global.JSX.Element = js.native
    
    def getTarget(): js.Any = js.native
    
    def getTransitionName(): js.UndefOr[String | js.Object] = js.native
    
    def getZIndexStyle(): js.Any = js.native
    
    def onAlign(popupDomNode: js.Any, align: js.Any): Unit = js.native
    
    var popupInstance: js.Any = js.native
    
    var rootNode: js.Any = js.native
    
    var saveAlignRef: js.Any = js.native
    
    var savePopupRef: js.Any = js.native
  }
}
