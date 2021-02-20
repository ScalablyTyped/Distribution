package typings.rcTrigger

import org.scalablytyped.runtime.Shortcut
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.Point
import typings.rcTrigger.interfaceMod.StretchType
import typings.rcTrigger.interfaceMod.TransitionNameType
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupInnerMod extends Shortcut {
  
  @JSImport("rc-trigger/es/Popup/PopupInner", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopupInnerProps with RefAttributes[PopupInnerRef]] = js.native
  
  @js.native
  trait PopupInnerProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var animation: AnimationType = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
    
    var getClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.native
    
    var getRootDomNode: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var motion: CSSMotionProps = js.native
    
    var onAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var point: js.UndefOr[Point] = js.native
    
    var prefixCls: String = js.native
    
    var stretch: js.UndefOr[StretchType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionName: TransitionNameType = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object PopupInnerProps {
    
    @scala.inline
    def apply(
      animation: AnimationType,
      motion: CSSMotionProps,
      prefixCls: String,
      transitionName: TransitionNameType
    ): PopupInnerProps = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupInnerProps]
    }
    
    @scala.inline
    implicit class PopupInnerPropsMutableBuilder[Self <: PopupInnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      @scala.inline
      def setGetClassNameFromAlign(value: /* align */ AlignType => String): Self = StObject.set(x, "getClassNameFromAlign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetClassNameFromAlignUndefined: Self = StObject.set(x, "getClassNameFromAlign", js.undefined)
      
      @scala.inline
      def setGetRootDomNode(value: () => HTMLElement): Self = StObject.set(x, "getRootDomNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootDomNodeUndefined: Self = StObject.set(x, "getRootDomNode", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onAlign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAlignUndefined: Self = StObject.set(x, "onAlign", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretch(value: StretchType): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: TransitionNameType): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
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
  trait PopupInnerRef extends StObject {
    
    def forceAlign(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
  }
  object PopupInnerRef {
    
    @scala.inline
    def apply(forceAlign: () => Unit, getElement: () => HTMLElement): PopupInnerRef = {
      val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign), getElement = js.Any.fromFunction0(getElement))
      __obj.asInstanceOf[PopupInnerRef]
    }
    
    @scala.inline
    implicit class PopupInnerRefMutableBuilder[Self <: PopupInnerRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceAlign(value: () => Unit): Self = StObject.set(x, "forceAlign", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[PopupInnerProps with RefAttributes[PopupInnerRef]]
  
  /* This means you don't have to write `default`, but can instead just say `popupInnerMod.foo` */
  override def _to: ForwardRefExoticComponent[PopupInnerProps with RefAttributes[PopupInnerRef]] = default
}
