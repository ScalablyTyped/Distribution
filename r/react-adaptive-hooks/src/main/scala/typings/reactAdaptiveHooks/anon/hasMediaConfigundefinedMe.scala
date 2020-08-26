package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  hasMediaConfig :undefined} & react-adaptive-hooks.react-adaptive-hooks/media-capabilities.MediaConfigurationInfo */
@js.native
trait hasMediaConfigundefinedMe extends js.Object {
  var hasMediaConfig: js.UndefOr[scala.Nothing] = js.native
  var powerEfficient: Boolean = js.native
  var smooth: Boolean = js.native
  var supported: Boolean = js.native
}

object hasMediaConfigundefinedMe {
  @scala.inline
  def apply(powerEfficient: Boolean, smooth: Boolean, supported: Boolean): hasMediaConfigundefinedMe = {
    val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[hasMediaConfigundefinedMe]
  }
  @scala.inline
  implicit class hasMediaConfigundefinedMeOps[Self <: hasMediaConfigundefinedMe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPowerEfficient(value: Boolean): Self = this.set("powerEfficient", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
  
}

