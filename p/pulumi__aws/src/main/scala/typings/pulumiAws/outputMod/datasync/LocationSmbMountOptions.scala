package typings.pulumiAws.outputMod.datasync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationSmbMountOptions extends js.Object {
  /**
    * The specific SMB version that you want DataSync to use for mounting your SMB share. Valid values: `AUTOMATIC`, `SMB2`, and `SMB3`. Default: `AUTOMATIC`
    */
  var version: js.UndefOr[String] = js.native
}

object LocationSmbMountOptions {
  @scala.inline
  def apply(): LocationSmbMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationSmbMountOptions]
  }
  @scala.inline
  implicit class LocationSmbMountOptionsOps[Self <: LocationSmbMountOptions] (val x: Self) extends AnyVal {
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

