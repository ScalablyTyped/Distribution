package typings.reactNativeWindowsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkRequirementsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/checkRequirements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isWinSdkPresent(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isWinSdkPresent")(target.asInstanceOf[js.Any]).asInstanceOf[String]
}
