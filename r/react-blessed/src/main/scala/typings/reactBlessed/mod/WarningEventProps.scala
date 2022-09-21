package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-blessed.react-blessed.EventHandlerProp<'warning', react-blessed.react-blessed.WarningEventHandler> */
trait WarningEventProps extends StObject {
  
  @JSName("on${Capitalize<T>}")
  var on$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket: js.UndefOr[WarningEventHandler] = js.undefined
}
object WarningEventProps {
  
  inline def apply(): WarningEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarningEventProps]
  }
  
  extension [Self <: WarningEventProps](x: Self) {
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket(value: /* args */ SpreadableArgs[WarningEvent, js.Array[WarningEvent] | WarningEvent] => Unit): Self = StObject.set(x, "on${Capitalize<T>}", js.Any.fromFunction1(value))
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketUndefined: Self = StObject.set(x, "on${Capitalize<T>}", js.undefined)
  }
}
