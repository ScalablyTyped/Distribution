package typings.storybookUi.distMod

import typings.reachRouter.mod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootProps extends js.Object {
  
  var history: js.UndefOr[History] = js.native
  
  var provider: typings.storybookUi.providerMod.default = js.native
}
object RootProps {
  
  @scala.inline
  def apply(provider: typings.storybookUi.providerMod.default): RootProps = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootProps]
  }
  
  @scala.inline
  implicit class RootPropsOps[Self <: RootProps] (val x: Self) extends AnyVal {
    
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
    def setProvider(value: typings.storybookUi.providerMod.default): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: History): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
  }
}
