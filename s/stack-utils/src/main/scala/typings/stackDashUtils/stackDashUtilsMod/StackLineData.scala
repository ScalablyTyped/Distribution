package typings.stackDashUtils.stackDashUtilsMod

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
    column: Int | Double = null,
    constructor: js.UndefOr[Boolean] = js.undefined,
    evalColumn: Int | Double = null,
    evalFile: String = null,
    evalLine: Int | Double = null,
    evalOrigin: String = null,
    file: String = null,
    function: String = null,
    line: Int | Double = null,
    method: String = null,
    native: js.UndefOr[Boolean] = js.undefined
  ): StackLineData = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor)
    if (evalColumn != null) __obj.updateDynamic("evalColumn")(evalColumn.asInstanceOf[js.Any])
    if (evalFile != null) __obj.updateDynamic("evalFile")(evalFile)
    if (evalLine != null) __obj.updateDynamic("evalLine")(evalLine.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin)
    if (file != null) __obj.updateDynamic("file")(file)
    if (function != null) __obj.updateDynamic("function")(function)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    __obj.asInstanceOf[StackLineData]
  }
}

