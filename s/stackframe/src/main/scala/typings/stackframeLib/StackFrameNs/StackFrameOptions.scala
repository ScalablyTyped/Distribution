package typings
package stackframeLib.StackFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrameOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var functionName: js.UndefOr[java.lang.String] = js.undefined
  var isConstructor: js.UndefOr[scala.Boolean] = js.undefined
  var isEval: js.UndefOr[scala.Boolean] = js.undefined
  var isNative: js.UndefOr[scala.Boolean] = js.undefined
  var isToplevel: js.UndefOr[scala.Boolean] = js.undefined
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object StackFrameOptions {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    columnNumber: scala.Int | scala.Double = null,
    fileName: java.lang.String = null,
    functionName: java.lang.String = null,
    isConstructor: js.UndefOr[scala.Boolean] = js.undefined,
    isEval: js.UndefOr[scala.Boolean] = js.undefined,
    isNative: js.UndefOr[scala.Boolean] = js.undefined,
    isToplevel: js.UndefOr[scala.Boolean] = js.undefined,
    lineNumber: scala.Int | scala.Double = null,
    source: java.lang.String = null
  ): StackFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (!js.isUndefined(isConstructor)) __obj.updateDynamic("isConstructor")(isConstructor)
    if (!js.isUndefined(isEval)) __obj.updateDynamic("isEval")(isEval)
    if (!js.isUndefined(isNative)) __obj.updateDynamic("isNative")(isNative)
    if (!js.isUndefined(isToplevel)) __obj.updateDynamic("isToplevel")(isToplevel)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[StackFrameOptions]
  }
}

