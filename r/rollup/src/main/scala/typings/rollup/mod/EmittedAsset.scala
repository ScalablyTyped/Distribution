package typings.rollup.mod

import typings.rollup.rollupStrings.asset
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmittedAsset
  extends StObject
     with EmittedFile {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String | Uint8Array] = js.undefined
  
  var `type`: asset
}
object EmittedAsset {
  
  @scala.inline
  def apply(): EmittedAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[EmittedAsset]
  }
  
  @scala.inline
  implicit class EmittedAssetMutableBuilder[Self <: EmittedAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSource(value: String | Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
