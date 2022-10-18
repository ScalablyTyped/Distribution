package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ReadonlyTextRange because Already inherited
- typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Node because Already inherited
- typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Declaration because Already inherited
- typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.NamedDeclaration because Already inherited
- typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.DeclarationStatement because var conflicts: _declarationBrand. Inlined  */ @js.native
trait FunctionDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration
     with Statement {
  
  @JSName("body")
  val body_FunctionDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_FunctionDeclaration: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.FunctionDeclaration = js.native
  
  @JSName("modifiers")
  val modifiers_FunctionDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_FunctionDeclaration: js.UndefOr[Identifier] = js.native
}
