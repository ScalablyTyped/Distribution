package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationOptions extends js.Object {
  
  var persistQuery: js.UndefOr[Boolean] = js.native
  
  var updateRoutes: js.UndefOr[Boolean] = js.native
}
object LocationOptions {
  
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  @scala.inline
  implicit class LocationOptionsOps[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
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
    def setPersistQuery(value: Boolean): Self = this.set("persistQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistQuery: Self = this.set("persistQuery", js.undefined)
    
    @scala.inline
    def setUpdateRoutes(value: Boolean): Self = this.set("updateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateRoutes: Self = this.set("updateRoutes", js.undefined)
  }
}
