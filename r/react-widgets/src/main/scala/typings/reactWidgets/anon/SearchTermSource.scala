package typings.reactWidgets.anon

import typings.react.mod.SyntheticEvent
import typings.reactWidgets.esmTypesMod.Value
import typings.reactWidgets.reactWidgetsStrings.input
import typings.reactWidgets.reactWidgetsStrings.listbox
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTermSource extends StObject {
  
  var lastValue: Value
  
  var originalEvent: js.UndefOr[SyntheticEvent[Element, Event]] = js.undefined
  
  var searchTerm: js.UndefOr[String] = js.undefined
  
  var source: listbox | input
}
object SearchTermSource {
  
  inline def apply(lastValue: Value, source: listbox | input): SearchTermSource = {
    val __obj = js.Dynamic.literal(lastValue = lastValue.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTermSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchTermSource] (val x: Self) extends AnyVal {
    
    inline def setLastValue(value: Value): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    inline def setSource(value: listbox | input): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
