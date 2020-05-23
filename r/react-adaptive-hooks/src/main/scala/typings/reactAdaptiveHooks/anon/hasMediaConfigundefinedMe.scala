package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  hasMediaConfig ? :undefined} & react-adaptive-hooks.react-adaptive-hooks/media-capabilities.MediaConfigurationInfo */
trait hasMediaConfigundefinedMe extends js.Object {
  var hasMediaConfig: js.UndefOr[scala.Nothing] = js.undefined
  var powerEfficient: Boolean
  var smooth: Boolean
  var supported: Boolean
}

object hasMediaConfigundefinedMe {
  @scala.inline
  def apply(powerEfficient: Boolean, smooth: Boolean, supported: Boolean): hasMediaConfigundefinedMe = {
    val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[hasMediaConfigundefinedMe]
  }
}

