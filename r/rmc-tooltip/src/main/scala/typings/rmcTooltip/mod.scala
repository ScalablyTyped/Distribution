package typings.rmcTooltip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-tooltip", JSImport.Default)
  @js.native
  class default ()
    extends typings.rmcTooltip.tooltipMod.default
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-tooltip", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-tooltip", "default.defaultProps.arrowContent")
      @js.native
      def arrowContent: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any = js.native
      inline def arrowContent_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrowContent")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip", "default.defaultProps.destroyTooltipOnHide")
      @js.native
      def destroyTooltipOnHide: Boolean = js.native
      inline def destroyTooltipOnHide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyTooltipOnHide")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
  }
}
