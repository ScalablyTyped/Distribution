package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribableMixin extends js.Object {
  
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
  def addListenerOn(eventEmitter: js.Any, eventType: String, listener: js.Function0[_], context: js.Any): Unit = js.native
}
object SubscribableMixin {
  
  @scala.inline
  def apply(addListenerOn: (js.Any, String, js.Function0[_], js.Any) => Unit): SubscribableMixin = {
    val __obj = js.Dynamic.literal(addListenerOn = js.Any.fromFunction4(addListenerOn))
    __obj.asInstanceOf[SubscribableMixin]
  }
  
  @scala.inline
  implicit class SubscribableMixinOps[Self <: SubscribableMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListenerOn(value: (js.Any, String, js.Function0[_], js.Any) => Unit): Self = this.set("addListenerOn", js.Any.fromFunction4(value))
  }
}
