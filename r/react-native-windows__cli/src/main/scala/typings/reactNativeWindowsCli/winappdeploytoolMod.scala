package typings.reactNativeWindowsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object winappdeploytoolMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/winappdeploytool", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with WinAppDeployTool
  
  trait DeviceInfo extends StObject {
    
    val guid: String
    
    /* private */ var index: js.Any
    
    val ip: String
    
    val name: String
    
    /* private */ var `type`: js.Any
  }
  object DeviceInfo {
    
    inline def apply(guid: String, index: js.Any, ip: String, name: String, `type`: js.Any): DeviceInfo = {
      val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceInfo]
    }
    
    extension [Self <: DeviceInfo](x: Self) {
      
      inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WinAppDeployTool extends StObject {
    
    def enumerateDevices(): js.Array[DeviceInfo] = js.native
    
    def findDevice(target: String): DeviceInfo = js.native
    
    def installAppPackage(
      pathToAppxPackage: String,
      targetDevice: DeviceInfo,
      shouldLaunch: Boolean,
      shouldUpdate: Boolean,
      pin: Boolean
    ): js.Promise[Unit] = js.native
    def installAppPackage(
      pathToAppxPackage: String,
      targetDevice: DeviceInfo,
      shouldLaunch: Boolean,
      shouldUpdate: Boolean,
      pin: Boolean,
      verbose: Boolean
    ): js.Promise[Unit] = js.native
    
    def isAvailable: Boolean = js.native
    
    /* private */ var path: js.Any = js.native
    
    def uninstallAppPackage(appName: String, targetDevice: DeviceInfo, verbose: Boolean): js.Promise[Unit] = js.native
  }
}
