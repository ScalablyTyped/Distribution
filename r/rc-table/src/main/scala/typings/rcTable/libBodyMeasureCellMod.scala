package typings.rcTable

import typings.react.mod.Key
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyMeasureCellMod {
  
  @JSImport("rc-table/lib/Body/MeasureCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: MeasureCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MeasureCellProps extends StObject {
    
    var columnKey: Key
    
    def onColumnResize(key: Key, width: Double): Unit
  }
  object MeasureCellProps {
    
    inline def apply(columnKey: Key, onColumnResize: (Key, Double) => Unit): MeasureCellProps = {
      val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize))
      __obj.asInstanceOf[MeasureCellProps]
    }
    
    extension [Self <: MeasureCellProps](x: Self) {
      
      inline def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
    }
  }
}
