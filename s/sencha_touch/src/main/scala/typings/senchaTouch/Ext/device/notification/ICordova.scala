package typings.senchaTouch.Ext.device.notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICordova extends IAbstract {
  
  /** [Method] Vibrates the device
    * @param time Object
    */
  @JSName("vibrate")
  var vibrate_ICordova: js.UndefOr[js.Function1[/* time */ js.UndefOr[js.Any], Unit]] = js.native
}
object ICordova {
  
  @scala.inline
  def apply(): ICordova = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordova]
  }
  
  @scala.inline
  implicit class ICordovaOps[Self <: ICordova] (val x: Self) extends AnyVal {
    
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
    def setVibrate(value: /* time */ js.UndefOr[js.Any] => Unit): Self = this.set("vibrate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
  }
}
