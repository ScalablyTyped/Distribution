package typings.senchaTouch.Ext.fx.animation

import typings.senchaTouch.Ext.fx.IAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWipe extends IAnimation {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var easing: js.UndefOr[String] = js.native
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of easing
    * @returns String
    */
  var getEasing: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of out
    * @returns Boolean
    */
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of easing
    * @param easing String The new value.
    */
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of out
    * @param out Boolean The new value.
    */
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.native
}

object IWipe {
  @scala.inline
  def apply(): IWipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWipe]
  }
  @scala.inline
  implicit class IWipeOps[Self <: IWipe] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    @scala.inline
    def setGetEasing(value: () => String): Self = this.set("getEasing", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEasing: Self = this.set("getEasing", js.undefined)
    @scala.inline
    def setGetOut(value: () => Boolean): Self = this.set("getOut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOut: Self = this.set("getOut", js.undefined)
    @scala.inline
    def setOut(value: Boolean): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    @scala.inline
    def setSetEasing(value: /* easing */ js.UndefOr[String] => Unit): Self = this.set("setEasing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEasing: Self = this.set("setEasing", js.undefined)
    @scala.inline
    def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = this.set("setOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOut: Self = this.set("setOut", js.undefined)
  }
  
}

