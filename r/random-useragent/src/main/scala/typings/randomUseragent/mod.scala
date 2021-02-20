package typings.randomUseragent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-useragent", "getAll")
  @js.native
  def getAll(): js.Array[String] = js.native
  @JSImport("random-useragent", "getAll")
  @js.native
  def getAll(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[String] = js.native
  
  @JSImport("random-useragent", "getAllData")
  @js.native
  def getAllData(): js.Array[UserAgent] = js.native
  @JSImport("random-useragent", "getAllData")
  @js.native
  def getAllData(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[UserAgent] = js.native
  
  @JSImport("random-useragent", "getRandom")
  @js.native
  def getRandom(): String | Null = js.native
  @JSImport("random-useragent", "getRandom")
  @js.native
  def getRandom(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): String | Null = js.native
  
  @JSImport("random-useragent", "getRandomData")
  @js.native
  def getRandomData(): UserAgent | Null = js.native
  @JSImport("random-useragent", "getRandomData")
  @js.native
  def getRandomData(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): UserAgent | Null = js.native
  
  @js.native
  trait UserAgent extends StObject {
    
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
    implicit class UserAgentMutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppCodename(value: String): Self = StObject.set(x, "appCodename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserMajor(value: String): Self = StObject.set(x, "browserMajor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuArchitecture(value: String): Self = StObject.set(x, "cpuArchitecture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceVendor(value: String): Self = StObject.set(x, "deviceVendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineName(value: String): Self = StObject.set(x, "engineName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsName(value: String): Self = StObject.set(x, "osName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorSub(value: String): Self = StObject.set(x, "vendorSub", value.asInstanceOf[js.Any])
    }
  }
}
