package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShorthandPropertyAssignment
  extends StObject
     with ObjectLiteralElement
     with JSDocContainer
     with HasJSDoc
     with ObjectBindingOrAssignmentElement
     with ObjectLiteralElementLike
     with VariableLikeDeclaration {
  
  val equalsToken: js.UndefOr[EqualsToken] = js.native
  
  /** @deprecated A shorthand property assignment cannot have an exclamation token */
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  @JSName("kind")
  val kind_ShorthandPropertyAssignment: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ShorthandPropertyAssignment = js.native
  
  /** @deprecated A shorthand property assignment cannot have modifiers */
  @JSName("modifiers")
  val modifiers_ShorthandPropertyAssignment: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_ShorthandPropertyAssignment: Identifier = js.native
  
  val objectAssignmentInitializer: js.UndefOr[Expression] = js.native
  
  @JSName("parent")
  val parent_ShorthandPropertyAssignment: ObjectLiteralExpression = js.native
  
  /** @deprecated A shorthand property assignment cannot have a question token */
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
