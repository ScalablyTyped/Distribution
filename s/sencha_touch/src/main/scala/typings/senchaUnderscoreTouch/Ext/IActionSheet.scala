package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSheet extends ISheet {
  /** [Method] Returns the value of bottom
  		* @returns Number
  		*/
  @JSName("getBottom")
  var getBottom_IActionSheet: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of height
  		* @returns String
  		*/
  @JSName("getHeight")
  var getHeight_IActionSheet: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of left
  		* @returns Number
  		*/
  @JSName("getLeft")
  var getLeft_IActionSheet: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of right
  		* @returns Number
  		*/
  @JSName("getRight")
  var getRight_IActionSheet: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of bottom
  		* @param bottom Number The new value.
  		*/
  @JSName("setBottom")
  var setBottom_IActionSheet: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of height
  		* @param height String The new value.
  		*/
  @JSName("setHeight")
  var setHeight_IActionSheet: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of left
  		* @param left Number The new value.
  		*/
  @JSName("setLeft")
  var setLeft_IActionSheet: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of right
  		* @param right Number The new value.
  		*/
  @JSName("setRight")
  var setRight_IActionSheet: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.undefined
}

object IActionSheet {
  @scala.inline
  def apply(
    ISheet: ISheet = null,
    getBottom: () => Double = null,
    getHeight: () => java.lang.String = null,
    getLeft: () => Double = null,
    getRight: () => Double = null,
    setBottom: /* bottom */ js.UndefOr[Double] => Unit = null,
    setHeight: /* height */ js.UndefOr[java.lang.String] => Unit = null,
    setLeft: /* left */ js.UndefOr[Double] => Unit = null,
    setRight: /* right */ js.UndefOr[Double] => Unit = null
  ): IActionSheet = {
    val __obj = js.Dynamic.literal()
    if (ISheet != null) js.Dynamic.global.Object.assign(__obj, ISheet)
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction0(getHeight))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    __obj.asInstanceOf[IActionSheet]
  }
}

