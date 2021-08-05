package typings.rollup.mod

import typings.rollup.rollupBooleans.`true`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputAsset
  extends StObject
     with PreRenderedAsset {
  
  var fileName: String
  
  /** @deprecated Accessing "isAsset" on files in the bundle is deprecated, please use "type === \'asset\'" instead */
  var isAsset: `true`
}
object OutputAsset {
  
  inline def apply(fileName: String, source: String | Uint8Array): OutputAsset = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isAsset = true, source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[OutputAsset]
  }
  
  extension [Self <: OutputAsset](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setIsAsset(value: `true`): Self = StObject.set(x, "isAsset", value.asInstanceOf[js.Any])
  }
}
