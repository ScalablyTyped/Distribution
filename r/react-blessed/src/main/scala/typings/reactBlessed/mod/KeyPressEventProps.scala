package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-blessed.react-blessed.EventHandlerProp<'keypress', react-blessed.react-blessed.KeyPressEventHandler> */
trait KeyPressEventProps extends StObject {
  
  @JSName("on${Capitalize<T>}")
  var on$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket: js.UndefOr[KeyPressEventHandler] = js.undefined
}
object KeyPressEventProps {
  
  inline def apply(): KeyPressEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPressEventProps]
  }
  
  extension [Self <: KeyPressEventProps](x: Self) {
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket(value: /* args */ SpreadableArgs[KeyPressEvent, js.Array[KeyPressEvent] | KeyPressEvent] => Unit): Self = StObject.set(x, "on${Capitalize<T>}", js.Any.fromFunction1(value))
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketUndefined: Self = StObject.set(x, "on${Capitalize<T>}", js.undefined)
  }
}
