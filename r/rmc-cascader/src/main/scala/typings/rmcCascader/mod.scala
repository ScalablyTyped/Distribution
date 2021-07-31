package typings.rmcCascader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-cascader", JSImport.Default)
  @js.native
  class default ()
    extends typings.rmcCascader.cascaderMod.default
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-cascader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-cascader", "default.defaultProps.cols")
      @js.native
      def cols: Double = js.native
      @scala.inline
      def cols_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cols")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader", "default.defaultProps.data")
      @js.native
      def data: js.Array[scala.Nothing] = js.native
      @scala.inline
      def data_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader", "default.defaultProps.pickerPrefixCls")
      @js.native
      def pickerPrefixCls: String = js.native
      @scala.inline
      def pickerPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
  }
}
