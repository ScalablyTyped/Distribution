package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2PlatformCheckerMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/PlatformChecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isChromeDebugger(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChromeDebugger")().asInstanceOf[Boolean]
  
  inline def isJest(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJest")().asInstanceOf[Boolean]
  
  inline def isWeb(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeb")().asInstanceOf[Boolean]
  
  inline def nativeShouldBeMock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeShouldBeMock")().asInstanceOf[Boolean]
  
  inline def shouldBeUseWeb(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeUseWeb")().asInstanceOf[Boolean]
}
