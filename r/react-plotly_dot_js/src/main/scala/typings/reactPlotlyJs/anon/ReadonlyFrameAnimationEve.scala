package typings.reactPlotlyJs.anon

import typings.plotlyJs.anon.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.FrameAnimationEvent> */
@js.native
trait ReadonlyFrameAnimationEve extends js.Object {
  
  val animation: Frame = js.native
  
  val frame: typings.plotlyJs.mod.Frame = js.native
  
  val name: String = js.native
}
object ReadonlyFrameAnimationEve {
  
  @scala.inline
  def apply(animation: Frame, frame: typings.plotlyJs.mod.Frame, name: String): ReadonlyFrameAnimationEve = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFrameAnimationEve]
  }
  
  @scala.inline
  implicit class ReadonlyFrameAnimationEveOps[Self <: ReadonlyFrameAnimationEve] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Frame): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: typings.plotlyJs.mod.Frame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
