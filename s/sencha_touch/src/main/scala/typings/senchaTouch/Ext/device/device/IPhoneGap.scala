package typings.senchaTouch.Ext.device.device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPhoneGap extends IAbstract {
  
  /** [Property] (String) */
  var cordova: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var model: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var version: js.UndefOr[String] = js.native
}
object IPhoneGap {
  
  @scala.inline
  def apply(): IPhoneGap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPhoneGap]
  }
  
  @scala.inline
  implicit class IPhoneGapOps[Self <: IPhoneGap] (val x: Self) extends AnyVal {
    
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
    def setCordova(value: String): Self = this.set("cordova", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCordova: Self = this.set("cordova", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
