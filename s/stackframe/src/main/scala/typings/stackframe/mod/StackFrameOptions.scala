package typings.stackframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrameOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var functionName: js.UndefOr[String] = js.undefined
  var isConstructor: js.UndefOr[Boolean] = js.undefined
  var isEval: js.UndefOr[Boolean] = js.undefined
  var isNative: js.UndefOr[Boolean] = js.undefined
  var isToplevel: js.UndefOr[Boolean] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object StackFrameOptions {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    columnNumber: js.UndefOr[Double] = js.undefined,
    fileName: String = null,
    functionName: String = null,
    isConstructor: js.UndefOr[Boolean] = js.undefined,
    isEval: js.UndefOr[Boolean] = js.undefined,
    isNative: js.UndefOr[Boolean] = js.undefined,
    isToplevel: js.UndefOr[Boolean] = js.undefined,
    lineNumber: js.UndefOr[Double] = js.undefined,
    source: String = null
  ): StackFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(columnNumber)) __obj.updateDynamic("columnNumber")(columnNumber.get.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructor)) __obj.updateDynamic("isConstructor")(isConstructor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEval)) __obj.updateDynamic("isEval")(isEval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isNative)) __obj.updateDynamic("isNative")(isNative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isToplevel)) __obj.updateDynamic("isToplevel")(isToplevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrameOptions]
  }
}

