package typings.rbx.imageImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageModifierProps extends js.Object {
  
  var rounded: js.UndefOr[Boolean] = js.native
}
object ImageModifierProps {
  
  @scala.inline
  def apply(): ImageModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageModifierProps]
  }
  
  @scala.inline
  implicit class ImageModifierPropsOps[Self <: ImageModifierProps] (val x: Self) extends AnyVal {
    
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
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
  }
}
