package typings.sharepoint.SP

import typings.sharepoint.SP.JsGrid.ColumnInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttControl extends StObject {
  
  def get_Columns(): js.Array[ColumnInfo]
}
object GanttControl {
  
  inline def apply(get_Columns: () => js.Array[ColumnInfo]): GanttControl = {
    val __obj = js.Dynamic.literal(get_Columns = js.Any.fromFunction0(get_Columns))
    __obj.asInstanceOf[GanttControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GanttControl] (val x: Self) extends AnyVal {
    
    inline def setGet_Columns(value: () => js.Array[ColumnInfo]): Self = StObject.set(x, "get_Columns", js.Any.fromFunction0(value))
  }
}
