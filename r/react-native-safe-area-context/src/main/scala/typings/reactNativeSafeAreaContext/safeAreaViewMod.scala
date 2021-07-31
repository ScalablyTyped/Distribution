package typings.reactNativeSafeAreaContext

import typings.react.mod.global.JSX.Element
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.NativeSafeAreaViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaViewMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def SafeAreaView(hasStyleModeEdgesRest: NativeSafeAreaViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SafeAreaView")(hasStyleModeEdgesRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
