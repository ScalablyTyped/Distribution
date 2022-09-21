package typings.reactNativeCommunityCliPlatformAndroid

import typings.reactNativeCommunityCliPlatformAndroid.runAndroidMod.Flags
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectParams
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runOnAllDevicesMod {
  
  @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid/runOnAllDevices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Flags, cmd: String, adbPath: String, androidProject: AndroidProject): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], adbPath.asInstanceOf[js.Any], androidProject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type AndroidProject = NonNullable[
    js.UndefOr[
      Exclude[
        ReturnType[
          js.Function2[
            /* projectRoot */ String, 
            /* projectParams */ AndroidProjectParams | Unit, 
            AndroidProjectConfig | Unit
          ]
        ], 
        Unit
      ]
    ]
  ]
}
