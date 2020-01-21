package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostProperties extends js.Object {
  /**
    * The operating system of the host.
    *
    * Default is "linux".
    */
  var os: js.UndefOr[HostOperatingSystem] = js.undefined
}

object HostProperties {
  @scala.inline
  def apply(os: HostOperatingSystem = null): HostProperties = {
    val __obj = js.Dynamic.literal()
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostProperties]
  }
}

