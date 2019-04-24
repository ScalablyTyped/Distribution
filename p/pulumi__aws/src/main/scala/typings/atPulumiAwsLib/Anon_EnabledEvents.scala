package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledEvents extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_EnabledEvents {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, events: js.Array[java.lang.String] = null): Anon_EnabledEvents = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[Anon_EnabledEvents]
  }
}

