package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledProcessors extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var processors: js.UndefOr[js.Array[Anon_Parameters]] = js.undefined
}

object Anon_EnabledProcessors {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, processors: js.Array[Anon_Parameters] = null): Anon_EnabledProcessors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (processors != null) __obj.updateDynamic("processors")(processors)
    __obj.asInstanceOf[Anon_EnabledProcessors]
  }
}

