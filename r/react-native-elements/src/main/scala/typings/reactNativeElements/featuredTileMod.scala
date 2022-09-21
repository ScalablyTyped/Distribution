package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.PickTouchableOpacityPropsAccessibilityHint
import typings.reactNativeElements.anon.TouchableOpacityPropsToucAccessibilityActions
import typings.reactNativeElements.helpersMod.RneFunctionComponent
import typings.reactNativeElements.tileMod.TileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuredTileMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tile/FeaturedTile", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTouchableOpacityPropsAccessibilityHint] | ForwardRefExoticComponent[TouchableOpacityPropsToucAccessibilityActions] = js.native
  
  @JSImport("react-native-elements/dist/tile/FeaturedTile", "FeaturedTile")
  @js.native
  val FeaturedTile: RneFunctionComponent[TileProps] = js.native
  
  type _To = FunctionComponent[PickTouchableOpacityPropsAccessibilityHint] | ForwardRefExoticComponent[TouchableOpacityPropsToucAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `featuredTileMod.foo` */
  override def _to: FunctionComponent[PickTouchableOpacityPropsAccessibilityHint] | ForwardRefExoticComponent[TouchableOpacityPropsToucAccessibilityActions] = default
}
