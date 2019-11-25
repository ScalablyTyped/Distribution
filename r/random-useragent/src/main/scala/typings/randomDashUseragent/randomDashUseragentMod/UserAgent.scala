package typings.randomDashUseragent.randomDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgent extends js.Object {
  var appCodename: String
  var appName: String
  var appVersion: String
  var browserMajor: String
  var browserName: String
  var browserVersion: String
  var cpuArchitecture: String
  var description: String
  var deviceModel: String
  var deviceType: String
  var deviceVendor: String
  var engineName: String
  var engineVersion: String
  var folder: String
  var osName: String
  var osVersion: String
  var platform: String
  var userAgent: String
  var vendor: String
  var vendorSub: String
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
}

