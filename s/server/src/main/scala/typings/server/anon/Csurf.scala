package typings.server.anon

import typings.server.optionsMod.CsurfOptions
import typings.server.serverBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Csurf extends js.Object {
  
  var csurf: js.UndefOr[`false` | CsurfOptions] = js.native
}
object Csurf {
  
  @scala.inline
  def apply(): Csurf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Csurf]
  }
  
  @scala.inline
  implicit class CsurfOps[Self <: Csurf] (val x: Self) extends AnyVal {
    
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
    def setCsurf(value: `false` | CsurfOptions): Self = this.set("csurf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsurf: Self = this.set("csurf", js.undefined)
  }
}
