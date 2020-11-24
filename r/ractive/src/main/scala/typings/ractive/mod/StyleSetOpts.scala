package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSetOpts extends SetOpts {
  
  /** Whether or not to apply the new styles immediately. Defaults to updating the Ractive-managed style tag (true) */
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.native
}
object StyleSetOpts {
  
  @scala.inline
  def apply(): StyleSetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSetOpts]
  }
  
  @scala.inline
  implicit class StyleSetOptsOps[Self <: StyleSetOpts] (val x: Self) extends AnyVal {
    
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
    def setApply(value: Boolean): Self = this.set("apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
  }
}
