package typings.randomUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgent extends js.Object {
  var appCodename: String = js.native
  var appName: String = js.native
  var appVersion: String = js.native
  var browserMajor: String = js.native
  var browserName: String = js.native
  var browserVersion: String = js.native
  var cpuArchitecture: String = js.native
  var description: String = js.native
  var deviceModel: String = js.native
  var deviceType: String = js.native
  var deviceVendor: String = js.native
  var engineName: String = js.native
  var engineVersion: String = js.native
  var folder: String = js.native
  var osName: String = js.native
  var osVersion: String = js.native
  var platform: String = js.native
  var userAgent: String = js.native
  var vendor: String = js.native
  var vendorSub: String = js.native
}

object UserAgent {
  @scala.inline
  def apply(
    appCodename: String,
    appName: String,
    appVersion: String,
    browserMajor: String,
    browserName: String,
    browserVersion: String,
    cpuArchitecture: String,
    description: String,
    deviceModel: String,
    deviceType: String,
    deviceVendor: String,
    engineName: String,
    engineVersion: String,
    folder: String,
    osName: String,
    osVersion: String,
    platform: String,
    userAgent: String,
    vendor: String,
    vendorSub: String
  ): UserAgent = {
    val __obj = js.Dynamic.literal(appCodename = appCodename.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], browserMajor = browserMajor.asInstanceOf[js.Any], browserName = browserName.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], cpuArchitecture = cpuArchitecture.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceModel = deviceModel.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], deviceVendor = deviceVendor.asInstanceOf[js.Any], engineName = engineName.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], osName = osName.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
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
    def setAppCodename(value: String): Self = this.set("appCodename", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserMajor(value: String): Self = this.set("browserMajor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserName(value: String): Self = this.set("browserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserVersion(value: String): Self = this.set("browserVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpuArchitecture(value: String): Self = this.set("cpuArchitecture", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceModel(value: String): Self = this.set("deviceModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceVendor(value: String): Self = this.set("deviceVendor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngineName(value: String): Self = this.set("engineName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def setOsName(value: String): Self = this.set("osName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorSub(value: String): Self = this.set("vendorSub", value.asInstanceOf[js.Any])
  }
  
}

