package typings.reactNativeSafeAreaContext

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.mod.HostComponent
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.NativeSafeAreaProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSafeAreaProviderNativeMod extends Shortcut {
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/NativeSafeAreaProvider.native", JSImport.Default)
  @js.native
  val default: HostComponent[NativeSafeAreaProviderProps] = js.native
  
  type _To = HostComponent[NativeSafeAreaProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSafeAreaProviderNativeMod.foo` */
  override def _to: HostComponent[NativeSafeAreaProviderProps] = default
}
