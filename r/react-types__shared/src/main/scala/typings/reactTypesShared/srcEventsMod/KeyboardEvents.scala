package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardEvents extends StObject {
  
  /** Handler that is called when a key is pressed. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.undefined
  
  /** Handler that is called when a key is released. */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.undefined
}
object KeyboardEvents {
  
  inline def apply(): KeyboardEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardEvents]
  }
  
  extension [Self <: KeyboardEvents](x: Self) {
    
    inline def setOnKeyDown(value: /* e */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: /* e */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
  }
}
