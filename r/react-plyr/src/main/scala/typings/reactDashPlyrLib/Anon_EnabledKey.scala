package typings
package reactDashPlyrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledKey extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EnabledKey {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, key: java.lang.String = null): Anon_EnabledKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_EnabledKey]
  }
}

