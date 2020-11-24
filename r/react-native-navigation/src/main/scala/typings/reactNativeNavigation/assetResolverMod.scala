package typings.reactNativeNavigation

import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.ImageResolvedAssetSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/adapters/AssetResolver", JSImport.Namespace)
@js.native
object assetResolverMod extends js.Object {
  
  @js.native
  class AssetService () extends js.Object {
    
    def resolveFromRequire(value: ImageRequireSource): ImageResolvedAssetSource = js.native
  }
}
