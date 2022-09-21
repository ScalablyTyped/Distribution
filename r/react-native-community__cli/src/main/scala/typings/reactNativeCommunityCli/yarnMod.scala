package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yarnMod {
  
  @JSImport("@react-native-community/cli/build/tools/yarn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getYarnVersionIfAvailable(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getYarnVersionIfAvailable")().asInstanceOf[String | Null]
  
  inline def isProjectUsingYarn(cwd: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isProjectUsingYarn")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
