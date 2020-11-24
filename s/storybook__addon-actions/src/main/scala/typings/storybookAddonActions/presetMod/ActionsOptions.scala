package typings.storybookAddonActions.presetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsOptions extends js.Object {
  
  var addDecorator: js.UndefOr[Boolean] = js.native
}
object ActionsOptions {
  
  @scala.inline
  def apply(): ActionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsOptions]
  }
  
  @scala.inline
  implicit class ActionsOptionsOps[Self <: ActionsOptions] (val x: Self) extends AnyVal {
    
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
    def setAddDecorator(value: Boolean): Self = this.set("addDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddDecorator: Self = this.set("addDecorator", js.undefined)
  }
}
