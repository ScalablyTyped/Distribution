package typings.rcMotion.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animationend extends js.Object {
  
  var animationend: Record[String, String] = js.native
  
  var transitionend: Record[String, String] = js.native
}
object Animationend {
  
  @scala.inline
  def apply(animationend: Record[String, String], transitionend: Record[String, String]): Animationend = {
    val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animationend]
  }
  
  @scala.inline
  implicit class AnimationendOps[Self <: Animationend] (val x: Self) extends AnyVal {
    
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
    def setAnimationend(value: Record[String, String]): Self = this.set("animationend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionend(value: Record[String, String]): Self = this.set("transitionend", value.asInstanceOf[js.Any])
  }
}
