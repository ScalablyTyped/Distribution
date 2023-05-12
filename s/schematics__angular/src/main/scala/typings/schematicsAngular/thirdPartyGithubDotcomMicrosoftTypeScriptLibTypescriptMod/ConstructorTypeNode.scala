package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorTypeNode
  extends StObject
     with FunctionOrConstructorTypeNodeBase
     with LocalsContainer
     with FunctionOrConstructorTypeNode
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  @JSName("kind")
  val kind_ConstructorTypeNode: ConstructorType = js.native
  
  val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
}
