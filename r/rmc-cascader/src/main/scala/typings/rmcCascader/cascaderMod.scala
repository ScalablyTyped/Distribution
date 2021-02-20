package typings.rmcCascader

import typings.react.mod.Component
import typings.rmcCascader.anon.Value
import typings.rmcCascader.cascaderTypesMod.ICascaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderMod {
  
  @JSImport("rmc-cascader/lib/Cascader", JSImport.Default)
  @js.native
  class default () extends Cascader
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-cascader/lib/Cascader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-cascader/lib/Cascader", "default.defaultProps.cols")
      @js.native
      def cols: Double = js.native
      @scala.inline
      def cols_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cols")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader/lib/Cascader", "default.defaultProps.data")
      @js.native
      def data: js.Array[scala.Nothing] = js.native
      @scala.inline
      def data_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader/lib/Cascader", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader/lib/Cascader", "default.defaultProps.pickerPrefixCls")
      @js.native
      def pickerPrefixCls: String = js.native
      @scala.inline
      def pickerPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader/lib/Cascader", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cascader
    extends Component[ICascaderProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCascader(nextProps: js.Any): Unit = js.native
    
    def getCols(): js.Any = js.native
    
    def getValue(d: js.Any, `val`: js.Any): js.Any = js.native
    
    def onValueChange(value: js.Any, index: js.Any): Unit = js.native
    
    @JSName("state")
    var state_Cascader: Value = js.native
  }
}
