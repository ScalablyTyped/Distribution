package typings.reactNativeCommunityCliPlatformAndroid

import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAndroidProjectMod {
  
  @JSImport("@react-native-community/cli-platform-android/build/config/getAndroidProject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAndroidProject(config: Config): AndroidProjectConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidProject")(config.asInstanceOf[js.Any]).asInstanceOf[AndroidProjectConfig]
  
  inline def getPackageName(manifestPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageName")(manifestPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validatePackageName(packageName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePackageName")(packageName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
