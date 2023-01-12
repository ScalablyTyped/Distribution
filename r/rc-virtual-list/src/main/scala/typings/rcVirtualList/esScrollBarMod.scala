package typings.rcVirtualList

import typings.rcVirtualList.anon.TypeofsetTimeout
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.ReturnType
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esScrollBarMod {
  
  @JSImport("rc-virtual-list/es/ScrollBar", JSImport.Default)
  @js.native
  open class default () extends ScrollBar
  
  @js.native
  trait ScrollBar extends Component[ScrollBarProps, ScrollBarState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MScrollBar(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MScrollBar(prevProps: ScrollBarProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MScrollBar(): Unit = js.native
    
    def delayHidden(): Unit = js.native
    
    def getEnableHeightRange(): Double = js.native
    
    def getEnableScrollRange(): Double = js.native
    
    def getSpinHeight(): Double = js.native
    
    def getTop(): Double = js.native
    
    var moveRaf: Double = js.native
    
    var onContainerMouseDown: MouseEventHandler[Element] = js.native
    
    def onMouseDown(e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
    def onMouseDown(e: TouchEvent): Unit = js.native
    
    def onMouseMove(e: typings.std.MouseEvent): Unit = js.native
    def onMouseMove(e: TouchEvent): Unit = js.native
    
    def onMouseUp(): Unit = js.native
    
    def onScrollbarTouchStart(e: TouchEvent): Unit = js.native
    
    def patchEvents(): Unit = js.native
    
    def removeEvents(): Unit = js.native
    
    var scrollbarRef: RefObject[HTMLDivElement] = js.native
    
    def showScroll(): Boolean = js.native
    
    var thumbRef: RefObject[HTMLDivElement] = js.native
    
    var visibleTimeout: ReturnType[TypeofsetTimeout] = js.native
  }
  
  trait ScrollBarProps extends StObject {
    
    var count: Double
    
    var height: Double
    
    def onScroll(scrollTop: Double): Unit
    
    def onStartMove(): Unit
    
    def onStopMove(): Unit
    
    var prefixCls: String
    
    var scrollHeight: Double
    
    var scrollTop: Double
  }
  object ScrollBarProps {
    
    inline def apply(
      count: Double,
      height: Double,
      onScroll: Double => Unit,
      onStartMove: () => Unit,
      onStopMove: () => Unit,
      prefixCls: String,
      scrollHeight: Double,
      scrollTop: Double
    ): ScrollBarProps = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), onStartMove = js.Any.fromFunction0(onStartMove), onStopMove = js.Any.fromFunction0(onStopMove), prefixCls = prefixCls.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollBarProps] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: Double => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnStartMove(value: () => Unit): Self = StObject.set(x, "onStartMove", js.Any.fromFunction0(value))
      
      inline def setOnStopMove(value: () => Unit): Self = StObject.set(x, "onStopMove", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollBarState extends StObject {
    
    var dragging: Boolean
    
    var pageY: Double
    
    var startTop: Double
    
    var visible: Boolean
  }
  object ScrollBarState {
    
    inline def apply(dragging: Boolean, pageY: Double, startTop: Double, visible: Boolean): ScrollBarState = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], startTop = startTop.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBarState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollBarState] (val x: Self) extends AnyVal {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setStartTop(value: Double): Self = StObject.set(x, "startTop", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
