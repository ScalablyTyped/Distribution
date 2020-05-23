package typings.stackUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackLineData extends StackData {
  var evalColumn: js.UndefOr[Double] = js.undefined
  var evalFile: js.UndefOr[String] = js.undefined
  var evalLine: js.UndefOr[Double] = js.undefined
}

object StackLineData {
  @scala.inline
  def apply(
    column: js.UndefOr[Double] = js.undefined,
    constructor: js.UndefOr[Boolean] = js.undefined,
    evalColumn: js.UndefOr[Double] = js.undefined,
    evalFile: String = null,
    evalLine: js.UndefOr[Double] = js.undefined,
    evalOrigin: String = null,
    file: String = null,
    function: String = null,
    line: js.UndefOr[Double] = js.undefined,
    method: String = null,
    native: js.UndefOr[Boolean] = js.undefined
  ): StackLineData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evalColumn)) __obj.updateDynamic("evalColumn")(evalColumn.get.asInstanceOf[js.Any])
    if (evalFile != null) __obj.updateDynamic("evalFile")(evalFile.asInstanceOf[js.Any])
    if (!js.isUndefined(evalLine)) __obj.updateDynamic("evalLine")(evalLine.get.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackLineData]
  }
}

