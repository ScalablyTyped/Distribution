package typings.sharepoint.SP.JsGrid.Internal

import typings.sharepoint.SP.JsGrid.IValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyUpdate extends IValue {
  
  @JSName("localized")
  var localized_PropertyUpdate: String = js.native
}
object PropertyUpdate {
  
  @scala.inline
  def apply(localized: String): PropertyUpdate = {
    val __obj = js.Dynamic.literal(localized = localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdate]
  }
  
  @scala.inline
  implicit class PropertyUpdateOps[Self <: PropertyUpdate] (val x: Self) extends AnyVal {
    
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
    def setLocalized(value: String): Self = this.set("localized", value.asInstanceOf[js.Any])
  }
}
