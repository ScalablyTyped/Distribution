package typings.rollup.mod

import typings.rollup.rollupStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreRenderedAsset extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var source: String | js.typedarray.Uint8Array
  
  var `type`: asset
}
object PreRenderedAsset {
  
  inline def apply(source: String | js.typedarray.Uint8Array): PreRenderedAsset = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[PreRenderedAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreRenderedAsset] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
