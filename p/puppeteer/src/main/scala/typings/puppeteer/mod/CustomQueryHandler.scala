package typings.puppeteer.mod

import typings.std.Document
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomQueryHandler extends StObject {
  
  var queryAll: js.UndefOr[
    js.Function2[
      /* element */ Element | Document, 
      /* selector */ String, 
      js.Array[Element] | NodeListOf[Element]
    ]
  ] = js.undefined
  
  var queryOne: js.UndefOr[
    js.Function2[/* element */ Element | Document, /* selector */ String, Element | Null]
  ] = js.undefined
}
object CustomQueryHandler {
  
  inline def apply(): CustomQueryHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomQueryHandler]
  }
  
  extension [Self <: CustomQueryHandler](x: Self) {
    
    inline def setQueryAll(
      value: (/* element */ Element | Document, /* selector */ String) => js.Array[Element] | NodeListOf[Element]
    ): Self = StObject.set(x, "queryAll", js.Any.fromFunction2(value))
    
    inline def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
    
    inline def setQueryOne(value: (/* element */ Element | Document, /* selector */ String) => Element | Null): Self = StObject.set(x, "queryOne", js.Any.fromFunction2(value))
    
    inline def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
  }
}
