package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The React Native implementation of the IOS RCTEventEmitter which is required when creating
  * a module that communicates with IOS
  */
@js.native
trait NativeModule extends js.Object {
  
  /**
    * Add the provided eventType as an active listener
    * @param eventType name of the event for which we are registering listener
    */
  def addListener(eventType: String): Unit = js.native
  
  /**
    * Remove a specified number of events.  There are no eventTypes in this case, as
    * the native side doesn't remove the name, but only manages a counter of total
    * listeners
    * @param count number of listeners to remove (of any type)
    */
  def removeListeners(count: Double): Unit = js.native
}
object NativeModule {
  
  @scala.inline
  def apply(addListener: String => Unit, removeListeners: Double => Unit): NativeModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
    __obj.asInstanceOf[NativeModule]
  }
  
  @scala.inline
  implicit class NativeModuleOps[Self <: NativeModule] (val x: Self) extends AnyVal {
    
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
    def setAddListener(value: String => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListeners(value: Double => Unit): Self = this.set("removeListeners", js.Any.fromFunction1(value))
  }
}
