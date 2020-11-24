package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOneWayOptions extends js.Object {
  
  var emptyBody: js.UndefOr[Boolean] = js.native
  
  var responseCode: js.UndefOr[Double] = js.native
}
object IOneWayOptions {
  
  @scala.inline
  def apply(): IOneWayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneWayOptions]
  }
  
  @scala.inline
  implicit class IOneWayOptionsOps[Self <: IOneWayOptions] (val x: Self) extends AnyVal {
    
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
    def setEmptyBody(value: Boolean): Self = this.set("emptyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyBody: Self = this.set("emptyBody", js.undefined)
    
    @scala.inline
    def setResponseCode(value: Double): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
  }
}
