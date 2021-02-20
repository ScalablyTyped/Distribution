package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParserResult extends StObject {
  
  /** Package name, if declared */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  
  /** Imports, if any */
  var imports: js.UndefOr[js.Array[String]] = js.native
  
  /** Populated root instance */
  var root: Root = js.native
  
  /** Syntax, if specified (either `"proto2"` or `"proto3"`) */
  var syntax: js.UndefOr[String] = js.native
  
  /** Weak imports, if any */
  var weakImports: js.UndefOr[js.Array[String]] = js.native
}
object IParserResult {
  
  @scala.inline
  def apply(root: Root): IParserResult = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParserResult]
  }
  
  @scala.inline
  implicit class IParserResultMutableBuilder[Self <: IParserResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: Root): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setWeakImports(value: js.Array[String]): Self = StObject.set(x, "weakImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakImportsUndefined: Self = StObject.set(x, "weakImports", js.undefined)
    
    @scala.inline
    def setWeakImportsVarargs(value: String*): Self = StObject.set(x, "weakImports", js.Array(value :_*))
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
