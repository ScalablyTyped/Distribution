package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollEvents extends StObject {
  
  /** Handler that is called when the scroll wheel moves. */
  var onScroll: js.UndefOr[js.Function1[/* e */ ScrollEvent, Unit]] = js.undefined
}
object ScrollEvents {
  
  inline def apply(): ScrollEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollEvents] (val x: Self) extends AnyVal {
    
    inline def setOnScroll(value: /* e */ ScrollEvent => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
  }
}
