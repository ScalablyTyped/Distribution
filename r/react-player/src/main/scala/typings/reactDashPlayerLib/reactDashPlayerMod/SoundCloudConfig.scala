package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundCloudConfig extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
}

object SoundCloudConfig {
  @scala.inline
  def apply(options: js.Object = null): SoundCloudConfig = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[SoundCloudConfig]
  }
}

