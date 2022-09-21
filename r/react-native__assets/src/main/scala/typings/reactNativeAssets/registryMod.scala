package typings.reactNativeAssets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("@react-native/assets/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAssetByID(assetId: Double): PackagerAsset = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssetByID")(assetId.asInstanceOf[js.Any]).asInstanceOf[PackagerAsset]
  
  inline def registerAsset(asset: PackagerAsset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAsset")(asset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait PackagerAsset extends StObject {
    
    var __packager_asset: Boolean
    
    var fileSystemLocation: String
    
    var hash: String
    
    var height: js.UndefOr[Null | Double] = js.undefined
    
    var httpServerLocation: String
    
    var name: String
    
    var scales: js.Array[Double]
    
    var `type`: String
    
    var width: js.UndefOr[Null | Double] = js.undefined
  }
  object PackagerAsset {
    
    inline def apply(
      __packager_asset: Boolean,
      fileSystemLocation: String,
      hash: String,
      httpServerLocation: String,
      name: String,
      scales: js.Array[Double],
      `type`: String
    ): PackagerAsset = {
      val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackagerAsset]
    }
    
    extension [Self <: PackagerAsset](x: Self) {
      
      inline def setFileSystemLocation(value: String): Self = StObject.set(x, "fileSystemLocation", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHttpServerLocation(value: String): Self = StObject.set(x, "httpServerLocation", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def set__packager_asset(value: Boolean): Self = StObject.set(x, "__packager_asset", value.asInstanceOf[js.Any])
    }
  }
}
