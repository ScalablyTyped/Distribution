package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleBlock
  extends StObject
     with Statement
     with BlockLike
     with NamespaceBody {
  
  @JSName("kind")
  val kind_ModuleBlock: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ModuleBlock = js.native
  
  @JSName("parent")
  val parent_ModuleBlock: ModuleDeclaration = js.native
  
  val statements: NodeArray[Statement] = js.native
}
