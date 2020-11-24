package typings.reactSpringAnimated.anon

import typings.reactSpringAnimated.indexCjsMod.WithAnimated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animated extends js.Object {
  
  var animated: WithAnimated = js.native
}
object Animated {
  
  @scala.inline
  def apply(animated: WithAnimated): Animated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit class AnimatedOps[Self <: Animated] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: WithAnimated): Self = this.set("animated", value.asInstanceOf[js.Any])
  }
}
