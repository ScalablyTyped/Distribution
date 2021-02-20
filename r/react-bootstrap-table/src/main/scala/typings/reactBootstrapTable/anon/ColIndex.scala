package typings.reactBootstrapTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColIndex extends StObject {
  
  var colIndex: Double = js.native
  
  var rowIndex: Double = js.native
}
object ColIndex {
  
  @scala.inline
  def apply(colIndex: Double, rowIndex: Double): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
  
  @scala.inline
  implicit class ColIndexMutableBuilder[Self <: ColIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
