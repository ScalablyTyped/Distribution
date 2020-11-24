package typings.storybookUi.anon

import typings.storybookUi.mobileMod.ActiveTabsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialActive extends js.Object {
  
  var initialActive: ActiveTabsType = js.native
  
  var isToolshown: Boolean = js.native
}
object InitialActive {
  
  @scala.inline
  def apply(initialActive: ActiveTabsType, isToolshown: Boolean): InitialActive = {
    val __obj = js.Dynamic.literal(initialActive = initialActive.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialActive]
  }
  
  @scala.inline
  implicit class InitialActiveOps[Self <: InitialActive] (val x: Self) extends AnyVal {
    
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
    def setInitialActive(value: ActiveTabsType): Self = this.set("initialActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToolshown(value: Boolean): Self = this.set("isToolshown", value.asInstanceOf[js.Any])
  }
}
