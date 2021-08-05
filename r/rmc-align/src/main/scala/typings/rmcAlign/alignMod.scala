package typings.rmcAlign

import typings.react.mod.Component
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignMod {
  
  @JSImport("rmc-align/lib/Align", JSImport.Default)
  @js.native
  class default () extends Align
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-align/lib/Align", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-align/lib/Align", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-align/lib/Align", "default.defaultProps.monitorBufferTime")
      @js.native
      def monitorBufferTime: Double = js.native
      inline def monitorBufferTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monitorBufferTime")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-align/lib/Align", "default.defaultProps.monitorWindowResize")
      @js.native
      def monitorWindowResize: Boolean = js.native
      inline def monitorWindowResize_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monitorWindowResize")(x.asInstanceOf[js.Any])
      
      inline def onAlign(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAlign")().asInstanceOf[Unit]
      
      inline def target(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("target")().asInstanceOf[Window]
    }
  }
  
  @js.native
  trait Align
    extends Component[IAlignProps, js.Any, js.Any] {
    
    var bufferMonitor: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAlign(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAlign(prevProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAlign(): Unit = js.native
    
    def forceAlign(): Unit = js.native
    
    var resizeHandler: js.Any = js.native
    
    def startMonitorWindowResize(): Unit = js.native
    
    def stopMonitorWindowResize(): Unit = js.native
  }
  
  trait IAlignProps extends StObject {
    
    var childrenProps: js.UndefOr[js.Object] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var monitorBufferTime: js.UndefOr[Double] = js.undefined
    
    var monitorWindowResize: js.UndefOr[Boolean] = js.undefined
    
    var onAlign: js.UndefOr[js.Function2[/* source */ js.Any, /* align */ js.Any, Unit]] = js.undefined
    
    def target(): Unit
  }
  object IAlignProps {
    
    inline def apply(target: () => Unit): IAlignProps = {
      val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
      __obj.asInstanceOf[IAlignProps]
    }
    
    extension [Self <: IAlignProps](x: Self) {
      
      inline def setChildrenProps(value: js.Object): Self = StObject.set(x, "childrenProps", value.asInstanceOf[js.Any])
      
      inline def setChildrenPropsUndefined: Self = StObject.set(x, "childrenProps", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMonitorBufferTime(value: Double): Self = StObject.set(x, "monitorBufferTime", value.asInstanceOf[js.Any])
      
      inline def setMonitorBufferTimeUndefined: Self = StObject.set(x, "monitorBufferTime", js.undefined)
      
      inline def setMonitorWindowResize(value: Boolean): Self = StObject.set(x, "monitorWindowResize", value.asInstanceOf[js.Any])
      
      inline def setMonitorWindowResizeUndefined: Self = StObject.set(x, "monitorWindowResize", js.undefined)
      
      inline def setOnAlign(value: (/* source */ js.Any, /* align */ js.Any) => Unit): Self = StObject.set(x, "onAlign", js.Any.fromFunction2(value))
      
      inline def setOnAlignUndefined: Self = StObject.set(x, "onAlign", js.undefined)
      
      inline def setTarget(value: () => Unit): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
    }
  }
}
