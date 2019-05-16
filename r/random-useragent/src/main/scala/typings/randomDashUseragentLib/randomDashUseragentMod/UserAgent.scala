package typings
package randomDashUseragentLib.randomDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgent extends js.Object {
  var appCodename: java.lang.String
  var appName: java.lang.String
  var appVersion: java.lang.String
  var browserMajor: java.lang.String
  var browserName: java.lang.String
  var browserVersion: java.lang.String
  var cpuArchitecture: java.lang.String
  var description: java.lang.String
  var deviceModel: java.lang.String
  var deviceType: java.lang.String
  var deviceVendor: java.lang.String
  var engineName: java.lang.String
  var engineVersion: java.lang.String
  var folder: java.lang.String
  var osName: java.lang.String
  var osVersion: java.lang.String
  var platform: java.lang.String
  var userAgent: java.lang.String
  var vendor: java.lang.String
  var vendorSub: java.lang.String
}

object UserAgent {
  @scala.inline
  def apply(
    appCodename: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    browserMajor: java.lang.String,
    browserName: java.lang.String,
    browserVersion: java.lang.String,
    cpuArchitecture: java.lang.String,
    description: java.lang.String,
    deviceModel: java.lang.String,
    deviceType: java.lang.String,
    deviceVendor: java.lang.String,
    engineName: java.lang.String,
    engineVersion: java.lang.String,
    folder: java.lang.String,
    osName: java.lang.String,
    osVersion: java.lang.String,
    platform: java.lang.String,
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): UserAgent = {
    val __obj = js.Dynamic.literal(appCodename = appCodename, appName = appName, appVersion = appVersion, browserMajor = browserMajor, browserName = browserName, browserVersion = browserVersion, cpuArchitecture = cpuArchitecture, description = description, deviceModel = deviceModel, deviceType = deviceType, deviceVendor = deviceVendor, engineName = engineName, engineVersion = engineVersion, folder = folder, osName = osName, osVersion = osVersion, platform = platform, userAgent = userAgent, vendor = vendor, vendorSub = vendorSub)
  
    __obj.asInstanceOf[UserAgent]
  }
}

