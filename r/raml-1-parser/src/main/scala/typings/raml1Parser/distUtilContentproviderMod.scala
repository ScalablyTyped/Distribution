package typings.raml1Parser

import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilContentproviderMod {
  
  @JSImport("raml-1-parser/dist/util/contentprovider", "ContentProvider")
  @js.native
  open class ContentProvider protected () extends StObject {
    def this(unit: ICompilationUnit) = this()
    
    def content(reference: Any): String = js.native
    
    def contentAsync(reference: Any): js.Promise[String] = js.native
    
    def contextPath(): String = js.native
    
    def hasAsyncRequests(): Boolean = js.native
    
    def isAbsolutePath(uri: Any): Boolean = js.native
    
    def isWebPath(p: String): Boolean = js.native
    
    def normalizePath(url: Any): Any = js.native
    
    def promiseResolve(arg: Any): js.Promise[Any] = js.native
    
    def relativePath(from: Any, to: Any): String = js.native
    
    def resolvePath(context: Any, relativePath: Any): Any = js.native
    
    def rootPath(): String = js.native
    
    /* private */ var toRelativeIfNeeded: Any = js.native
    
    /* private */ var unit: Any = js.native
  }
}
