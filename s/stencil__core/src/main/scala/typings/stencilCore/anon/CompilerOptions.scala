package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerOptions extends StObject {
  
  var compilerOptions: Any
  
  var exclude: js.Array[String]
  
  var `extends`: String
  
  var files: js.Array[String]
  
  var include: js.Array[String]
  
  var path: String
}
object CompilerOptions {
  
  inline def apply(
    compilerOptions: Any,
    exclude: js.Array[String],
    `extends`: String,
    files: js.Array[String],
    include: js.Array[String],
    path: String
  ): CompilerOptions = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptions]
  }
  
  extension [Self <: CompilerOptions](x: Self) {
    
    inline def setCompilerOptions(value: Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
