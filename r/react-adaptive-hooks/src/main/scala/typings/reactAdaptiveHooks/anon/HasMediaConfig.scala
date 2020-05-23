package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasMediaConfig extends js.Object {
  var hasMediaConfig: Boolean
  var supported: Boolean
}

object HasMediaConfig {
  @scala.inline
  def apply(hasMediaConfig: Boolean, supported: Boolean): HasMediaConfig = {
    val __obj = js.Dynamic.literal(hasMediaConfig = hasMediaConfig.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasMediaConfig]
  }
}

