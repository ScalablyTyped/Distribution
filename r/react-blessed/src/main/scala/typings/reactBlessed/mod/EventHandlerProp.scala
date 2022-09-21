package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// create event handlers that map to 'blessed' events. see
// https://github.com/Yomguithereal/react-blessed/blob/f5e1f791dea1788745695d557040b91f573f9ef5/src/fiber/events.js
/* Inlined {[ key in 'on${Capitalize<T>}' ]:? E} */
trait EventHandlerProp[T /* <: String */, E /* <: js.Function1[/* args */ scala.Nothing, Unit] */] extends StObject {
  
  @JSName("on${Capitalize<T>}")
  var on$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket: js.UndefOr[E] = js.undefined
}
object EventHandlerProp {
  
  inline def apply[T /* <: String */, E /* <: js.Function1[/* args */ scala.Nothing, Unit] */](): EventHandlerProp[T, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventHandlerProp[T, E]]
  }
  
  extension [Self <: EventHandlerProp[?, ?], T /* <: String */, E /* <: js.Function1[/* args */ scala.Nothing, Unit] */](x: Self & (EventHandlerProp[T, E])) {
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket(value: E): Self = StObject.set(x, "on${Capitalize<T>}", value.asInstanceOf[js.Any])
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketUndefined: Self = StObject.set(x, "on${Capitalize<T>}", js.undefined)
  }
}
