package typings.reduxDevtoolsDockMonitor

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools-dock-monitor", JSImport.Default)
  @js.native
  class default ()
    extends Component[IDockMonitorProps, js.Object, js.Any]
  
  type DockMonitor = Component[IDockMonitorProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left
    - typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top
    - typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right
    - typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom
  */
  trait DockPosition extends StObject
  object DockPosition {
    
    @scala.inline
    def bottom: typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom = "bottom".asInstanceOf[typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom]
    
    @scala.inline
    def left: typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left = "left".asInstanceOf[typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left]
    
    @scala.inline
    def right: typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right = "right".asInstanceOf[typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right]
    
    @scala.inline
    def top: typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top = "top".asInstanceOf[typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top]
  }
  
  trait IDockMonitorProps extends StObject {
    
    /**
      * A key or a key combination that switches the currently visible monitor.
      * Must be recognizable by parse-key (for example, 'ctrl-m')
      * Required if you use more than one monitor.
      *
      * @default undefined
      */
    var changeMonitorKey: js.UndefOr[String] = js.undefined
    
    /**
      * A key or a key combination that toggles the dock position.
      * Must be recognizable by parse-key (for example, 'ctrl-w')
      */
    var changePositionKey: String
    
    /**
      * Any valid Redux DevTools monitor.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @default true
      */
    var defaultIsVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Where the dock appears on the screen.
      * Valid values: 'left', 'top', 'right', 'bottom'
      *
      * @default 'right'
      */
    var defaultPosition: js.UndefOr[DockPosition] = js.undefined
    
    /**
      * Size of the dock. When fluid is true, a float (0.5 means half the window size).
      * When fluid is false, a width in pixels
      *
      * @default 0.3 (3/10th of the window size)
      */
    var defaultSize: js.UndefOr[Double] = js.undefined
    
    /**
      * When true, the dock size is a fraction of the window size, fixed otherwise.
      *
      * @default true
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A key or a key combination that toggles the dock visibility.
      * Must be recognizable by parse-key (for example, 'ctrl-h')
      */
    var toggleVisibilityKey: String
  }
  object IDockMonitorProps {
    
    @scala.inline
    def apply(changePositionKey: String, toggleVisibilityKey: String): IDockMonitorProps = {
      val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDockMonitorProps]
    }
    
    @scala.inline
    implicit class IDockMonitorPropsMutableBuilder[Self <: IDockMonitorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeMonitorKey(value: String): Self = StObject.set(x, "changeMonitorKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeMonitorKeyUndefined: Self = StObject.set(x, "changeMonitorKey", js.undefined)
      
      @scala.inline
      def setChangePositionKey(value: String): Self = StObject.set(x, "changePositionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultIsVisible(value: Boolean): Self = StObject.set(x, "defaultIsVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIsVisibleUndefined: Self = StObject.set(x, "defaultIsVisible", js.undefined)
      
      @scala.inline
      def setDefaultPosition(value: DockPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      @scala.inline
      def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setToggleVisibilityKey(value: String): Self = StObject.set(x, "toggleVisibilityKey", value.asInstanceOf[js.Any])
    }
  }
}
