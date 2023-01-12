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

trait ActionDataItem[TDataItem] extends StObject {
  
  var action: js.UndefOr[insert | remove] = js.undefined
  
  var dataItem: js.UndefOr[TDataItem] = js.undefined
  
  var lastValue: Value
  
  var originalEvent: js.UndefOr[SyntheticEvent[Element, Event]] = js.undefined
}
object ActionDataItem {
  
  inline def apply[TDataItem](lastValue: Value): ActionDataItem[TDataItem] = {
    val __obj = js.Dynamic.literal(lastValue = lastValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDataItem[TDataItem]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionDataItem[?], TDataItem] (val x: Self & ActionDataItem[TDataItem]) extends AnyVal {
    
    inline def setAction(value: insert | remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDataItem(value: TDataItem): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    inline def setLastValue(value: Value): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
