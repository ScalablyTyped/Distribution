package typings.reactDock

import typings.lodash.mod.DebouncedFunc
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactDock.anon.DefaultSize
import typings.reactDock.anon.DimMode
import typings.reactDock.anon.IsResizing
import typings.reactDock.reactDockBooleans.`true`
import typings.reactDock.reactDockStrings.bottom
import typings.reactDock.reactDockStrings.left
import typings.reactDock.reactDockStrings.none
import typings.reactDock.reactDockStrings.opaque
import typings.reactDock.reactDockStrings.right
import typings.reactDock.reactDockStrings.top
import typings.reactDock.reactDockStrings.transparent
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dockMod {
  
  @JSImport("react-dock/lib/types/Dock", JSImport.Default)
  @js.native
  open class default () extends Dock
  /* static members */
  object default {
    
    @JSImport("react-dock/lib/types/Dock", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dock/lib/types/Dock", "default.defaultProps")
    @js.native
    def defaultProps: DimMode = js.native
    inline def defaultProps_=(x: DimMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-dock/lib/types/Dock", "default.propTypes")
    @js.native
    def propTypes: DefaultSize = js.native
    inline def propTypes_=(x: DefaultSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Dock extends Component[Props, State, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDock(nextProps: Props): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDock(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDock(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDock(): Unit = js.native
    
    var debouncedUpdateWindowSizeEnd: DebouncedFunc[js.Function0[Unit]] = js.native
    
    def handleDimClick(): Unit = js.native
    
    def handleMouseDown(): Unit = js.native
    
    def handleMouseMove(e: MouseEvent): Unit = js.native
    def handleMouseMove(e: TouchEvent): Unit = js.native
    
    def handleMouseUp(): Unit = js.native
    
    def handleResize(): Unit = js.native
    
    def handleWrapperLeave(): Unit = js.native
    
    def hideDim(): Unit = js.native
    
    def transitionEnd(): Unit = js.native
    
    def updateSize(props: Props): Unit = js.native
    
    def updateWindowSize(): Unit = js.native
    
    def updateWindowSizeEnd(): Unit = js.native
    
    @JSName("updateWindowSize")
    def updateWindowSize_true(windowResize: `true`): Unit = js.native
  }
  
  trait Props extends StObject {
    
    var children: js.UndefOr[FunctionComponent[IsResizing] | ReactNode] = js.undefined
    
    var defaultSize: Double
    
    var dimMode: none | transparent | opaque
    
    var dimStyle: js.UndefOr[CSSProperties | Null] = js.undefined
    
    var dockHiddenStyle: js.UndefOr[CSSProperties | Null] = js.undefined
    
    var dockStyle: js.UndefOr[CSSProperties | Null] = js.undefined
    
    var duration: Double
    
    var fluid: Boolean
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var onSizeChange: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* isVisible */ Boolean, Unit]] = js.undefined
    
    var position: left | right | top | bottom
    
    var size: js.UndefOr[Double] = js.undefined
    
    var zIndex: Double
  }
  object Props {
    
    inline def apply(
      defaultSize: Double,
      dimMode: none | transparent | opaque,
      duration: Double,
      fluid: Boolean,
      position: left | right | top | bottom,
      zIndex: Double
    ): Props = {
      val __obj = js.Dynamic.literal(defaultSize = defaultSize.asInstanceOf[js.Any], dimMode = dimMode.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fluid = fluid.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: FunctionComponent[IsResizing] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDimMode(value: none | transparent | opaque): Self = StObject.set(x, "dimMode", value.asInstanceOf[js.Any])
      
      inline def setDimStyle(value: CSSProperties): Self = StObject.set(x, "dimStyle", value.asInstanceOf[js.Any])
      
      inline def setDimStyleNull: Self = StObject.set(x, "dimStyle", null)
      
      inline def setDimStyleUndefined: Self = StObject.set(x, "dimStyle", js.undefined)
      
      inline def setDockHiddenStyle(value: CSSProperties): Self = StObject.set(x, "dockHiddenStyle", value.asInstanceOf[js.Any])
      
      inline def setDockHiddenStyleNull: Self = StObject.set(x, "dockHiddenStyle", null)
      
      inline def setDockHiddenStyleUndefined: Self = StObject.set(x, "dockHiddenStyle", js.undefined)
      
      inline def setDockStyle(value: CSSProperties): Self = StObject.set(x, "dockStyle", value.asInstanceOf[js.Any])
      
      inline def setDockStyleNull: Self = StObject.set(x, "dockStyle", null)
      
      inline def setDockStyleUndefined: Self = StObject.set(x, "dockStyle", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setOnSizeChange(value: /* size */ Double => Unit): Self = StObject.set(x, "onSizeChange", js.Any.fromFunction1(value))
      
      inline def setOnSizeChangeUndefined: Self = StObject.set(x, "onSizeChange", js.undefined)
      
      inline def setOnVisibleChange(value: /* isVisible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setPosition(value: left | right | top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var fullHeight: Double
    
    var fullWidth: Double
    
    var isControlled: Boolean
    
    var isDimHidden: Boolean
    
    var isResizing: js.UndefOr[Boolean] = js.undefined
    
    var isTransitionStarted: Boolean
    
    var isWindowResizing: Any
    
    var size: Double
  }
  object State {
    
    inline def apply(
      fullHeight: Double,
      fullWidth: Double,
      isControlled: Boolean,
      isDimHidden: Boolean,
      isTransitionStarted: Boolean,
      isWindowResizing: Any,
      size: Double
    ): State = {
      val __obj = js.Dynamic.literal(fullHeight = fullHeight.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], isControlled = isControlled.asInstanceOf[js.Any], isDimHidden = isDimHidden.asInstanceOf[js.Any], isTransitionStarted = isTransitionStarted.asInstanceOf[js.Any], isWindowResizing = isWindowResizing.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setFullHeight(value: Double): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: Double): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setIsControlled(value: Boolean): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
      
      inline def setIsDimHidden(value: Boolean): Self = StObject.set(x, "isDimHidden", value.asInstanceOf[js.Any])
      
      inline def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
      
      inline def setIsResizingUndefined: Self = StObject.set(x, "isResizing", js.undefined)
      
      inline def setIsTransitionStarted(value: Boolean): Self = StObject.set(x, "isTransitionStarted", value.asInstanceOf[js.Any])
      
      inline def setIsWindowResizing(value: Any): Self = StObject.set(x, "isWindowResizing", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
