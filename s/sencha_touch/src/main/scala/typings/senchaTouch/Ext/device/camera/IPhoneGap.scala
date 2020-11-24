package typings.senchaTouch.Ext.device.camera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPhoneGap extends IAbstract {
  
  /** [Method] Allows you to capture a photo
    * @param args Object
    */
  @JSName("capture")
  var capture_IPhoneGap: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
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
    def setCapture(value: /* args */ js.UndefOr[js.Any] => Unit): Self = this.set("capture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
  }
}
