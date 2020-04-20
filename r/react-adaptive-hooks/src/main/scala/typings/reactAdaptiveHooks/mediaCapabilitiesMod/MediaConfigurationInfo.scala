package typings.reactAdaptiveHooks.mediaCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigurationInfo extends js.Object {
  var powerEfficient: Boolean
  var smooth: Boolean
  var supported: Boolean
}

object MediaConfigurationInfo {
  @scala.inline
  def apply(powerEfficient: Boolean, smooth: Boolean, supported: Boolean): MediaConfigurationInfo = {
    val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigurationInfo]
  }
}

