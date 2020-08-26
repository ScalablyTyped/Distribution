package typings.senchaTouch.Ext.device.camera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICordova extends IAbstract {
  /** [Method] Allows you to capture a photo
    * @param args Object
    */
  @JSName("capture")
  var capture_ICordova: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
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
    def setCapture(value: /* args */ js.UndefOr[js.Any] => Unit): Self = this.set("capture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
  }
  
}

