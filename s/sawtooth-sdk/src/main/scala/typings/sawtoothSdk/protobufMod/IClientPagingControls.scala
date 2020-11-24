package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientPagingControls extends js.Object {
  
  /** ClientPagingControls limit */
  var limit: js.UndefOr[Double | Null] = js.native
  
  /** ClientPagingControls start */
  var start: js.UndefOr[String | Null] = js.native
}
object IClientPagingControls {
  
  @scala.inline
  def apply(): IClientPagingControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPagingControls]
  }
  
  @scala.inline
  implicit class IClientPagingControlsOps[Self <: IClientPagingControls] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLimitNull: Self = this.set("limit", null)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStartNull: Self = this.set("start", null)
  }
}
