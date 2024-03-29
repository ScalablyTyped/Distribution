package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExpression
  extends StObject
     with PrimaryExpression
     with FunctionLikeDeclarationBase
     with LocalsContainer
     with FlowContainer
     with FunctionLikeDeclaration
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  @JSName("body")
  val body_FunctionExpression: FunctionBody = js.native
  
  @JSName("kind")
  val kind_FunctionExpression: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.FunctionExpression = js.native
  
  val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_FunctionExpression: js.UndefOr[Identifier] = js.native
}
