package typings.reactThreeFiber.anon

import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlePointer extends StObject {
  
  def handlePointer(name: String): js.Function1[/* event */ DomEvent, Unit]
}
object HandlePointer {
  
  inline def apply(handlePointer: String => js.Function1[/* event */ DomEvent, Unit]): HandlePointer = {
    val __obj = js.Dynamic.literal(handlePointer = js.Any.fromFunction1(handlePointer))
    __obj.asInstanceOf[HandlePointer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlePointer] (val x: Self) extends AnyVal {
    
    inline def setHandlePointer(value: String => js.Function1[/* event */ DomEvent, Unit]): Self = StObject.set(x, "handlePointer", js.Any.fromFunction1(value))
  }
}
