package typings.senchaTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea extends IText {
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: IText = null,
    getMaxRows: () => Double = null,
    maxRows: Int | Double = null,
    setMaxRows: /* maxRows */ js.UndefOr[Double] => Unit = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    if (getMaxRows != null) __obj.updateDynamic("getMaxRows")(js.Any.fromFunction0(getMaxRows))
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (setMaxRows != null) __obj.updateDynamic("setMaxRows")(js.Any.fromFunction1(setMaxRows))
    __obj.asInstanceOf[ITextArea]
  }
}

