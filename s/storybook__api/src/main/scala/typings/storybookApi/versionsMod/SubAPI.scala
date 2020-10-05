package typings.storybookApi.versionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  def getCurrentVersion(): Version = js.native
  def getLatestVersion(): Version = js.native
  def versionUpdateAvailable(): Boolean = js.native
}

object SubAPI {
  @scala.inline
  def apply(
    getCurrentVersion: () => Version,
    getLatestVersion: () => Version,
    versionUpdateAvailable: () => Boolean
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getCurrentVersion = js.Any.fromFunction0(getCurrentVersion), getLatestVersion = js.Any.fromFunction0(getLatestVersion), versionUpdateAvailable = js.Any.fromFunction0(versionUpdateAvailable))
    __obj.asInstanceOf[SubAPI]
  }
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
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
    def setGetCurrentVersion(value: () => Version): Self = this.set("getCurrentVersion", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLatestVersion(value: () => Version): Self = this.set("getLatestVersion", js.Any.fromFunction0(value))
    @scala.inline
    def setVersionUpdateAvailable(value: () => Boolean): Self = this.set("versionUpdateAvailable", js.Any.fromFunction0(value))
  }
  
}

