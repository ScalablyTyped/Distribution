package typings.reactStackGrid.mod

import typings.reactStackGrid.anon.Appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait transitionsProps extends js.Object {
  
  var fade: Appear = js.native
  
  var fadeDown: Appear = js.native
  
  var fadeUp: Appear = js.native
  
  var flip: Appear = js.native
  
  var helix: Appear = js.native
  
  var scaleDown: Appear = js.native
  
  var scaleUp: Appear = js.native
}
object transitionsProps {
  
  @scala.inline
  def apply(
    fade: Appear,
    fadeDown: Appear,
    fadeUp: Appear,
    flip: Appear,
    helix: Appear,
    scaleDown: Appear,
    scaleUp: Appear
  ): transitionsProps = {
    val __obj = js.Dynamic.literal(fade = fade.asInstanceOf[js.Any], fadeDown = fadeDown.asInstanceOf[js.Any], fadeUp = fadeUp.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], helix = helix.asInstanceOf[js.Any], scaleDown = scaleDown.asInstanceOf[js.Any], scaleUp = scaleUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[transitionsProps]
  }
  
  @scala.inline
  implicit class transitionsPropsOps[Self <: transitionsProps] (val x: Self) extends AnyVal {
    
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
    def setFade(value: Appear): Self = this.set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeDown(value: Appear): Self = this.set("fadeDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeUp(value: Appear): Self = this.set("fadeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: Appear): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelix(value: Appear): Self = this.set("helix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDown(value: Appear): Self = this.set("scaleDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUp(value: Appear): Self = this.set("scaleUp", value.asInstanceOf[js.Any])
  }
}
