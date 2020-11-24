package typings.storybookClientApi.storyStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowUnsafeOption extends js.Object {
  
  var allowUnsafe: js.UndefOr[Boolean] = js.native
}
object AllowUnsafeOption {
  
  @scala.inline
  def apply(): AllowUnsafeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUnsafeOption]
  }
  
  @scala.inline
  implicit class AllowUnsafeOptionOps[Self <: AllowUnsafeOption] (val x: Self) extends AnyVal {
    
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
    def setAllowUnsafe(value: Boolean): Self = this.set("allowUnsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnsafe: Self = this.set("allowUnsafe", js.undefined)
  }
}
