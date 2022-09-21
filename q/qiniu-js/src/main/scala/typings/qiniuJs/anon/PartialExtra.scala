package typings.qiniuJs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<qiniu-js.qiniu-js/esm/upload/base.Extra> */
trait PartialExtra extends StObject {
  
  var customVars: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var fname: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
}
object PartialExtra {
  
  inline def apply(): PartialExtra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExtra]
  }
  
  extension [Self <: PartialExtra](x: Self) {
    
    inline def setCustomVars(value: StringDictionary[String]): Self = StObject.set(x, "customVars", value.asInstanceOf[js.Any])
    
    inline def setCustomVarsUndefined: Self = StObject.set(x, "customVars", js.undefined)
    
    inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    inline def setFnameUndefined: Self = StObject.set(x, "fname", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
