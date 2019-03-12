package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenu extends ISheet {
  /** [Method] Only fire the hide event if it is initialized */
  var doSetHidden: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of bottom
  		* @returns Number
  		*/
  @JSName("getBottom")
  var getBottom_IMenu: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of height
  		* @returns String
  		*/
  @JSName("getHeight")
  var getHeight_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of left
  		* @returns Number
  		*/
  @JSName("getLeft")
  var getLeft_IMenu: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of right
  		* @returns Number
  		*/
  @JSName("getRight")
  var getRight_IMenu: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of width
  		* @returns String
  		*/
  @JSName("getWidth")
  var getWidth_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of bottom
  		* @param bottom Number The new value.
  		*/
  @JSName("setBottom")
  var setBottom_IMenu: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of height
  		* @param height String The new value.
  		*/
  @JSName("setHeight")
  var setHeight_IMenu: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of left
  		* @param left Number The new value.
  		*/
  @JSName("setLeft")
  var setLeft_IMenu: js.UndefOr[js.Function1[/* left */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of right
  		* @param right Number The new value.
  		*/
  @JSName("setRight")
  var setRight_IMenu: js.UndefOr[js.Function1[/* right */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of width
  		* @param width String The new value.
  		*/
  @JSName("setWidth")
  var setWidth_IMenu: js.UndefOr[js.Function1[/* width */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IMenu {
  @scala.inline
  def apply(
    ISheet: ISheet = null,
    baseCls: java.lang.String = null,
    bottom: js.Any = null,
    defaultType: java.lang.String = null,
    doSetHidden: () => scala.Unit = null,
    getBaseCls: () => java.lang.String = null,
    getBottom: () => scala.Double = null,
    getDefaultType: () => java.lang.String = null,
    getHeight: () => java.lang.String = null,
    getLeft: () => scala.Double = null,
    getRight: () => scala.Double = null,
    getWidth: () => java.lang.String = null,
    height: js.Any = null,
    left: js.Any = null,
    right: js.Any = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setBottom: /* bottom */ js.UndefOr[scala.Double] => scala.Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHeight: /* height */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLeft: /* left */ js.UndefOr[scala.Double] => scala.Unit = null,
    setRight: /* right */ js.UndefOr[scala.Double] => scala.Unit = null,
    setWidth: /* width */ js.UndefOr[java.lang.String] => scala.Unit = null,
    width: js.Any = null
  ): IMenu = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISheet)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (doSetHidden != null) __obj.updateDynamic("doSetHidden")(js.Any.fromFunction0(doSetHidden))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction0(getHeight))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IMenu]
  }
}

