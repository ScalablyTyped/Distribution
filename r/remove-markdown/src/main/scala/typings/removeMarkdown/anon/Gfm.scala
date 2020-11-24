package typings.removeMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gfm extends js.Object {
  
  var gfm: js.UndefOr[Boolean] = js.native
  
  var stripListLeaders: js.UndefOr[Boolean] = js.native
}
object Gfm {
  
  @scala.inline
  def apply(): Gfm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gfm]
  }
  
  @scala.inline
  implicit class GfmOps[Self <: Gfm] (val x: Self) extends AnyVal {
    
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
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    
    @scala.inline
    def setStripListLeaders(value: Boolean): Self = this.set("stripListLeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripListLeaders: Self = this.set("stripListLeaders", js.undefined)
  }
}
