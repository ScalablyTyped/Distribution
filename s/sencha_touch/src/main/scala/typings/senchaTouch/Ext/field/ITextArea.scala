package typings.senchaTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextArea extends IText {
  /** [Method] Returns the value of maxRows
    * @returns Number
    */
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of maxRows
    * @param maxRows Number The new value.
    */
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.native
}

object ITextArea {
  @scala.inline
  def apply(): ITextArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextArea]
  }
  @scala.inline
  implicit class ITextAreaOps[Self <: ITextArea] (val x: Self) extends AnyVal {
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
    def setGetMaxRows(value: () => Double): Self = this.set("getMaxRows", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxRows: Self = this.set("getMaxRows", js.undefined)
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    @scala.inline
    def setSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Unit): Self = this.set("setMaxRows", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxRows: Self = this.set("setMaxRows", js.undefined)
  }
  
}

