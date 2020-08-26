package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeFrom extends js.Object {
  var readOnly: js.UndefOr[Boolean] = js.native
  var sourceContainer: js.UndefOr[String] = js.native
}

object VolumeFrom {
  @scala.inline
  def apply(): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeFrom]
  }
  @scala.inline
  implicit class VolumeFromOps[Self <: VolumeFrom] (val x: Self) extends AnyVal {
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
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setSourceContainer(value: String): Self = this.set("sourceContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceContainer: Self = this.set("sourceContainer", js.undefined)
  }
  
}

