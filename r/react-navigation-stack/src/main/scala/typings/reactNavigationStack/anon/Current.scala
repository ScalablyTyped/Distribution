package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends js.Object {
  
  /**
    * Progress value of the current screen.
    */
  var current: AnimatedInterpolation = js.native
  
  /**
    * Progress value for the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[AnimatedInterpolation] = js.native
  
  /**
    * Progress value for the screen before this one in the stack.
    * This can be `undefined` in case the screen animating is the first one.
    */
  var previous: js.UndefOr[AnimatedInterpolation] = js.native
}
object Current {
  
  @scala.inline
  def apply(current: AnimatedInterpolation): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: AnimatedInterpolation): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: AnimatedInterpolation): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrevious(value: AnimatedInterpolation): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
}
