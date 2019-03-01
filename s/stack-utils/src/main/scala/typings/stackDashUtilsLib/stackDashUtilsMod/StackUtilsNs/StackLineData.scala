package typings
package stackDashUtilsLib.stackDashUtilsMod.StackUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackLineData extends StackData {
  var evalColumn: js.UndefOr[scala.Double] = js.undefined
  var evalFile: js.UndefOr[java.lang.String] = js.undefined
  var evalLine: js.UndefOr[scala.Double] = js.undefined
}

object StackLineData {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    constructor: js.UndefOr[scala.Boolean] = js.undefined,
    evalColumn: scala.Int | scala.Double = null,
    evalFile: java.lang.String = null,
    evalLine: scala.Int | scala.Double = null,
    evalOrigin: java.lang.String = null,
    file: java.lang.String = null,
    function: java.lang.String = null,
    line: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    native: js.UndefOr[scala.Boolean] = js.undefined
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

