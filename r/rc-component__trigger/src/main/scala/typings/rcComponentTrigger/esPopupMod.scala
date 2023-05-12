package typings.rcComponentTrigger

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentTrigger.esInterfaceMod.AlignType
import typings.rcComponentTrigger.esInterfaceMod.ArrowPos
import typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/Popup", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopupProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait PopupProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var arrow: js.UndefOr[ArrowTypeOuter] = js.undefined
    
    var arrowPos: ArrowPos
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    /** Tell Portal that should keep in screen. e.g. should wait all motion end */
    var keepDom: Boolean
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var maskMotion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var offsetX: Double
    
    var offsetY: Double
    
    var onAlign: VoidFunction
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    def onPrepare(): js.Promise[Unit]
    
    def onVisibleChanged(visible: Boolean): Unit
    
    var open: Boolean
    
    var popup: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var portal: ComponentType[Any]
    
    var prefixCls: String
    
    var ready: Boolean
    
    var stretch: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: HTMLElement
    
    var targetHeight: js.UndefOr[Double] = js.undefined
    
    var targetWidth: js.UndefOr[Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PopupProps {
    
    inline def apply(
      arrowPos: ArrowPos,
      keepDom: Boolean,
      offsetX: Double,
      offsetY: Double,
      onAlign: () => Unit,
      onPrepare: () => js.Promise[Unit],
      onVisibleChanged: Boolean => Unit,
      open: Boolean,
      portal: ComponentType[Any],
      prefixCls: String,
      ready: Boolean,
      target: HTMLElement
    ): PopupProps = {
      val __obj = js.Dynamic.literal(arrowPos = arrowPos.asInstanceOf[js.Any], keepDom = keepDom.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], onAlign = js.Any.fromFunction0(onAlign), onPrepare = js.Any.fromFunction0(onPrepare), onVisibleChanged = js.Any.fromFunction1(onVisibleChanged), open = open.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setArrow(value: ArrowTypeOuter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowPos(value: ArrowPos): Self = StObject.set(x, "arrowPos", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setKeepDom(value: Boolean): Self = StObject.set(x, "keepDom", value.asInstanceOf[js.Any])
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
      
      inline def setMaskMotionUndefined: Self = StObject.set(x, "maskMotion", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOnAlign(value: () => Unit): Self = StObject.set(x, "onAlign", js.Any.fromFunction0(value))
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnPrepare(value: () => js.Promise[Unit]): Self = StObject.set(x, "onPrepare", js.Any.fromFunction0(value))
      
      inline def setOnVisibleChanged(value: Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPopup(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupFunction0(value: () => ReactNode): Self = StObject.set(x, "popup", js.Any.fromFunction0(value))
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setPortal(value: ComponentType[Any]): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
      
      inline def setTargetHeightUndefined: Self = StObject.set(x, "targetHeight", js.undefined)
      
      inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
      
      inline def setTargetWidthUndefined: Self = StObject.set(x, "targetWidth", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopupProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esPopupMod.foo` */
  override def _to: ForwardRefExoticComponent[PopupProps & RefAttributes[HTMLDivElement]] = default
}
