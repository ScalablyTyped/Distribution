package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientObjectData extends js.Object {
  
  def get_clientObjectProperties(): js.Any = js.native
  
  def get_methodReturnObjects(): js.Any = js.native
  
  def get_properties(): js.Any = js.native
}
object ClientObjectData {
  
  @scala.inline
  def apply(
    get_clientObjectProperties: () => js.Any,
    get_methodReturnObjects: () => js.Any,
    get_properties: () => js.Any
  ): ClientObjectData = {
    val __obj = js.Dynamic.literal(get_clientObjectProperties = js.Any.fromFunction0(get_clientObjectProperties), get_methodReturnObjects = js.Any.fromFunction0(get_methodReturnObjects), get_properties = js.Any.fromFunction0(get_properties))
    __obj.asInstanceOf[ClientObjectData]
  }
  
  @scala.inline
  implicit class ClientObjectDataOps[Self <: ClientObjectData] (val x: Self) extends AnyVal {
    
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
    def setGet_clientObjectProperties(value: () => js.Any): Self = this.set("get_clientObjectProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_methodReturnObjects(value: () => js.Any): Self = this.set("get_methodReturnObjects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_properties(value: () => js.Any): Self = this.set("get_properties", js.Any.fromFunction0(value))
  }
}
