package typings.reactDndTouchBackend

import typings.std.MouseEvent
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsPredicatesMod {
  
  @JSImport("react-dnd-touch-backend/dist/utils/predicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventShouldEndDrag(e: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("eventShouldEndDrag")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def eventShouldStartDrag(e: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("eventShouldStartDrag")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTouchEvent(e: MouseEvent): /* is std.TouchEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEvent")(e.asInstanceOf[js.Any]).asInstanceOf[/* is std.TouchEvent */ Boolean]
  inline def isTouchEvent(e: Touch): /* is std.TouchEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEvent")(e.asInstanceOf[js.Any]).asInstanceOf[/* is std.TouchEvent */ Boolean]
  inline def isTouchEvent(e: TouchEvent): /* is std.TouchEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEvent")(e.asInstanceOf[js.Any]).asInstanceOf[/* is std.TouchEvent */ Boolean]
}
