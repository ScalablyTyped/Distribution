package typings.stackDashUtils.stackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackData extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var constructor: js.UndefOr[Boolean] = js.undefined
  var evalOrigin: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var function: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
}

object StackData {
  @scala.inline
  def apply(
    column: Int | Double = null,
    constructor: js.UndefOr[Boolean] = js.undefined,
    evalOrigin: String = null,
    file: String = null,
    function: String = null,
    line: Int | Double = null,
    method: String = null,
    native: js.UndefOr[Boolean] = js.undefined
  ): StackData = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackData]
  }
}

