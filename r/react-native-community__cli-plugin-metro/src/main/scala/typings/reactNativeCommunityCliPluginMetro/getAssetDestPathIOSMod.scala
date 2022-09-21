package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.assetPathUtilsMod.PackagerAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAssetDestPathIOSMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/getAssetDestPathIOS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(asset: PackagerAsset, scale: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(asset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[String]
}
