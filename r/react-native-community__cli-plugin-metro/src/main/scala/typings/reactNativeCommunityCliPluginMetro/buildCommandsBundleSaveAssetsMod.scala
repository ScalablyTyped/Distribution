package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.buildCommandsBundleBuildBundleMod.AssetData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBundleSaveAssetsMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/saveAssets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(assets: js.Array[AssetData], platform: String): js.UndefOr[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(assets.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[Unit]]]
  inline def default(assets: js.Array[AssetData], platform: String, assetsDest: String): js.UndefOr[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(assets.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], assetsDest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[Unit]]]
  inline def default(assets: js.Array[AssetData], platform: String, assetsDest: String, assetCatalogDest: String): js.UndefOr[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(assets.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], assetsDest.asInstanceOf[js.Any], assetCatalogDest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[Unit]]]
  inline def default(assets: js.Array[AssetData], platform: String, assetsDest: Unit, assetCatalogDest: String): js.UndefOr[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(assets.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], assetsDest.asInstanceOf[js.Any], assetCatalogDest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[Unit]]]
}
