package typings.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasMediaConfig extends js.Object {
  var hasMediaConfig: Boolean
  var supported: Boolean
}

object AnonHasMediaConfig {
  @scala.inline
  def apply(hasMediaConfig: Boolean, supported: Boolean): AnonHasMediaConfig = {
    val __obj = js.Dynamic.literal(hasMediaConfig = hasMediaConfig.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasMediaConfig]
  }
}

