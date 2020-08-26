package typings.reactNativeVersionCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNeeded extends js.Object {
  var currentVersion: String = js.native
  var isNeeded: Boolean = js.native
  var latestVersion: String = js.native
  var storeUrl: String = js.native
}

object IsNeeded {
  @scala.inline
  def apply(currentVersion: String, isNeeded: Boolean, latestVersion: String, storeUrl: String): IsNeeded = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], isNeeded = isNeeded.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], storeUrl = storeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNeeded]
  }
  @scala.inline
  implicit class IsNeededOps[Self <: IsNeeded] (val x: Self) extends AnyVal {
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
    def setCurrentVersion(value: String): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNeeded(value: Boolean): Self = this.set("isNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestVersion(value: String): Self = this.set("latestVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreUrl(value: String): Self = this.set("storeUrl", value.asInstanceOf[js.Any])
  }
  
}

