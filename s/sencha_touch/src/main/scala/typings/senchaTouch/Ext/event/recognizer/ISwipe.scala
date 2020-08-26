package typings.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwipe extends IRecognizer {
  /** [Method] Returns the value of maxDuration
    * @returns Number
    */
  var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxOffset
    * @returns Number
    */
  var getMaxOffset: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minDistance
    * @returns Number
    */
  var getMinDistance: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of maxDuration
    * @param maxDuration Number The new value.
    */
  var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxOffset
    * @param maxOffset Number The new value.
    */
  var setMaxOffset: js.UndefOr[js.Function1[/* maxOffset */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minDistance
    * @param minDistance Number The new value.
    */
  var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.native
}

object ISwipe {
  @scala.inline
  def apply(): ISwipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwipe]
  }
  @scala.inline
  implicit class ISwipeOps[Self <: ISwipe] (val x: Self) extends AnyVal {
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
    def setGetMaxDuration(value: () => Double): Self = this.set("getMaxDuration", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxDuration: Self = this.set("getMaxDuration", js.undefined)
    @scala.inline
    def setGetMaxOffset(value: () => Double): Self = this.set("getMaxOffset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxOffset: Self = this.set("getMaxOffset", js.undefined)
    @scala.inline
    def setGetMinDistance(value: () => Double): Self = this.set("getMinDistance", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinDistance: Self = this.set("getMinDistance", js.undefined)
    @scala.inline
    def setSetMaxDuration(value: /* maxDuration */ js.UndefOr[Double] => Unit): Self = this.set("setMaxDuration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxDuration: Self = this.set("setMaxDuration", js.undefined)
    @scala.inline
    def setSetMaxOffset(value: /* maxOffset */ js.UndefOr[Double] => Unit): Self = this.set("setMaxOffset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxOffset: Self = this.set("setMaxOffset", js.undefined)
    @scala.inline
    def setSetMinDistance(value: /* minDistance */ js.UndefOr[Double] => Unit): Self = this.set("setMinDistance", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinDistance: Self = this.set("setMinDistance", js.undefined)
  }
  
}

