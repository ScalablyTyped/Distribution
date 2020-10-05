package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationOptions extends js.Object {
  var actions: js.UndefOr[js.Array[NotificationAction]] = js.native
  var badge: js.UndefOr[java.lang.String] = js.native
  var body: js.UndefOr[java.lang.String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dir: js.UndefOr[NotificationDirection] = js.native
  var icon: js.UndefOr[java.lang.String] = js.native
  var image: js.UndefOr[java.lang.String] = js.native
  var lang: js.UndefOr[java.lang.String] = js.native
  var renotify: js.UndefOr[scala.Boolean] = js.native
  var requireInteraction: js.UndefOr[scala.Boolean] = js.native
  var silent: js.UndefOr[scala.Boolean] = js.native
  var tag: js.UndefOr[java.lang.String] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var vibrate: js.UndefOr[VibratePattern] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: NotificationAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[NotificationAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setBadge(value: java.lang.String): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBody(value: java.lang.String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDir(value: NotificationDirection): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setIcon(value: java.lang.String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImage(value: java.lang.String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLang(value: java.lang.String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setRenotify(value: scala.Boolean): Self = this.set("renotify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenotify: Self = this.set("renotify", js.undefined)
    @scala.inline
    def setRequireInteraction(value: scala.Boolean): Self = this.set("requireInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireInteraction: Self = this.set("requireInteraction", js.undefined)
    @scala.inline
    def setSilent(value: scala.Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setTag(value: java.lang.String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setVibrateVarargs(value: Double*): Self = this.set("vibrate", js.Array(value :_*))
    @scala.inline
    def setVibrate(value: VibratePattern): Self = this.set("vibrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
  }
  
}

