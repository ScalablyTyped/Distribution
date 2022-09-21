package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-blessed.react-blessed.EventHandlerProp<react-blessed.react-blessed.ProgressBarEventNames, react-blessed.react-blessed.ProgressBarEventHandler> */
trait ProgressBarEventProps extends StObject {
  
  @JSName("on${Capitalize<T>}")
  var on$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket: js.UndefOr[ProgressBarEventHandler] = js.undefined
}
object ProgressBarEventProps {
  
  inline def apply(): ProgressBarEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarEventProps]
  }
  
  extension [Self <: ProgressBarEventProps](x: Self) {
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket(
      value: /* args */ SpreadableArgs[ProgressBarEvent, js.Array[ProgressBarEvent] | ProgressBarEvent] => Unit
    ): Self = StObject.set(x, "on${Capitalize<T>}", js.Any.fromFunction1(value))
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketUndefined: Self = StObject.set(x, "on${Capitalize<T>}", js.undefined)
  }
}
