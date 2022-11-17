package typings.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unsubscribable extends StObject {
  
  def unsubscribe(): Unit
}
object Unsubscribable {
  
  inline def apply(unsubscribe: () => Unit): Unsubscribable = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Unsubscribable]
  }
  
  extension [Self <: Unsubscribable](x: Self) {
    
    inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
