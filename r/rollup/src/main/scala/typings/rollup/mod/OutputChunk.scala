package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputChunk
  extends StObject
     with RenderedChunk {
  
  @JSName("code")
  var code_OutputChunk: String
}
object OutputChunk {
  
  inline def apply(
    code: String,
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    implicitlyLoadedBefore: js.Array[String],
    importedBindings: StringDictionary[js.Array[String]],
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    isImplicitEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    referencedFiles: js.Array[String]
  ): OutputChunk = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], implicitlyLoadedBefore = implicitlyLoadedBefore.asInstanceOf[js.Any], importedBindings = importedBindings.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isImplicitEntry = isImplicitEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], facadeModuleId = null)
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[OutputChunk]
  }
  
  extension [Self <: OutputChunk](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
