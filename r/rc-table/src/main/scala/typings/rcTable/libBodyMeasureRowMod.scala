package typings.rcTable

import typings.react.mod.Key
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyMeasureRowMod {
  
  @JSImport("rc-table/lib/Body/MeasureRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: MeasureCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MeasureCellProps extends StObject {
    
    var columnsKey: js.Array[Key]
    
    def onColumnResize(key: Key, width: Double): Unit
    
    var prefixCls: String
  }
  object MeasureCellProps {
    
    inline def apply(columnsKey: js.Array[Key], onColumnResize: (Key, Double) => Unit, prefixCls: String): MeasureCellProps = {
      val __obj = js.Dynamic.literal(columnsKey = columnsKey.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureCellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MeasureCellProps] (val x: Self) extends AnyVal {
      
      inline def setColumnsKey(value: js.Array[Key]): Self = StObject.set(x, "columnsKey", value.asInstanceOf[js.Any])
      
      inline def setColumnsKeyVarargs(value: Key*): Self = StObject.set(x, "columnsKey", js.Array(value*))
      
      inline def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
