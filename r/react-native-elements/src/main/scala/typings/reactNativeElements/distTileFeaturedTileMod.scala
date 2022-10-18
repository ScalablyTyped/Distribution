package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.PickTouchableOpacityPropsAccessibilityActions
import typings.reactNativeElements.anon.TouchableOpacityPropsTouc
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.distTileTileMod.TileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTileFeaturedTileMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tile/FeaturedTile", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc] = js.native
  
  @JSImport("react-native-elements/dist/tile/FeaturedTile", "FeaturedTile")
  @js.native
  val FeaturedTile: RneFunctionComponent[TileProps] = js.native
  
  type _To = FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc]
  
  /* This means you don't have to write `default`, but can instead just say `distTileFeaturedTileMod.foo` */
  override def _to: FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc] = default
}
