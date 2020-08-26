package typings.senchaTouch.Ext.fx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopIn extends IAbstract {
  /** [Method] Returns the value of out
    * @returns Boolean
    */
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of out
    * @param out Boolean The new value.
    */
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.native
}

object IPopIn {
  @scala.inline
  def apply(): IPopIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopIn]
  }
  @scala.inline
  implicit class IPopInOps[Self <: IPopIn] (val x: Self) extends AnyVal {
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
    def setGetOut(value: () => Boolean): Self = this.set("getOut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOut: Self = this.set("getOut", js.undefined)
    @scala.inline
    def setOut(value: Boolean): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = this.set("setOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOut: Self = this.set("setOut", js.undefined)
  }
  
}

