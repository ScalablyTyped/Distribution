package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-blessed.react-blessed.EventHandlerProp<react-blessed.react-blessed.GenericEventNames, react-blessed.react-blessed.GenericEventHandler> */
trait GenericEventProps extends StObject {
  
  @JSName("on${Capitalize<T>}")
  var on$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket: js.UndefOr[GenericEventHandler] = js.undefined
}
object GenericEventProps {
  
  inline def apply(): GenericEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericEventProps]
  }
  
  extension [Self <: GenericEventProps](x: Self) {
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket(value: /* args */ SpreadableArgs[GenericEvent, js.Array[GenericEvent] | GenericEvent] => Unit): Self = StObject.set(x, "on${Capitalize<T>}", js.Any.fromFunction1(value))
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketUndefined: Self = StObject.set(x, "on${Capitalize<T>}", js.undefined)
  }
}
