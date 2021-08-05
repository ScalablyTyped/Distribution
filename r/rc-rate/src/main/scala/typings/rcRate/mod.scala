package typings.rcRate

import typings.rcRate.rateMod.RateProps
import typings.rcRate.rateMod.RateState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-rate", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcRate.rateMod.default {
    def this(props: RateProps) = this()
  }
  object default {
    
    @JSImport("rc-rate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-rate", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-rate", "default.defaultProps.allowClear")
      @js.native
      def allowClear: Boolean = js.native
      inline def allowClear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.allowHalf")
      @js.native
      def allowHalf: Boolean = js.native
      inline def allowHalf_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowHalf")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.character")
      @js.native
      def character: String = js.native
      inline def character_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("character")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.count")
      @js.native
      def count: Double = js.native
      inline def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.defaultValue")
      @js.native
      def defaultValue: Double = js.native
      inline def defaultValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.direction")
      @js.native
      def direction: String = js.native
      inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.onHoverChange")
      @js.native
      def onHoverChange: js.Function0[Unit] = js.native
      inline def onHoverChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHoverChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.tabIndex")
      @js.native
      def tabIndex: Double = js.native
      inline def tabIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: RateProps, state: RateState): RateState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RateState]
  }
}
