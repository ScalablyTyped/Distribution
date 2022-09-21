package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-blessed.react-blessed.EventHandlerProp<react-blessed.react-blessed.ScreenEventNames, react-blessed.react-blessed.ScreenEventHandler> */
trait ScreenEventProps extends StObject {
  
  @JSName("on${Capitalize<T>}")
  var on$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket: js.UndefOr[ScreenEventHandler] = js.undefined
}
object ScreenEventProps {
  
  inline def apply(): ScreenEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenEventProps]
  }
  
  extension [Self <: ScreenEventProps](x: Self) {
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket(value: /* args */ SpreadableArgs[ScreenEvent, js.Array[ScreenEvent] | ScreenEvent] => Unit): Self = StObject.set(x, "on${Capitalize<T>}", js.Any.fromFunction1(value))
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketUndefined: Self = StObject.set(x, "on${Capitalize<T>}", js.undefined)
  }
}
