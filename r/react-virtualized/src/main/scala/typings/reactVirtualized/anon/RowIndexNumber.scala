package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowIndexNumber extends StObject {
  
  var rowIndex: Double
}
object RowIndexNumber {
  
  @scala.inline
  def apply(rowIndex: Double): RowIndexNumber = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndexNumber]
  }
  
  @scala.inline
  implicit class RowIndexNumberMutableBuilder[Self <: RowIndexNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
