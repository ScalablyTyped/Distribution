package typings.readPkg.mod

import typings.readPkg.readPkgBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizeOptions extends Options {
  
  @JSName("normalize")
  val normalize_NormalizeOptions: js.UndefOr[`true`] = js.native
}
object NormalizeOptions {
  
  @scala.inline
  def apply(): NormalizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeOptions]
  }
  
  @scala.inline
  implicit class NormalizeOptionsOps[Self <: NormalizeOptions] (val x: Self) extends AnyVal {
    
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
    def setNormalize(value: `true`): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
  }
}
