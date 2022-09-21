package typings.reactNativeSvg.anon

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  var asset: ImageSourcePropType
}
object Asset {
  
  inline def apply(asset: ImageSourcePropType): Asset = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setAsset(value: ImageSourcePropType): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetVarargs(value: ImageURISource*): Self = StObject.set(x, "asset", js.Array(value*))
  }
}
