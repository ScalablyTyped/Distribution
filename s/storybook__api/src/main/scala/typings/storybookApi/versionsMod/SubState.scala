package typings.storybookApi.versionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubState extends js.Object {
  var dismissedVersionNotification: js.UndefOr[String] = js.native
  var lastVersionCheck: Double = js.native
  var versions: Versions with UnknownEntries = js.native
}

object SubState {
  @scala.inline
  def apply(lastVersionCheck: Double, versions: Versions with UnknownEntries): SubState = {
    val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
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
    def setLastVersionCheck(value: Double): Self = this.set("lastVersionCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersions(value: Versions with UnknownEntries): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDismissedVersionNotification(value: String): Self = this.set("dismissedVersionNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissedVersionNotification: Self = this.set("dismissedVersionNotification", js.undefined)
  }
  
}

