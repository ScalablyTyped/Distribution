package typings.reactDates.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactDates.reactDatesStrings.verticalScrollable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGetPrevScrollableMonths extends StObject {
  
  var onGetNextScrollableMonths: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      Unit
    ]
  ] = js.undefined
  
  // VERTICAL_SCROLLABLE daypickers only
  var onGetPrevScrollableMonths: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      Unit
    ]
  ] = js.undefined
  
  var orientation: verticalScrollable
}
object OnGetPrevScrollableMonths {
  
  inline def apply(): OnGetPrevScrollableMonths = {
    val __obj = js.Dynamic.literal(orientation = "verticalScrollable")
    __obj.asInstanceOf[OnGetPrevScrollableMonths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnGetPrevScrollableMonths] (val x: Self) extends AnyVal {
    
    inline def setOnGetNextScrollableMonths(
      value: /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]] => Unit
    ): Self = StObject.set(x, "onGetNextScrollableMonths", js.Any.fromFunction1(value))
    
    inline def setOnGetNextScrollableMonthsUndefined: Self = StObject.set(x, "onGetNextScrollableMonths", js.undefined)
    
    inline def setOnGetPrevScrollableMonths(
      value: /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]] => Unit
    ): Self = StObject.set(x, "onGetPrevScrollableMonths", js.Any.fromFunction1(value))
    
    inline def setOnGetPrevScrollableMonthsUndefined: Self = StObject.set(x, "onGetPrevScrollableMonths", js.undefined)
    
    inline def setOrientation(value: verticalScrollable): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
