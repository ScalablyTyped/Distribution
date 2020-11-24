package typings.reactMdProgress.getProgressA11yMod

import typings.reactMdProgress.reactMdProgressBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressA11y extends js.Object {
  
  var `aria-busy`: `true` = js.native
  
  var `aria-describedby`: String = js.native
}
object ProgressA11y {
  
  @scala.inline
  def apply(`aria-busy`: `true`, `aria-describedby`: String): ProgressA11y = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressA11y]
  }
  
  @scala.inline
  implicit class ProgressA11yOps[Self <: ProgressA11y] (val x: Self) extends AnyVal {
    
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
    def `setAria-busy`(value: `true`): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
  }
}
