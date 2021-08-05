package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowIndex extends StObject {
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object RowIndex {
  
  inline def apply(): RowIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowIndex]
  }
  
  extension [Self <: RowIndex](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
