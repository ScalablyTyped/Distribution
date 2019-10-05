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
    baseCls: java.lang.String = null,
    bottom: js.Any = null,
    defaultType: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getBottom: () => Double = null,
    getDefaultType: () => java.lang.String = null,
    getHeight: () => java.lang.String = null,
    getLeft: () => Double = null,
    getRight: () => Double = null,
    height: js.Any = null,
    left: js.Any = null,
    right: js.Any = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setBottom: /* bottom */ js.UndefOr[Double] => Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => Unit = null,
    setHeight: /* height */ js.UndefOr[java.lang.String] => Unit = null,
    setLeft: /* left */ js.UndefOr[Double] => Unit = null,
    setRight: /* right */ js.UndefOr[Double] => Unit = null
  ): IActionSheet = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISheet)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction0(getHeight))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    __obj.asInstanceOf[IActionSheet]
  }
}

