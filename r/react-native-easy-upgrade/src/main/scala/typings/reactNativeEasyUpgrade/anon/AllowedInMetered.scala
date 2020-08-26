package typings.reactNativeEasyUpgrade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedInMetered extends js.Object {
  var allowedInMetered: js.UndefOr[Boolean] = js.native
  var allowedInRoaming: js.UndefOr[Boolean] = js.native
  var downloadDescription: js.UndefOr[String] = js.native
  var downloadTitle: js.UndefOr[String] = js.native
  var external: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var saveAsName: js.UndefOr[String] = js.native
  var showInDownloads: js.UndefOr[Boolean] = js.native
  var tempDownloadPath: String = js.native
}

object AllowedInMetered {
  @scala.inline
  def apply(tempDownloadPath: String): AllowedInMetered = {
    val __obj = js.Dynamic.literal(tempDownloadPath = tempDownloadPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedInMetered]
  }
  @scala.inline
  implicit class AllowedInMeteredOps[Self <: AllowedInMetered] (val x: Self) extends AnyVal {
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
    def setTempDownloadPath(value: String): Self = this.set("tempDownloadPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedInMetered(value: Boolean): Self = this.set("allowedInMetered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedInMetered: Self = this.set("allowedInMetered", js.undefined)
    @scala.inline
    def setAllowedInRoaming(value: Boolean): Self = this.set("allowedInRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedInRoaming: Self = this.set("allowedInRoaming", js.undefined)
    @scala.inline
    def setDownloadDescription(value: String): Self = this.set("downloadDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadDescription: Self = this.set("downloadDescription", js.undefined)
    @scala.inline
    def setDownloadTitle(value: String): Self = this.set("downloadTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadTitle: Self = this.set("downloadTitle", js.undefined)
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSaveAsName(value: String): Self = this.set("saveAsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveAsName: Self = this.set("saveAsName", js.undefined)
    @scala.inline
    def setShowInDownloads(value: Boolean): Self = this.set("showInDownloads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInDownloads: Self = this.set("showInDownloads", js.undefined)
  }
  
}

