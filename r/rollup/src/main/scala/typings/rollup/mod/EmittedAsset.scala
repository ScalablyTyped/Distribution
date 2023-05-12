package typings.rollup.mod

import typings.rollup.rollupStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmittedAsset
  extends StObject
     with EmittedFile {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var needsCodeReference: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var `type`: asset
}
object EmittedAsset {
  
  inline def apply(): EmittedAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[EmittedAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmittedAsset] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNeedsCodeReference(value: Boolean): Self = StObject.set(x, "needsCodeReference", value.asInstanceOf[js.Any])
    
    inline def setNeedsCodeReferenceUndefined: Self = StObject.set(x, "needsCodeReference", js.undefined)
    
    inline def setSource(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
