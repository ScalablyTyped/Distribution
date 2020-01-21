package typings.pulumiPulumi.createClosureMod

import typings.pulumiPulumi.AnonFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var array: js.UndefOr[js.Array[Entry]] = js.undefined
  var expr: js.UndefOr[String] = js.undefined
  var function: js.UndefOr[FunctionInfo] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  var module: js.UndefOr[String] = js.undefined
  var `object`: js.UndefOr[ObjectInfo] = js.undefined
  var output: js.UndefOr[Entry] = js.undefined
  var promise: js.UndefOr[Entry] = js.undefined
  var regexp: js.UndefOr[AnonFlags] = js.undefined
}

object Entry {
  @scala.inline
  def apply(
    array: js.Array[Entry] = null,
    expr: String = null,
    function: FunctionInfo = null,
    json: js.Any = null,
    module: String = null,
    `object`: ObjectInfo = null,
    output: Entry = null,
    promise: Entry = null,
    regexp: AnonFlags = null
  ): Entry = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (expr != null) __obj.updateDynamic("expr")(expr.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

