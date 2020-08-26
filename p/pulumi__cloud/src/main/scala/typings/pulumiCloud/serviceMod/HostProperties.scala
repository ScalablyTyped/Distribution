package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostProperties extends js.Object {
  /**
    * The operating system of the host.
    *
    * Default is "linux".
    */
  var os: js.UndefOr[HostOperatingSystem] = js.native
}

object HostProperties {
  @scala.inline
  def apply(): HostProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProperties]
  }
  @scala.inline
  implicit class HostPropertiesOps[Self <: HostProperties] (val x: Self) extends AnyVal {
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
    def setOs(value: HostOperatingSystem): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
  }
  
}

