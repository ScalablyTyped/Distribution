package typings.raml1Parser

import typings.raml1Parser.distParserJsyamlResolversApiMod.FSResolver
import typings.raml1Parser.distParserJsyamlResolversApiMod.HTTPResolver
import typings.raml1Parser.distParserLowLevelASTMod.IProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProjectMod {
  
  @JSImport("raml-1-parser/dist/project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createProject(path: String): IProject = ^.asInstanceOf[js.Dynamic].applyDynamic("createProject")(path.asInstanceOf[js.Any]).asInstanceOf[IProject]
  inline def createProject(path: String, r: Unit, h: HTTPResolver): IProject = (^.asInstanceOf[js.Dynamic].applyDynamic("createProject")(path.asInstanceOf[js.Any], r.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[IProject]
  inline def createProject(path: String, r: FSResolver): IProject = (^.asInstanceOf[js.Dynamic].applyDynamic("createProject")(path.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[IProject]
  inline def createProject(path: String, r: FSResolver, h: HTTPResolver): IProject = (^.asInstanceOf[js.Dynamic].applyDynamic("createProject")(path.asInstanceOf[js.Any], r.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[IProject]
}
