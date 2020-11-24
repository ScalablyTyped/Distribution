package typings.smoothScrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.SetPositionOptions> */
@js.native
trait PartialSetPositionOptions extends js.Object {
  
  var withoutCallbacks: js.UndefOr[Boolean] = js.native
}
object PartialSetPositionOptions {
  
  @scala.inline
  def apply(): PartialSetPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSetPositionOptions]
  }
  
  @scala.inline
  implicit class PartialSetPositionOptionsOps[Self <: PartialSetPositionOptions] (val x: Self) extends AnyVal {
    
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
    def setWithoutCallbacks(value: Boolean): Self = this.set("withoutCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutCallbacks: Self = this.set("withoutCallbacks", js.undefined)
  }
}
