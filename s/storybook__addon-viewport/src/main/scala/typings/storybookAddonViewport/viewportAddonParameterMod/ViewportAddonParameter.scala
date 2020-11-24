package typings.storybookAddonViewport.viewportAddonParameterMod

import typings.storybookAddonViewport.viewportMod.ViewportMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportAddonParameter extends js.Object {
  
  var defaultViewport: js.UndefOr[String] = js.native
  
  var disable: js.UndefOr[Boolean] = js.native
  
  var viewports: js.UndefOr[ViewportMap] = js.native
}
object ViewportAddonParameter {
  
  @scala.inline
  def apply(): ViewportAddonParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportAddonParameter]
  }
  
  @scala.inline
  implicit class ViewportAddonParameterOps[Self <: ViewportAddonParameter] (val x: Self) extends AnyVal {
    
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
    def setDefaultViewport(value: String): Self = this.set("defaultViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultViewport: Self = this.set("defaultViewport", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setViewports(value: ViewportMap): Self = this.set("viewports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewports: Self = this.set("viewports", js.undefined)
  }
}
