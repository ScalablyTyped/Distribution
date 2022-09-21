package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupAssetResult
  extends StObject
     with RollupResult {
  
  var content: String
  
  var fileName: String
  
  var `type`: asset
}
object RollupAssetResult {
  
  inline def apply(content: String, fileName: String): RollupAssetResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[RollupAssetResult]
  }
  
  extension [Self <: RollupAssetResult](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
