package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.codegenNativeComponentMod.NativeComponentType
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rngesturehandlerrootviewnativecomponentMod extends Shortcut {
  
  @JSImport("react-native-gesture-handler/lib/typescript/fabric/RNGestureHandlerRootViewNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  type NativeProps = ViewProps
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `rngesturehandlerrootviewnativecomponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
