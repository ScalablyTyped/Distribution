package typings.rcTable

import typings.rcTable.libInterfaceMod.ColumnType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColGroupMod {
  
  @JSImport("rc-table/lib/ColGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](param0: ColGroupProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ColGroupProps[RecordType] extends StObject {
    
    var colWidths: js.Array[Double | String]
    
    var columCount: js.UndefOr[Double] = js.undefined
    
    var columns: js.UndefOr[js.Array[ColumnType[RecordType]]] = js.undefined
  }
  object ColGroupProps {
    
    inline def apply[RecordType](colWidths: js.Array[Double | String]): ColGroupProps[RecordType] = {
      val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColGroupProps[RecordType]]
    }
    
    extension [Self <: ColGroupProps[?], RecordType](x: Self & ColGroupProps[RecordType]) {
      
      inline def setColWidths(value: js.Array[Double | String]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsVarargs(value: (Double | String)*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setColumCount(value: Double): Self = StObject.set(x, "columCount", value.asInstanceOf[js.Any])
      
      inline def setColumCountUndefined: Self = StObject.set(x, "columCount", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "columns", js.Array(value*))
    }
  }
}
