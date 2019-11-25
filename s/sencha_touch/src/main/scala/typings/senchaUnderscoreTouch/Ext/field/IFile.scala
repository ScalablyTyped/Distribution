package typings.senchaUnderscoreTouch.Ext.field

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
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of accept
  		* @param accept String The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of capture
  		* @param capture String The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IFile {
  @scala.inline
  def apply(
    IField: IField = null,
    accept: java.lang.String = null,
    capture: java.lang.String = null,
    getAccept: () => java.lang.String = null,
    getCapture: () => java.lang.String = null,
    getMultiple: () => Boolean = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    setAccept: /* accept */ js.UndefOr[java.lang.String] => Unit = null,
    setCapture: /* capture */ js.UndefOr[java.lang.String] => Unit = null,
    setMultiple: /* multiple */ js.UndefOr[Boolean] => Unit = null
  ): IFile = {
    val __obj = js.Dynamic.literal()
    if (IField != null) js.Dynamic.global.Object.assign(__obj, IField)
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (getAccept != null) __obj.updateDynamic("getAccept")(js.Any.fromFunction0(getAccept))
    if (getCapture != null) __obj.updateDynamic("getCapture")(js.Any.fromFunction0(getCapture))
    if (getMultiple != null) __obj.updateDynamic("getMultiple")(js.Any.fromFunction0(getMultiple))
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (setAccept != null) __obj.updateDynamic("setAccept")(js.Any.fromFunction1(setAccept))
    if (setCapture != null) __obj.updateDynamic("setCapture")(js.Any.fromFunction1(setCapture))
    if (setMultiple != null) __obj.updateDynamic("setMultiple")(js.Any.fromFunction1(setMultiple))
    __obj.asInstanceOf[IFile]
  }
}

