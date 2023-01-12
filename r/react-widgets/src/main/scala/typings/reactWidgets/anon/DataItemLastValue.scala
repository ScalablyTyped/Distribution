package typings.reactWidgets.anon

import typings.react.mod.SyntheticEvent
import typings.reactWidgets.esmTypesMod.Value
import typings.reactWidgets.reactWidgetsStrings.insert
import typings.reactWidgets.reactWidgetsStrings.remove
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataItemLastValue[TDataItem] extends StObject {
  
  var action: insert | remove
  
  var dataItem: TDataItem
  
  var lastValue: Value
  
  var originalEvent: js.UndefOr[SyntheticEvent[Element, Event]] = js.undefined
}
object DataItemLastValue {
  
  inline def apply[TDataItem](action: insert | remove, dataItem: TDataItem, lastValue: Value): DataItemLastValue[TDataItem] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any], lastValue = lastValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItemLastValue[TDataItem]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataItemLastValue[?], TDataItem] (val x: Self & DataItemLastValue[TDataItem]) extends AnyVal {
    
    inline def setAction(value: insert | remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDataItem(value: TDataItem): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setLastValue(value: Value): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
