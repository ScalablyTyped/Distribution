package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEditSaveParams
  extends StObject
     with DataTableRowEditParams {
  
  var valid: Boolean
}
object DataTableRowEditSaveParams {
  
  inline def apply(data: Any, index: Double, originalEvent: SyntheticEvent[Element, Event], valid: Boolean): DataTableRowEditSaveParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditSaveParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowEditSaveParams] (val x: Self) extends AnyVal {
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
