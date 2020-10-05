package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: String = js.native
  var versions: Current = js.native
}

object DismissedVersionNotification {
  @scala.inline
  def apply(dismissedVersionNotification: String, versions: Current): DismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissedVersionNotification]
  }
  @scala.inline
  implicit class DismissedVersionNotificationOps[Self <: DismissedVersionNotification] (val x: Self) extends AnyVal {
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
    def setDismissedVersionNotification(value: String): Self = this.set("dismissedVersionNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersions(value: Current): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
  
}

