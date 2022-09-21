package typings.reactNativeSafeAreaContext

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.HostComponent
import typings.reactNativeSafeAreaContext.nativeSafeAreaViewMod.NativeProps
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.NativeSafeAreaViewProps
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaViewMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/SafeAreaView", "SafeAreaView")
  @js.native
  val SafeAreaView: ForwardRefExoticComponent[SafeAreaViewProps & RefAttributes[NativeSafeAreaViewInstance]] = js.native
  
  type NativeSafeAreaViewInstance = InstanceType[HostComponent[NativeProps]]
  
  type SafeAreaViewProps = NativeSafeAreaViewProps
}
