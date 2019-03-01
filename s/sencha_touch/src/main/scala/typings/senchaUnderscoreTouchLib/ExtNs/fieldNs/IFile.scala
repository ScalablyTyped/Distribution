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
    getAccept: js.Function0[java.lang.String] = null,
    getCapture: js.Function0[java.lang.String] = null,
    getComponent: js.Function0[_] = null,
    getMultiple: js.Function0[scala.Boolean] = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    setAccept: js.Function1[/* accept */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setCapture: js.Function1[/* capture */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setMultiple: js.Function1[/* multiple */ js.UndefOr[scala.Boolean], scala.Unit] = null
  ): IFile = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAccept != null) __obj.updateDynamic("getAccept")(getAccept)
    if (getCapture != null) __obj.updateDynamic("getCapture")(getCapture)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getMultiple != null) __obj.updateDynamic("getMultiple")(getMultiple)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (setAccept != null) __obj.updateDynamic("setAccept")(setAccept)
    if (setCapture != null) __obj.updateDynamic("setCapture")(setCapture)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setMultiple != null) __obj.updateDynamic("setMultiple")(setMultiple)
    __obj.asInstanceOf[IFile]
  }
}

