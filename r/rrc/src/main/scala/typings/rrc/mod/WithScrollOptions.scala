package typings.rrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithScrollOptions extends js.Object {
  
  var alignToTop: js.UndefOr[Boolean] = js.native
  
  var propId: js.UndefOr[PropIdCallback] = js.native
}
object WithScrollOptions {
  
  @scala.inline
  def apply(): WithScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithScrollOptions]
  }
  
  @scala.inline
  implicit class WithScrollOptionsOps[Self <: WithScrollOptions] (val x: Self) extends AnyVal {
    
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
    def setAlignToTop(value: Boolean): Self = this.set("alignToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignToTop: Self = this.set("alignToTop", js.undefined)
    
    @scala.inline
    def setPropId(value: () => String): Self = this.set("propId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePropId: Self = this.set("propId", js.undefined)
  }
}
