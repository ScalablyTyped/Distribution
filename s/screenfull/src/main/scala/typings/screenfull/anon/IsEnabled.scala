package typings.screenfull.anon

import typings.screenfull.screenfullBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEnabled extends js.Object {
  
  var isEnabled: `false` = js.native
}
object IsEnabled {
  
  @scala.inline
  def apply(isEnabled: `false`): IsEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnabled]
  }
  
  @scala.inline
  implicit class IsEnabledOps[Self <: IsEnabled] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: `false`): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
  }
}
