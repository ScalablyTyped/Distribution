package typings.reactFrontload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrontloadConnectOptions extends js.Object {
  
  var noServerRender: js.UndefOr[Boolean] = js.native
  
  var onMount: js.UndefOr[Boolean] = js.native
  
  var onUpdate: js.UndefOr[Boolean] = js.native
}
object FrontloadConnectOptions {
  
  @scala.inline
  def apply(): FrontloadConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrontloadConnectOptions]
  }
  
  @scala.inline
  implicit class FrontloadConnectOptionsOps[Self <: FrontloadConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setNoServerRender(value: Boolean): Self = this.set("noServerRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoServerRender: Self = this.set("noServerRender", js.undefined)
    
    @scala.inline
    def setOnMount(value: Boolean): Self = this.set("onMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMount: Self = this.set("onMount", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: Boolean): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
}
