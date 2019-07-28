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
    val __obj = js.Dynamic.literal(appCodename = appCodename, appName = appName, appVersion = appVersion, browserMajor = browserMajor, browserName = browserName, browserVersion = browserVersion, cpuArchitecture = cpuArchitecture, description = description, deviceModel = deviceModel, deviceType = deviceType, deviceVendor = deviceVendor, engineName = engineName, engineVersion = engineVersion, folder = folder, osName = osName, osVersion = osVersion, platform = platform, userAgent = userAgent, vendor = vendor, vendorSub = vendorSub)
  
    __obj.asInstanceOf[UserAgent]
  }
}

