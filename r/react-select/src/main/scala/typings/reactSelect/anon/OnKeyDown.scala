package typings.reactSelect.anon

import typings.react.mod.KeyboardEvent
import typings.reactSelect.typesMod.KeyboardEventHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyDown extends StObject {
  
  var onKeyDown: KeyboardEventHandler
}
object OnKeyDown {
  
  inline def apply(onKeyDown: /* event */ KeyboardEvent[HTMLElement] => Unit): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[OnKeyDown]
  }
  
  extension [Self <: OnKeyDown](x: Self) {
    
    inline def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
  }
}
