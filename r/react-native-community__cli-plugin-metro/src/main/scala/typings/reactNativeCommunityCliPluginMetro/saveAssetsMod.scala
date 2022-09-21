package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.buildBundleMod.AssetData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveAssetsMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/saveAssets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(assets: js.Array[AssetData], platform: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(assets.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def default(assets: js.Array[AssetData], platform: String, assetsDest: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(assets.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], assetsDest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
