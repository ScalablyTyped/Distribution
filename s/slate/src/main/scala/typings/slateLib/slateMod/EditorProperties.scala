package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProperties extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* change */ slateLib.Anon_Operations, scala.Unit]] = js.undefined
  var plugins: js.UndefOr[Plugins] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
}

object EditorProperties {
  @scala.inline
  def apply(
    onChange: /* change */ slateLib.Anon_Operations => scala.Unit = null,
    plugins: Plugins = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    value: Value = null
  ): EditorProperties = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditorProperties]
  }
}

