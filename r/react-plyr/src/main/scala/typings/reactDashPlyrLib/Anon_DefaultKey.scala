package typings
package reactDashPlyrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultKey extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var src: java.lang.String
  var srclang: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DefaultKey {
  @scala.inline
  def apply(
    src: java.lang.String,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.Any = null,
    kind: java.lang.String = null,
    label: java.lang.String = null,
    srclang: java.lang.String = null
  ): Anon_DefaultKey = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (key != null) __obj.updateDynamic("key")(key)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (label != null) __obj.updateDynamic("label")(label)
    if (srclang != null) __obj.updateDynamic("srclang")(srclang)
    __obj.asInstanceOf[Anon_DefaultKey]
  }
}

