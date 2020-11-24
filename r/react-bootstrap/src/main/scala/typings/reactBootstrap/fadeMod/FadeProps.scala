package typings.reactBootstrap.fadeMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FadeProps
  extends AllHTMLAttributes[Fade]
     with TransitionCallbacks
     with ClassAttributes[Fade] {
  
  var appear: js.UndefOr[Boolean] = js.native
  
  var in: js.UndefOr[Boolean] = js.native
  
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}
object FadeProps {
  
  @scala.inline
  def apply(): FadeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeProps]
  }
  
  @scala.inline
  implicit class FadePropsOps[Self <: FadeProps] (val x: Self) extends AnyVal {
    
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
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setMountOnEnter(value: Boolean): Self = this.set("mountOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOnEnter: Self = this.set("mountOnEnter", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUnmountOnExit(value: Boolean): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
}
