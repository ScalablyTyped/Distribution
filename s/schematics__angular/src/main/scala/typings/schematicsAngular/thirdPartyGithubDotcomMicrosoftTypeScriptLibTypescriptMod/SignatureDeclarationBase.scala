package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.CallSignature
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ConstructSignature
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.Constructor
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ConstructorType
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.FunctionType
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.GetAccessor
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.IndexSignature
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends StObject
     with NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  val kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.JSDocFunctionType | typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.FunctionDeclaration | typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.FunctionExpression | typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  val name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  val parameters: NodeArray[ParameterDeclaration] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
