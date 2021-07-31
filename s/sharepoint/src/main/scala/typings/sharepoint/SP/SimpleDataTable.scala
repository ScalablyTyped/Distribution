package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleDataTable extends StObject {
  
  def get_rows(): js.Array[js.Any]
}
object SimpleDataTable {
  
  @scala.inline
  def apply(get_rows: () => js.Array[js.Any]): SimpleDataTable = {
    val __obj = js.Dynamic.literal(get_rows = js.Any.fromFunction0(get_rows))
    __obj.asInstanceOf[SimpleDataTable]
  }
  
  @scala.inline
  implicit class SimpleDataTableMutableBuilder[Self <: SimpleDataTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_rows(value: () => js.Array[js.Any]): Self = StObject.set(x, "get_rows", js.Any.fromFunction0(value))
  }
}
