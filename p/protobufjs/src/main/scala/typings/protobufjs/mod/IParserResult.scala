package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParserResult extends StObject {
  
  /** Package name, if declared */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  /** Imports, if any */
  var imports: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Populated root instance */
  var root: Root
  
  /** Syntax, if specified (either `"proto2"` or `"proto3"`) */
  var syntax: js.UndefOr[String] = js.undefined
  
  /** Weak imports, if any */
  var weakImports: js.UndefOr[js.Array[String]] = js.undefined
}
object IParserResult {
  
  inline def apply(root: Root): IParserResult = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParserResult]
  }
  
  extension [Self <: IParserResult](x: Self) {
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    inline def setRoot(value: Root): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setWeakImports(value: js.Array[String]): Self = StObject.set(x, "weakImports", value.asInstanceOf[js.Any])
    
    inline def setWeakImportsUndefined: Self = StObject.set(x, "weakImports", js.undefined)
    
    inline def setWeakImportsVarargs(value: String*): Self = StObject.set(x, "weakImports", js.Array(value :_*))
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
