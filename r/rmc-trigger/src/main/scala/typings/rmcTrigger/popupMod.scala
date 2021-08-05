package typings.rmcTrigger

import typings.react.mod.Component
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("rmc-trigger/lib/Popup", JSImport.Default)
  @js.native
  class default protected () extends Popup {
    def this(props: js.Any) = this()
  }
  
  trait IPopupProps extends StObject {
    
    var align: js.UndefOr[js.Any] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
    
    var getClassNameFromAlign: js.UndefOr[js.Function] = js.undefined
    
    var getRootDomNode: js.UndefOr[js.Function] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var maskAnimation: js.UndefOr[String] = js.undefined
    
    var maskTransitionName: js.UndefOr[String | js.Object] = js.undefined
    
    var onAlign: js.UndefOr[js.Function] = js.undefined
    
    var onAnimateLeave: js.UndefOr[js.Function] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var transitionName: js.UndefOr[String | js.Object] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object IPopupProps {
    
    inline def apply(): IPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupProps]
    }
    
    extension [Self <: IPopupProps](x: Self) {
      
      inline def setAlign(value: js.Any): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      inline def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      inline def setGetClassNameFromAlign(value: js.Function): Self = StObject.set(x, "getClassNameFromAlign", value.asInstanceOf[js.Any])
      
      inline def setGetClassNameFromAlignUndefined: Self = StObject.set(x, "getClassNameFromAlign", js.undefined)
      
      inline def setGetRootDomNode(value: js.Function): Self = StObject.set(x, "getRootDomNode", value.asInstanceOf[js.Any])
      
      inline def setGetRootDomNodeUndefined: Self = StObject.set(x, "getRootDomNode", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimation(value: String): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      inline def setMaskTransitionName(value: String | js.Object): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnAlign(value: js.Function): Self = StObject.set(x, "onAlign", value.asInstanceOf[js.Any])
      
      inline def setOnAlignUndefined: Self = StObject.set(x, "onAlign", js.undefined)
      
      inline def setOnAnimateLeave(value: js.Function): Self = StObject.set(x, "onAnimateLeave", value.asInstanceOf[js.Any])
      
      inline def setOnAnimateLeaveUndefined: Self = StObject.set(x, "onAnimateLeave", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionName(value: String | js.Object): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
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
