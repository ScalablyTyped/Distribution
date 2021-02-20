package typings.rcTable

import typings.react.mod.Key
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measureCellMod {
  
  @JSImport("rc-table/lib/Body/MeasureCell", JSImport.Default)
  @js.native
  def default(hasColumnKeyOnColumnResize: MeasureCellProps): Element = js.native
  
  @js.native
  trait MeasureCellProps extends StObject {
    
    var columnKey: Key = js.native
    
    def onColumnResize(key: Key, width: Double): Unit = js.native
  }
  object MeasureCellProps {
    
    @scala.inline
    def apply(columnKey: Key, onColumnResize: (Key, Double) => Unit): MeasureCellProps = {
      val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize))
      __obj.asInstanceOf[MeasureCellProps]
    }
    
    @scala.inline
    implicit class MeasureCellPropsMutableBuilder[Self <: MeasureCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
    }
  }
}
