package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEditParams
  extends StObject
     with DataTableRowEventParams {
  
  var index: Double
}
object DataTableRowEditParams {
  
  inline def apply(data: Any, index: Double, originalEvent: SyntheticEvent[Element, Event]): DataTableRowEditParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowEditParams] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
