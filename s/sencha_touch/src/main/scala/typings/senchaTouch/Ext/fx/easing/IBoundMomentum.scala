package typings.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBoundMomentum extends IAbstract {
  /** [Config Option] (Object) */
  var bounce: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of bounce
    * @returns Object
    */
  var getBounce: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of maxMomentumValue
    * @returns Number
    */
  var getMaxMomentumValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minMomentumValue
    * @returns Number
    */
  var getMinMomentumValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minVelocity
    * @returns Number
    */
  var getMinVelocity: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of momentum
    * @returns Object
    */
  var getMomentum: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of startVelocity
    * @returns Number
    */
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var minVelocity: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var momentum: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of bounce
    * @param bounce Object The new value.
    */
  var setBounce: js.UndefOr[js.Function1[/* bounce */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxMomentumValue
    * @param maxMomentumValue Number The new value.
    */
  var setMaxMomentumValue: js.UndefOr[js.Function1[/* maxMomentumValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minMomentumValue
    * @param minMomentumValue Number The new value.
    */
  var setMinMomentumValue: js.UndefOr[js.Function1[/* minMomentumValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minVelocity
    * @param minVelocity Number The new value.
    */
  var setMinVelocity: js.UndefOr[js.Function1[/* minVelocity */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of momentum
    * @param momentum Object The new value.
    */
  var setMomentum: js.UndefOr[js.Function1[/* momentum */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of startVelocity
    * @param startVelocity Number The new value.
    */
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var startVelocity: js.UndefOr[Double] = js.native
}

object IBoundMomentum {
  @scala.inline
  def apply(): IBoundMomentum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundMomentum]
  }
  @scala.inline
  implicit class IBoundMomentumOps[Self <: IBoundMomentum] (val x: Self) extends AnyVal {
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
    def setBounce(value: js.Any): Self = this.set("bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    @scala.inline
    def setGetBounce(value: () => _): Self = this.set("getBounce", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBounce: Self = this.set("getBounce", js.undefined)
    @scala.inline
    def setGetMaxMomentumValue(value: () => Double): Self = this.set("getMaxMomentumValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxMomentumValue: Self = this.set("getMaxMomentumValue", js.undefined)
    @scala.inline
    def setGetMinMomentumValue(value: () => Double): Self = this.set("getMinMomentumValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinMomentumValue: Self = this.set("getMinMomentumValue", js.undefined)
    @scala.inline
    def setGetMinVelocity(value: () => Double): Self = this.set("getMinVelocity", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinVelocity: Self = this.set("getMinVelocity", js.undefined)
    @scala.inline
    def setGetMomentum(value: () => _): Self = this.set("getMomentum", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMomentum: Self = this.set("getMomentum", js.undefined)
    @scala.inline
    def setGetStartVelocity(value: () => Double): Self = this.set("getStartVelocity", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStartVelocity: Self = this.set("getStartVelocity", js.undefined)
    @scala.inline
    def setMinVelocity(value: Double): Self = this.set("minVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinVelocity: Self = this.set("minVelocity", js.undefined)
    @scala.inline
    def setMomentum(value: js.Any): Self = this.set("momentum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMomentum: Self = this.set("momentum", js.undefined)
    @scala.inline
    def setSetBounce(value: /* bounce */ js.UndefOr[js.Any] => Unit): Self = this.set("setBounce", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBounce: Self = this.set("setBounce", js.undefined)
    @scala.inline
    def setSetMaxMomentumValue(value: /* maxMomentumValue */ js.UndefOr[Double] => Unit): Self = this.set("setMaxMomentumValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxMomentumValue: Self = this.set("setMaxMomentumValue", js.undefined)
    @scala.inline
    def setSetMinMomentumValue(value: /* minMomentumValue */ js.UndefOr[Double] => Unit): Self = this.set("setMinMomentumValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinMomentumValue: Self = this.set("setMinMomentumValue", js.undefined)
    @scala.inline
    def setSetMinVelocity(value: /* minVelocity */ js.UndefOr[Double] => Unit): Self = this.set("setMinVelocity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinVelocity: Self = this.set("setMinVelocity", js.undefined)
    @scala.inline
    def setSetMomentum(value: /* momentum */ js.UndefOr[js.Any] => Unit): Self = this.set("setMomentum", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMomentum: Self = this.set("setMomentum", js.undefined)
    @scala.inline
    def setSetStartVelocity(value: /* startVelocity */ js.UndefOr[Double] => Unit): Self = this.set("setStartVelocity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStartVelocity: Self = this.set("setStartVelocity", js.undefined)
    @scala.inline
    def setStartVelocity(value: Double): Self = this.set("startVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartVelocity: Self = this.set("startVelocity", js.undefined)
  }
  
}

