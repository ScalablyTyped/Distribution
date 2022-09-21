package typings.reactBootstrapTypeahead.mod

import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HintProps extends StObject {
  
  /* Hint expects a single child: your input component. */
  var children: ReactNode
  
  var className: js.UndefOr[String] = js.undefined
  
  /* Callback function that determines whether the hint should be selected. */
  var shouldSelect: js.UndefOr[ShouldSelect] = js.undefined
}
object HintProps {
  
  inline def apply(): HintProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintProps]
  }
  
  extension [Self <: HintProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setShouldSelect(value: (/* shouldSelect */ Boolean, /* e */ KeyboardEvent[HTMLInputElement]) => Boolean): Self = StObject.set(x, "shouldSelect", js.Any.fromFunction2(value))
    
    inline def setShouldSelectUndefined: Self = StObject.set(x, "shouldSelect", js.undefined)
  }
}
