package typings.senchaTouch.Ext.event.publisher

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITouchGesture extends IBase {
  /** [Method] Returns the value of moveThrottle
    * @returns Number
    */
  var getMoveThrottle: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of recognizers
    * @returns Object
    */
  var getRecognizers: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of moveThrottle
    * @param moveThrottle Number The new value.
    */
  var setMoveThrottle: js.UndefOr[js.Function1[/* moveThrottle */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of recognizers
    * @param recognizers Object The new value.
    */
  var setRecognizers: js.UndefOr[js.Function1[/* recognizers */ js.UndefOr[js.Any], Unit]] = js.native
}

object ITouchGesture {
  @scala.inline
  def apply(): ITouchGesture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITouchGesture]
  }
  @scala.inline
  implicit class ITouchGestureOps[Self <: ITouchGesture] (val x: Self) extends AnyVal {
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
    def setGetMoveThrottle(value: () => Double): Self = this.set("getMoveThrottle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMoveThrottle: Self = this.set("getMoveThrottle", js.undefined)
    @scala.inline
    def setGetRecognizers(value: () => _): Self = this.set("getRecognizers", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecognizers: Self = this.set("getRecognizers", js.undefined)
    @scala.inline
    def setSetMoveThrottle(value: /* moveThrottle */ js.UndefOr[Double] => Unit): Self = this.set("setMoveThrottle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMoveThrottle: Self = this.set("setMoveThrottle", js.undefined)
    @scala.inline
    def setSetRecognizers(value: /* recognizers */ js.UndefOr[js.Any] => Unit): Self = this.set("setRecognizers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRecognizers: Self = this.set("setRecognizers", js.undefined)
  }
  
}

