package typings.storybookUi.providerMod

import typings.storybookAddons.typesMod.Types_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends js.Object {
  
  def getConfig(): js.Object = js.native
  
  def getElements(_type: Types_): Unit = js.native
  
  def handleAPI(_api: js.Any): Unit = js.native
}
object Provider {
  
  @scala.inline
  def apply(getConfig: () => js.Object, getElements: Types_ => Unit, handleAPI: js.Any => Unit): Provider = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), getElements = js.Any.fromFunction1(getElements), handleAPI = js.Any.fromFunction1(handleAPI))
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setGetConfig(value: () => js.Object): Self = this.set("getConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElements(value: Types_ => Unit): Self = this.set("getElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleAPI(value: js.Any => Unit): Self = this.set("handleAPI", js.Any.fromFunction1(value))
  }
}
