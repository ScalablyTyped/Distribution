package typings.randomUseragent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-useragent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAll(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[String]]
  inline def getAll(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getAllData(): js.Array[UserAgent] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllData")().asInstanceOf[js.Array[UserAgent]]
  inline def getAllData(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[UserAgent] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllData")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[UserAgent]]
  
  inline def getRandom(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandom")().asInstanceOf[String]
  inline def getRandom(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandom")(filter.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getRandomData(): UserAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomData")().asInstanceOf[UserAgent]
  inline def getRandomData(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): UserAgent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomData")(filter.asInstanceOf[js.Any]).asInstanceOf[UserAgent | Null]
  
  trait UserAgent extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setAppCodename(value: String): Self = StObject.set(x, "appCodename", value.asInstanceOf[js.Any])
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setBrowserMajor(value: String): Self = StObject.set(x, "browserMajor", value.asInstanceOf[js.Any])
      
      inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
      
      inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
      
      inline def setCpuArchitecture(value: String): Self = StObject.set(x, "cpuArchitecture", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
      
      inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      inline def setDeviceVendor(value: String): Self = StObject.set(x, "deviceVendor", value.asInstanceOf[js.Any])
      
      inline def setEngineName(value: String): Self = StObject.set(x, "engineName", value.asInstanceOf[js.Any])
      
      inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setOsName(value: String): Self = StObject.set(x, "osName", value.asInstanceOf[js.Any])
      
      inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorSub(value: String): Self = StObject.set(x, "vendorSub", value.asInstanceOf[js.Any])
    }
  }
}
