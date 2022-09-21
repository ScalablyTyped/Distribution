package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`docs-json`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDocsJson
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var file: String
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDocsJson: `docs-json`
  
  var typesFile: js.UndefOr[String | Null] = js.undefined
}
object OutputTargetDocsJson {
  
  inline def apply(file: String): OutputTargetDocsJson = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("docs-json")
    __obj.asInstanceOf[OutputTargetDocsJson]
  }
  
  extension [Self <: OutputTargetDocsJson](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setType(value: `docs-json`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypesFile(value: String): Self = StObject.set(x, "typesFile", value.asInstanceOf[js.Any])
    
    inline def setTypesFileNull: Self = StObject.set(x, "typesFile", null)
    
    inline def setTypesFileUndefined: Self = StObject.set(x, "typesFile", js.undefined)
  }
}
