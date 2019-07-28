package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledBoolean extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object Anon_EnabledBoolean {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Anon_EnabledBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_EnabledBoolean]
  }
}

