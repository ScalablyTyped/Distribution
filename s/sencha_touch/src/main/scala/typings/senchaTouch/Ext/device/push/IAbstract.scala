package typings.senchaTouch.Ext.device.push

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Property] (Number) */
  var ALERT: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var BADGE: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var SOUND: js.UndefOr[Double] = js.native
  /** [Method] Registers a push notification
    * @param config Object The configuration for to pass when registering this push notification service.
    */
  var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setALERT(value: Double): Self = this.set("ALERT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteALERT: Self = this.set("ALERT", js.undefined)
    @scala.inline
    def setBADGE(value: Double): Self = this.set("BADGE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBADGE: Self = this.set("BADGE", js.undefined)
    @scala.inline
    def setSOUND(value: Double): Self = this.set("SOUND", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSOUND: Self = this.set("SOUND", js.undefined)
    @scala.inline
    def setRegister(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("register", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
  }
  
}

