package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-blessed.react-blessed.EventHandlerProp<blessed.blessed.Widgets.NodeMouseEventType, react-blessed.react-blessed.MouseEventHandler> */
trait MouseEventProps extends StObject {
  
  @JSName("on${Capitalize<T>}")
  var on$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket: js.UndefOr[MouseEventHandler] = js.undefined
}
object MouseEventProps {
  
  inline def apply(): MouseEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseEventProps]
  }
  
  extension [Self <: MouseEventProps](x: Self) {
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracket(value: /* args */ SpreadableArgs[MouseEvent, js.Array[MouseEvent] | MouseEvent] => Unit): Self = StObject.set(x, "on${Capitalize<T>}", js.Any.fromFunction1(value))
    
    inline def setOn$LeftcurlybracketCapitalizeLessthansignTGreaterthansignRightcurlybracketUndefined: Self = StObject.set(x, "on${Capitalize<T>}", js.undefined)
  }
}
