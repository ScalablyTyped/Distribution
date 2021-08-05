package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntervalProps extends StObject {
  
  var interval: js.UndefOr[Interval] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object GetIntervalProps {
  
  inline def apply(): GetIntervalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntervalProps]
  }
  
  extension [Self <: GetIntervalProps](x: Self) {
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
