package typings.reactToastify.cssTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSTransitionProps extends js.Object {
  
  /**
    * Append current toast position to the classname.
    * For instance `myclass--top-center`...
    * `Default: false`
    */
  var appendPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * Collapse toast smoothly when animation end
    * `Default: true`
    */
  var collapse: js.UndefOr[Boolean] = js.native
  
  /**
    * Collapse transition duration
    * `Default: 300`
    */
  var collapseDuration: js.UndefOr[Double] = js.native
  
  /**
    * Define the duration of the transition in ms
    * You can also pass an array `[enterDuration, exitDuration]`
    * `Default: 750`
    */
  var duration: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
  
  /**
    * Css class to apply when toast enter
    */
  var enter: String = js.native
  
  /**
    * Css class to apply when toast leave
    */
  var exit: String = js.native
}
object CSSTransitionProps {
  
  @scala.inline
  def apply(enter: String, exit: String): CSSTransitionProps = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionProps]
  }
  
  @scala.inline
  implicit class CSSTransitionPropsOps[Self <: CSSTransitionProps] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: String): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: String): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendPosition(value: Boolean): Self = this.set("appendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendPosition: Self = this.set("appendPosition", js.undefined)
    
    @scala.inline
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setCollapseDuration(value: Double): Self = this.set("collapseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseDuration: Self = this.set("collapseDuration", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | (js.Tuple2[Double, Double])): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
}
