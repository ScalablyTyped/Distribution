package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ractive.mod.ObserverBaseDescriptor[T]
  - typings.ractive.mod.ObserverArrayDescriptor[T]
*/
trait ObserverDescriptor[T /* <: Ractive[T] */] extends StObject
object ObserverDescriptor {
  
  @scala.inline
  def ObserverArrayDescriptor[T /* <: Ractive[T] */](array: Boolean, handler: ObserverArrayCallback[T]): typings.ractive.mod.ObserverArrayDescriptor[T] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ractive.mod.ObserverArrayDescriptor[T]]
  }
  
  @scala.inline
  def ObserverBaseDescriptor[T /* <: Ractive[T] */](handler: ObserverCallback[T]): typings.ractive.mod.ObserverBaseDescriptor[T] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ractive.mod.ObserverBaseDescriptor[T]]
  }
}
