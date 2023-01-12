package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.anon.Name
import typings.reactNativeCommunityCliPluginMetro.buildCommandsBundleBuildBundleMod.AssetData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBundleAssetCatalogIOSMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/assetCatalogIOS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanAssetCatalog(catalogDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanAssetCatalog")(catalogDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getImageSet(catalogDir: String, asset: AssetData, scales: js.Array[Double]): ImageSet = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSet")(catalogDir.asInstanceOf[js.Any], asset.asInstanceOf[js.Any], scales.asInstanceOf[js.Any])).asInstanceOf[ImageSet]
  
  inline def isCatalogAsset(asset: AssetData): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCatalogAsset")(asset.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def writeImageSet(imageSet: ImageSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeImageSet")(imageSet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ImageSet extends StObject {
    
    var basePath: String
    
    var files: js.Array[Name]
  }
  object ImageSet {
    
    inline def apply(basePath: String, files: js.Array[Name]): ImageSet = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageSet] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[Name]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: Name*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
}
