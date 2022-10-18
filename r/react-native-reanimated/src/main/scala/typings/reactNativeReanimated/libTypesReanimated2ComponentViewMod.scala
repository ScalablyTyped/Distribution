package typings.reactNativeReanimated

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.reactNativeReanimated.libTypesCreateAnimatedComponentMod.AnimatedComponentProps
import typings.reactNativeReanimated.libTypesCreateAnimatedComponentMod.InitialComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2ComponentViewMod extends Shortcut {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/component/View", JSImport.Default)
  @js.native
  val default: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  type _To = ComponentType[AnimatedComponentProps[InitialComponentProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypesReanimated2ComponentViewMod.foo` */
  override def _to: ComponentType[AnimatedComponentProps[InitialComponentProps]] = default
}
