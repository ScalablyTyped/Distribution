package typings.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBounce extends IAbstract {
  /** [Method] Returns the value of acceleration
    * @returns Number
    */
  var getAcceleration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of springTension
    * @returns Number
    */
  var getSpringTension: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of startVelocity
    * @returns Number
    */
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of acceleration
    * @param acceleration Number The new value.
    */
  var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of springTension
    * @param springTension Number The new value.
    */
  var setSpringTension: js.UndefOr[js.Function1[/* springTension */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of startVelocity
    * @param startVelocity Number The new value.
    */
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.native
}

object IBounce {
  @scala.inline
  def apply(): IBounce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBounce]
  }
  @scala.inline
  implicit class IBounceOps[Self <: IBounce] (val x: Self) extends AnyVal {
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
    def setGetSpringTension(value: () => Double): Self = this.set("getSpringTension", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSpringTension: Self = this.set("getSpringTension", js.undefined)
    @scala.inline
    def setGetStartVelocity(value: () => Double): Self = this.set("getStartVelocity", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStartVelocity: Self = this.set("getStartVelocity", js.undefined)
    @scala.inline
    def setSetAcceleration(value: /* acceleration */ js.UndefOr[Double] => Unit): Self = this.set("setAcceleration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAcceleration: Self = this.set("setAcceleration", js.undefined)
    @scala.inline
    def setSetSpringTension(value: /* springTension */ js.UndefOr[Double] => Unit): Self = this.set("setSpringTension", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSpringTension: Self = this.set("setSpringTension", js.undefined)
    @scala.inline
    def setSetStartVelocity(value: /* startVelocity */ js.UndefOr[Double] => Unit): Self = this.set("setStartVelocity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStartVelocity: Self = this.set("setStartVelocity", js.undefined)
  }
  
}

