package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribableMixin extends StObject {
  
  /**
    * Special form of calling `addListener` that *guarantees* that a
    * subscription *must* be tied to a component instance, and therefore will
    * be cleaned up when the component is unmounted. It is impossible to create
    * the subscription and pass it in - this method must be the one to create
    * the subscription and therefore can guarantee it is retained in a way that
    * will be cleaned up.
    *
    * @param eventEmitter emitter to subscribe to.
    * @param eventType Type of event to listen to.
    * @param listener Function to invoke when event occurs.
    * @param context Object to use as listener context.
    */
  def addListenerOn(eventEmitter: Any, eventType: String, listener: js.Function0[Any], context: Any): Unit
}
object SubscribableMixin {
  
  inline def apply(addListenerOn: (Any, String, js.Function0[Any], Any) => Unit): SubscribableMixin = {
    val __obj = js.Dynamic.literal(addListenerOn = js.Any.fromFunction4(addListenerOn))
    __obj.asInstanceOf[SubscribableMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscribableMixin] (val x: Self) extends AnyVal {
    
    inline def setAddListenerOn(value: (Any, String, js.Function0[Any], Any) => Unit): Self = StObject.set(x, "addListenerOn", js.Any.fromFunction4(value))
  }
}
