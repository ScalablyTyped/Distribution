package typings.rmcAlign

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-align", JSImport.Default)
  @js.native
  class default ()
    extends typings.rmcAlign.alignMod.default
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-align", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-align", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-align", "default.defaultProps.monitorBufferTime")
      @js.native
      def monitorBufferTime: Double = js.native
      inline def monitorBufferTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monitorBufferTime")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-align", "default.defaultProps.monitorWindowResize")
      @js.native
      def monitorWindowResize: Boolean = js.native
      inline def monitorWindowResize_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monitorWindowResize")(x.asInstanceOf[js.Any])
      
      inline def onAlign(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAlign")().asInstanceOf[Unit]
      
      inline def target(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("target")().asInstanceOf[Window]
    }
  }
}
