package typings.rbacA.anon

import typings.rbacA.mod.AttributesManager
import typings.rbacA.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes[P /* <: Provider */, AM /* <: AttributesManager */] extends js.Object {
  
  var attributes: js.UndefOr[AM] = js.native
  
  var provider: P = js.native
}
object Attributes {
  
  @scala.inline
  def apply[P /* <: Provider */, AM /* <: AttributesManager */](provider: P): Attributes[P, AM] = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes[P, AM]]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes[_, _], P /* <: Provider */, AM /* <: AttributesManager */] (val x: Self with (Attributes[P, AM])) extends AnyVal {
    
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
    def setProvider(value: P): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: AM): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
}
