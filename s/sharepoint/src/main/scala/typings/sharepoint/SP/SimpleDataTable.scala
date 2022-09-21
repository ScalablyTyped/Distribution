package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleDataTable extends StObject {
  
  def get_rows(): js.Array[Any]
}
object SimpleDataTable {
  
  inline def apply(get_rows: () => js.Array[Any]): SimpleDataTable = {
    val __obj = js.Dynamic.literal(get_rows = js.Any.fromFunction0(get_rows))
    __obj.asInstanceOf[SimpleDataTable]
  }
  
  extension [Self <: SimpleDataTable](x: Self) {
    
    inline def setGet_rows(value: () => js.Array[Any]): Self = StObject.set(x, "get_rows", js.Any.fromFunction0(value))
  }
}
