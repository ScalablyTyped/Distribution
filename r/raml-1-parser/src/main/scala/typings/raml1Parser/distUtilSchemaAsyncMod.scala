package typings.raml1Parser

import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilSchemaAsyncMod {
  
  @JSImport("raml-1-parser/dist/util/schemaAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReferences(schemaContent: Any, unit: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getReferences")(schemaContent.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isScheme(content: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScheme")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def startDownloadingReferencesAsync(schemaContent: String, unit: ICompilationUnit): js.Promise[ICompilationUnit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDownloadingReferencesAsync")(schemaContent.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ICompilationUnit]]
}
