package typings.rollup.mod

import typings.rollup.rollupStrings.asset
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreRenderedAsset extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var source: String | Uint8Array
  
  var `type`: asset
}
object PreRenderedAsset {
  
  @scala.inline
  def apply(source: String | Uint8Array): PreRenderedAsset = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[PreRenderedAsset]
  }
  
  @scala.inline
  implicit class PreRenderedAssetMutableBuilder[Self <: PreRenderedAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSource(value: String | Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
