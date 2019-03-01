package typings
package stackDashUtilsLib.stackDashUtilsMod.StackUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSiteLike extends StackData {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CallSiteLike {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    constructor: js.UndefOr[scala.Boolean] = js.undefined,
    evalOrigin: java.lang.String = null,
    file: java.lang.String = null,
    function: java.lang.String = null,
    line: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    native: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): CallSiteLike = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor)
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin)
    if (file != null) __obj.updateDynamic("file")(file)
    if (function != null) __obj.updateDynamic("function")(function)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallSiteLike]
  }
}

