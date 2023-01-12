package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveEvents extends StObject {
  
  /** Handler that is called when the element is moved. */
  var onMove: js.UndefOr[js.Function1[/* e */ MoveMoveEvent, Unit]] = js.undefined
  
  /** Handler that is called when a move interaction ends. */
  var onMoveEnd: js.UndefOr[js.Function1[/* e */ MoveEndEvent, Unit]] = js.undefined
  
  /** Handler that is called when a move interaction starts. */
  var onMoveStart: js.UndefOr[js.Function1[/* e */ MoveStartEvent, Unit]] = js.undefined
}
object MoveEvents {
  
  inline def apply(): MoveEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveEvents] (val x: Self) extends AnyVal {
    
    inline def setOnMove(value: /* e */ MoveMoveEvent => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction1(value))
    
    inline def setOnMoveEnd(value: /* e */ MoveEndEvent => Unit): Self = StObject.set(x, "onMoveEnd", js.Any.fromFunction1(value))
    
    inline def setOnMoveEndUndefined: Self = StObject.set(x, "onMoveEnd", js.undefined)
    
    inline def setOnMoveStart(value: /* e */ MoveStartEvent => Unit): Self = StObject.set(x, "onMoveStart", js.Any.fromFunction1(value))
    
    inline def setOnMoveStartUndefined: Self = StObject.set(x, "onMoveStart", js.undefined)
    
    inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
  }
}
