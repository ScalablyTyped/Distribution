package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOfSourceMap extends StObject {
  
  var file: js.UndefOr[String] = js.undefined
  
  var skipValidation: js.UndefOr[Boolean] = js.undefined
  
  var sourceRoot: js.UndefOr[String] = js.undefined
}
object StartOfSourceMap {
  
  inline def apply(): StartOfSourceMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOfSourceMap]
  }
  
  extension [Self <: StartOfSourceMap](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSkipValidation(value: Boolean): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipValidationUndefined: Self = StObject.set(x, "skipValidation", js.undefined)
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
  }
}
