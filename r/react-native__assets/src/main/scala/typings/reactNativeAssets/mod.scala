package typings.reactNativeAssets

import typings.reactNativeAssets.registryMod.PackagerAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native/assets/path-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAndroidResourceFolderName(asset: PackagerAsset, scale: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidResourceFolderName")(asset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAndroidResourceIdentifier(asset: PackagerAsset): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidResourceIdentifier")(asset.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBasePath(asset: PackagerAsset): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasePath")(asset.asInstanceOf[js.Any]).asInstanceOf[String]
}
