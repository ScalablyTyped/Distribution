package typings.primereact.treeTreeMod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeFilterOptions extends StObject {
  
  var filter: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], Unit]] = js.undefined
  
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object TreeFilterOptions {
  
  inline def apply(): TreeFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeFilterOptions]
  }
  
  extension [Self <: TreeFilterOptions](x: Self) {
    
    inline def setFilter(value: /* event */ js.UndefOr[KeyboardEvent] => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
  }
}
