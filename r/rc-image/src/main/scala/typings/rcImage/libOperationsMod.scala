package typings.rcImage

import org.scalablytyped.runtime.Shortcut
import typings.rcImage.anon.Close
import typings.rcImage.rcImageBooleans.`false`
import typings.rcUtil.esPortalWrapperMod.GetContainer
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOperationsMod extends Shortcut {
  
  @JSImport("rc-image/lib/Operations", JSImport.Default)
  @js.native
  val default: FC[OperationsProps] = js.native
  
  /* Inlined parent std.Pick<rc-image.rc-image/lib/Preview.PreviewProps, 'visible' | 'maskTransitionName' | 'getContainer' | 'prefixCls' | 'rootClassName' | 'icons' | 'countRender' | 'onClose'> */
  trait OperationsProps extends StObject {
    
    var count: Double
    
    var countRender: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, String]] = js.undefined
    
    var current: Double
    
    var getContainer: js.UndefOr[GetContainer | `false`] = js.undefined
    
    var icons: js.UndefOr[Close] = js.undefined
    
    var maskTransitionName: js.UndefOr[String] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    def onFlipX(): Unit
    
    def onFlipY(): Unit
    
    def onRotateLeft(): Unit
    
    def onRotateRight(): Unit
    
    var onSwitchLeft: MouseEventHandler[HTMLDivElement]
    
    var onSwitchRight: MouseEventHandler[HTMLDivElement]
    
    def onZoomIn(): Unit
    
    def onZoomOut(): Unit
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var scale: Double
    
    var showProgress: Boolean
    
    var showSwitch: Boolean
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object OperationsProps {
    
    inline def apply(
      count: Double,
      current: Double,
      onFlipX: () => Unit,
      onFlipY: () => Unit,
      onRotateLeft: () => Unit,
      onRotateRight: () => Unit,
      onSwitchLeft: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
      onSwitchRight: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
      onZoomIn: () => Unit,
      onZoomOut: () => Unit,
      scale: Double,
      showProgress: Boolean,
      showSwitch: Boolean
    ): OperationsProps = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], onFlipX = js.Any.fromFunction0(onFlipX), onFlipY = js.Any.fromFunction0(onFlipY), onRotateLeft = js.Any.fromFunction0(onRotateLeft), onRotateRight = js.Any.fromFunction0(onRotateRight), onSwitchLeft = js.Any.fromFunction1(onSwitchLeft), onSwitchRight = js.Any.fromFunction1(onSwitchRight), onZoomIn = js.Any.fromFunction0(onZoomIn), onZoomOut = js.Any.fromFunction0(onZoomOut), scale = scale.asInstanceOf[js.Any], showProgress = showProgress.asInstanceOf[js.Any], showSwitch = showSwitch.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationsProps] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountRender(value: (/* current */ Double, /* total */ Double) => String): Self = StObject.set(x, "countRender", js.Any.fromFunction2(value))
      
      inline def setCountRenderUndefined: Self = StObject.set(x, "countRender", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGetContainer(value: GetContainer | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setIcons(value: Close): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setOnClose(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnFlipX(value: () => Unit): Self = StObject.set(x, "onFlipX", js.Any.fromFunction0(value))
      
      inline def setOnFlipY(value: () => Unit): Self = StObject.set(x, "onFlipY", js.Any.fromFunction0(value))
      
      inline def setOnRotateLeft(value: () => Unit): Self = StObject.set(x, "onRotateLeft", js.Any.fromFunction0(value))
      
      inline def setOnRotateRight(value: () => Unit): Self = StObject.set(x, "onRotateRight", js.Any.fromFunction0(value))
      
      inline def setOnSwitchLeft(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSwitchLeft", js.Any.fromFunction1(value))
      
      inline def setOnSwitchRight(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSwitchRight", js.Any.fromFunction1(value))
      
      inline def setOnZoomIn(value: () => Unit): Self = StObject.set(x, "onZoomIn", js.Any.fromFunction0(value))
      
      inline def setOnZoomOut(value: () => Unit): Self = StObject.set(x, "onZoomOut", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setShowProgress(value: Boolean): Self = StObject.set(x, "showProgress", value.asInstanceOf[js.Any])
      
      inline def setShowSwitch(value: Boolean): Self = StObject.set(x, "showSwitch", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = FC[OperationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `libOperationsMod.foo` */
  override def _to: FC[OperationsProps] = default
}
