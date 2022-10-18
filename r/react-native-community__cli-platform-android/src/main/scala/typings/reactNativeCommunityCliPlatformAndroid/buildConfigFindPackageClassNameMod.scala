package typings.reactNativeCommunityCliPlatformAndroid

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConfigFindPackageClassNameMod {
  
  @JSImport("@react-native-community/cli-platform-android/build/config/findPackageClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(folder: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(folder.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def matchClassName(file: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchClassName")(file.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
}
