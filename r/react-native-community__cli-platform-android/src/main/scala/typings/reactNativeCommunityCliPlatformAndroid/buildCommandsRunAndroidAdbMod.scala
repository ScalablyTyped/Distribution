package typings.reactNativeCommunityCliPlatformAndroid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsRunAndroidAdbMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid/adb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid/adb", "default.getAvailableCPUs")
    @js.native
    def getAvailableCPUs: js.Function2[/* adbPath */ String, /* device */ String, js.Array[String]] = js.native
    inline def getAvailableCPUs(adbPath: String, device: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableCPUs")(adbPath.asInstanceOf[js.Any], device.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def getAvailableCPUs_=(x: js.Function2[/* adbPath */ String, /* device */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAvailableCPUs")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid/adb", "default.getCPU")
    @js.native
    def getCPU: js.Function2[/* adbPath */ String, /* device */ String, String | Null] = js.native
    inline def getCPU(adbPath: String, device: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCPU")(adbPath.asInstanceOf[js.Any], device.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    inline def getCPU_=(x: js.Function2[/* adbPath */ String, /* device */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCPU")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid/adb", "default.getDevices")
    @js.native
    def getDevices: js.Function1[/* adbPath */ String, js.Array[String]] = js.native
    inline def getDevices(adbPath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(adbPath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def getDevices_=(x: js.Function1[/* adbPath */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDevices")(x.asInstanceOf[js.Any])
  }
}
