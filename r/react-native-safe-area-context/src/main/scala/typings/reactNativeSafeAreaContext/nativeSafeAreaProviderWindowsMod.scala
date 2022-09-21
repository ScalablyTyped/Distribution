package typings.reactNativeSafeAreaContext

import typings.react.mod.global.JSX.Element
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.NativeSafeAreaProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSafeAreaProviderWindowsMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/NativeSafeAreaProvider.windows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NativeSafeAreaProvider(hasChildrenStyleOnInsetsChange: NativeSafeAreaProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NativeSafeAreaProvider")(hasChildrenStyleOnInsetsChange.asInstanceOf[js.Any]).asInstanceOf[Element]
}
