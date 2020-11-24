package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionMixin extends js.Object {
  
  def clearInteractionHandle(clearHandle: Double): Unit = js.native
  
  def createInteractionHandle(): Double = js.native
  
  /**
    * Schedule work for after all interactions have completed.
    *
    */
  def runAfterInteractions(callback: js.Function0[_]): Unit = js.native
}
object InteractionMixin {
  
  @scala.inline
  def apply(
    clearInteractionHandle: Double => Unit,
    createInteractionHandle: () => Double,
    runAfterInteractions: js.Function0[_] => Unit
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal(clearInteractionHandle = js.Any.fromFunction1(clearInteractionHandle), createInteractionHandle = js.Any.fromFunction0(createInteractionHandle), runAfterInteractions = js.Any.fromFunction1(runAfterInteractions))
    __obj.asInstanceOf[InteractionMixin]
  }
  
  @scala.inline
  implicit class InteractionMixinOps[Self <: InteractionMixin] (val x: Self) extends AnyVal {
    
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
    def setClearInteractionHandle(value: Double => Unit): Self = this.set("clearInteractionHandle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateInteractionHandle(value: () => Double): Self = this.set("createInteractionHandle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunAfterInteractions(value: js.Function0[_] => Unit): Self = this.set("runAfterInteractions", js.Any.fromFunction1(value))
  }
}
