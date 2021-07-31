package typings.reactNativeNavigation

import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.ImageResolvedAssetSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetResolverMod {
  
  @JSImport("react-native-navigation/lib/dist/adapters/AssetResolver", "AssetService")
  @js.native
  class AssetService () extends StObject {
    
    def resolveFromRequire(value: ImageRequireSource): ImageResolvedAssetSource = js.native
  }
}
