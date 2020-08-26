package typings.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var cacheSizeBytes: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var persistence: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
  var timestampsInSnapshots: js.UndefOr[Boolean] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setCacheSizeBytes(value: Double): Self = this.set("cacheSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSizeBytes: Self = this.set("cacheSizeBytes", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPersistence(value: Boolean): Self = this.set("persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence: Self = this.set("persistence", js.undefined)
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setTimestampsInSnapshots(value: Boolean): Self = this.set("timestampsInSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampsInSnapshots: Self = this.set("timestampsInSnapshots", js.undefined)
  }
  
}

