package typings.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILongPress extends IRecognizer {
  /** [Method] Returns the value of minDuration
    * @returns Number
    */
  var getMinDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of minDuration
    * @param minDuration Number The new value.
    */
  var setMinDuration: js.UndefOr[js.Function1[/* minDuration */ js.UndefOr[Double], Unit]] = js.native
}

object ILongPress {
  @scala.inline
  def apply(): ILongPress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILongPress]
  }
  @scala.inline
  implicit class ILongPressOps[Self <: ILongPress] (val x: Self) extends AnyVal {
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
    def setGetMinDuration(value: () => Double): Self = this.set("getMinDuration", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinDuration: Self = this.set("getMinDuration", js.undefined)
    @scala.inline
    def setSetMinDuration(value: /* minDuration */ js.UndefOr[Double] => Unit): Self = this.set("setMinDuration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinDuration: Self = this.set("setMinDuration", js.undefined)
  }
  
}

