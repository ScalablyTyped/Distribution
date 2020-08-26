package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationOptions extends js.Object {
  var scope: js.UndefOr[java.lang.String] = js.native
  var `type`: js.UndefOr[WorkerType] = js.native
  var updateViaCache: js.UndefOr[ServiceWorkerUpdateViaCache] = js.native
}

object RegistrationOptions {
  @scala.inline
  def apply(): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOptions]
  }
  @scala.inline
  implicit class RegistrationOptionsOps[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScope(value: java.lang.String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setType(value: WorkerType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateViaCache(value: ServiceWorkerUpdateViaCache): Self = this.set("updateViaCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateViaCache: Self = this.set("updateViaCache", js.undefined)
  }
  
}

