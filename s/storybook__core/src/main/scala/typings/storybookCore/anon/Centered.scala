package typings.storybookCore.anon

import typings.storybookCore.storybookCoreStrings.`sb-main-centered`
import typings.storybookCore.storybookCoreStrings.`sb-main-fullscreen`
import typings.storybookCore.storybookCoreStrings.`sb-main-padded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Centered extends js.Object {
  
  val centered: `sb-main-centered` = js.native
  
  val fullscreen: `sb-main-fullscreen` = js.native
  
  val padded: `sb-main-padded` = js.native
}
object Centered {
  
  @scala.inline
  def apply(centered: `sb-main-centered`, fullscreen: `sb-main-fullscreen`, padded: `sb-main-padded`): Centered = {
    val __obj = js.Dynamic.literal(centered = centered.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], padded = padded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Centered]
  }
  
  @scala.inline
  implicit class CenteredOps[Self <: Centered] (val x: Self) extends AnyVal {
    
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
    def setCentered(value: `sb-main-centered`): Self = this.set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreen(value: `sb-main-fullscreen`): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadded(value: `sb-main-padded`): Self = this.set("padded", value.asInstanceOf[js.Any])
  }
}
