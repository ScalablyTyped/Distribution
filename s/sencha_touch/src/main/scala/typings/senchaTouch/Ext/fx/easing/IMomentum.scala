package typings.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMomentum extends IAbstract {
  /** [Method] Returns the value of acceleration
    * @returns Number
    */
  var getAcceleration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of friction
    * @returns Number
    */
  var getFriction: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of startVelocity
    * @returns Number
    */
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of acceleration
    * @param acceleration Number The new value.
    */
  var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of friction
    * @param friction Number The new value.
    */
  var setFriction: js.UndefOr[js.Function1[/* friction */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of startVelocity
    * @param startVelocity Number The new value.
    */
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.native
}

object IMomentum {
  @scala.inline
  def apply(): IMomentum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMomentum]
  }
  @scala.inline
  implicit class IMomentumOps[Self <: IMomentum] (val x: Self) extends AnyVal {
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
    def setGetAcceleration(value: () => Double): Self = this.set("getAcceleration", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAcceleration: Self = this.set("getAcceleration", js.undefined)
    @scala.inline
    def setGetFriction(value: () => Double): Self = this.set("getFriction", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFriction: Self = this.set("getFriction", js.undefined)
    @scala.inline
    def setGetStartVelocity(value: () => Double): Self = this.set("getStartVelocity", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStartVelocity: Self = this.set("getStartVelocity", js.undefined)
    @scala.inline
    def setSetAcceleration(value: /* acceleration */ js.UndefOr[Double] => Unit): Self = this.set("setAcceleration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAcceleration: Self = this.set("setAcceleration", js.undefined)
    @scala.inline
    def setSetFriction(value: /* friction */ js.UndefOr[Double] => Unit): Self = this.set("setFriction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFriction: Self = this.set("setFriction", js.undefined)
    @scala.inline
    def setSetStartVelocity(value: /* startVelocity */ js.UndefOr[Double] => Unit): Self = this.set("setStartVelocity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStartVelocity: Self = this.set("setStartVelocity", js.undefined)
  }
  
}

