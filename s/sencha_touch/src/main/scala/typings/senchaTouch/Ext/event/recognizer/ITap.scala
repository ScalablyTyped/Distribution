package typings.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITap extends IRecognizer {
  /** [Method] Returns the value of moveDistance
    * @returns Number
    */
  var getMoveDistance: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var moveDistance: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of moveDistance
    * @param moveDistance Number The new value.
    */
  var setMoveDistance: js.UndefOr[js.Function1[/* moveDistance */ js.UndefOr[Double], Unit]] = js.native
}

object ITap {
  @scala.inline
  def apply(): ITap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITap]
  }
  @scala.inline
  implicit class ITapOps[Self <: ITap] (val x: Self) extends AnyVal {
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
    def setGetMoveDistance(value: () => Double): Self = this.set("getMoveDistance", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMoveDistance: Self = this.set("getMoveDistance", js.undefined)
    @scala.inline
    def setMoveDistance(value: Double): Self = this.set("moveDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveDistance: Self = this.set("moveDistance", js.undefined)
    @scala.inline
    def setSetMoveDistance(value: /* moveDistance */ js.UndefOr[Double] => Unit): Self = this.set("setMoveDistance", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMoveDistance: Self = this.set("setMoveDistance", js.undefined)
  }
  
}

