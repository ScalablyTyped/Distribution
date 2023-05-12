package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterDeclaration
  extends StObject
     with NamedDeclaration
     with JSDocContainer
     with HasDecorators
     with HasExpressionInitializer
     with HasJSDoc
     with HasModifiers
     with HasType
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement {
  
  val dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
  
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_ParameterDeclaration: Parameter = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  @JSName("name")
  val name_ParameterDeclaration: BindingName = js.native
  
  @JSName("parent")
  val parent_ParameterDeclaration: SignatureDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
