package typings.reactNativeWindowsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnvironmentInfo(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentInfo")().asInstanceOf[js.Promise[String]]
}
