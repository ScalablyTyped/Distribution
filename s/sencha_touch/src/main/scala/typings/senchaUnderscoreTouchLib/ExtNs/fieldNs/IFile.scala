package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFile extends IField {
  /** [Config Option] (String) */
  var accept: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var capture: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of accept
  		* @returns String
  		*/
  var getAccept: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of capture
  		* @returns String
  		*/
  var getCapture: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of accept
  		* @param accept String The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of capture
  		* @param capture String The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

object IFile {
  @scala.inline
  def apply(
    IField: IField = null,
    accept: java.lang.String = null,
    capture: java.lang.String = null,
    component: js.Any = null,
    getAccept: () => java.lang.String = null,
    getCapture: () => java.lang.String = null,
    getComponent: () => _ = null,
    getMultiple: () => scala.Boolean = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    setAccept: /* accept */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setCapture: /* capture */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setComponent: /* component */ js.UndefOr[js.Any] => scala.Unit = null,
    setMultiple: /* multiple */ js.UndefOr[scala.Boolean] => scala.Unit = null
  ): IFile = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAccept != null) __obj.updateDynamic("getAccept")(js.Any.fromFunction0(getAccept))
    if (getCapture != null) __obj.updateDynamic("getCapture")(js.Any.fromFunction0(getCapture))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getMultiple != null) __obj.updateDynamic("getMultiple")(js.Any.fromFunction0(getMultiple))
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (setAccept != null) __obj.updateDynamic("setAccept")(js.Any.fromFunction1(setAccept))
    if (setCapture != null) __obj.updateDynamic("setCapture")(js.Any.fromFunction1(setCapture))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setMultiple != null) __obj.updateDynamic("setMultiple")(js.Any.fromFunction1(setMultiple))
    __obj.asInstanceOf[IFile]
  }
}

