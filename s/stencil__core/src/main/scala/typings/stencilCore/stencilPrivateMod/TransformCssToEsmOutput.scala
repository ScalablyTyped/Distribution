package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.ImportPath
import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import typings.stencilCore.stencilPublicDocsMod.StyleDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformCssToEsmOutput extends StObject {
  
  var defaultVarName: String
  
  var diagnostics: js.Array[Diagnostic]
  
  var imports: js.Array[ImportPath]
  
  var map: Any
  
  var output: String
  
  var styleDocs: js.Array[StyleDoc]
  
  var styleText: String
}
object TransformCssToEsmOutput {
  
  inline def apply(
    defaultVarName: String,
    diagnostics: js.Array[Diagnostic],
    imports: js.Array[ImportPath],
    map: Any,
    output: String,
    styleDocs: js.Array[StyleDoc],
    styleText: String
  ): TransformCssToEsmOutput = {
    val __obj = js.Dynamic.literal(defaultVarName = defaultVarName.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], styleDocs = styleDocs.asInstanceOf[js.Any], styleText = styleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformCssToEsmOutput]
  }
  
  extension [Self <: TransformCssToEsmOutput](x: Self) {
    
    inline def setDefaultVarName(value: String): Self = StObject.set(x, "defaultVarName", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setImports(value: js.Array[ImportPath]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: ImportPath*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setStyleDocs(value: js.Array[StyleDoc]): Self = StObject.set(x, "styleDocs", value.asInstanceOf[js.Any])
    
    inline def setStyleDocsVarargs(value: StyleDoc*): Self = StObject.set(x, "styleDocs", js.Array(value*))
    
    inline def setStyleText(value: String): Self = StObject.set(x, "styleText", value.asInstanceOf[js.Any])
  }
}
