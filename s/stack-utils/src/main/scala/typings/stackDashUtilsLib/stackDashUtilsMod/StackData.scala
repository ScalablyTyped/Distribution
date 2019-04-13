package typings
package stackDashUtilsLib.stackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackData extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var constructor: js.UndefOr[scala.Boolean] = js.undefined
  var evalOrigin: js.UndefOr[java.lang.String] = js.undefined
  var file: js.UndefOr[java.lang.String] = js.undefined
  var function: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var native: js.UndefOr[scala.Boolean] = js.undefined
}

object StackData {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    constructor: js.UndefOr[scala.Boolean] = js.undefined,
    evalOrigin: java.lang.String = null,
    file: java.lang.String = null,
    function: java.lang.String = null,
    line: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    native: js.UndefOr[scala.Boolean] = js.undefined
  ): StackData = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor)
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin)
    if (file != null) __obj.updateDynamic("file")(file)
    if (function != null) __obj.updateDynamic("function")(function)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    __obj.asInstanceOf[StackData]
  }
}

