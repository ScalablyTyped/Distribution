package typings.reactNativeSafeAreaContext

import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initialWindowNativeMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/InitialWindow.native", "initialWindowMetrics")
  @js.native
  val initialWindowMetrics: Metrics | Null = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/InitialWindow.native", "initialWindowSafeAreaInsets")
  @js.native
  val initialWindowSafeAreaInsets: js.UndefOr[EdgeInsets] = js.native
}
