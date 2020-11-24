package typings.pulumiPulumi.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTimeouts extends js.Object {
  
  /**
    * The optional create timeout represented as a string e.g. 5m, 40s, 1d.
    */
  var create: js.UndefOr[String] = js.native
  
  /**
    * The optional delete timeout represented as a string e.g. 5m, 40s, 1d.
    */
  var delete: js.UndefOr[String] = js.native
  
  /**
    * The optional update timeout represented as a string e.g. 5m, 40s, 1d.
    */
  var update: js.UndefOr[String] = js.native
}
object CustomTimeouts {
  
  @scala.inline
  def apply(): CustomTimeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTimeouts]
  }
  
  @scala.inline
  implicit class CustomTimeoutsOps[Self <: CustomTimeouts] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: String): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setUpdate(value: String): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
