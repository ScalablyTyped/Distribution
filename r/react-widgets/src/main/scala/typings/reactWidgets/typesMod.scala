package typings.reactWidgets

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactWidgets.reactWidgetsStrings.clear
import typings.reactWidgets.reactWidgetsStrings.input
import typings.std.Element
import typings.std.Event
import typings.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DataItem = Any
  
  type RenderProp[TArg] = js.Function1[/* arg */ TArg, ReactNode]
  
  trait SearchMetadata extends StObject {
    
    var action: clear | input
    
    var lastSearchTerm: js.UndefOr[String] = js.undefined
    
    var originalEvent: js.UndefOr[SyntheticEvent[Element, Event]] = js.undefined
  }
  object SearchMetadata {
    
    inline def apply(action: clear | input): SearchMetadata = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchMetadata]
    }
    
    extension [Self <: SearchMetadata](x: Self) {
      
      inline def setAction(value: clear | input): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setLastSearchTerm(value: String): Self = StObject.set(x, "lastSearchTerm", value.asInstanceOf[js.Any])
      
      inline def setLastSearchTermUndefined: Self = StObject.set(x, "lastSearchTerm", js.undefined)
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  type Value = Any
  
  @js.native
  trait WidgetHandle extends StObject {
    
    def focus(): Unit = js.native
    def focus(opts: FocusOptions): Unit = js.native
  }
}
