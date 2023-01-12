package typings.puppeteerCore.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomQueryHandler extends StObject {
  
  /**
    * @returns Some {@link Node}s matching the given `selector` from {@link node}.
    */
  var queryAll: js.UndefOr[js.Function2[/* node */ Node, /* selector */ String, js.Array[Node]]] = js.undefined
  
  /**
    * @returns A {@link Node} matching the given `selector` from {@link node}.
    */
  var queryOne: js.UndefOr[js.Function2[/* node */ Node, /* selector */ String, Node | Null]] = js.undefined
}
object CustomQueryHandler {
  
  inline def apply(): CustomQueryHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomQueryHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomQueryHandler] (val x: Self) extends AnyVal {
    
    inline def setQueryAll(value: (/* node */ Node, /* selector */ String) => js.Array[Node]): Self = StObject.set(x, "queryAll", js.Any.fromFunction2(value))
    
    inline def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
    
    inline def setQueryOne(value: (/* node */ Node, /* selector */ String) => Node | Null): Self = StObject.set(x, "queryOne", js.Any.fromFunction2(value))
    
    inline def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
  }
}
