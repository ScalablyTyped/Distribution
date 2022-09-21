package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.SyntaxKind.ConstructSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.schematicsAngular.typescriptMod.ReadonlyTextRange because Already inherited
- typings.schematicsAngular.typescriptMod.Node because Already inherited
- typings.schematicsAngular.typescriptMod.Declaration because Already inherited
- typings.schematicsAngular.typescriptMod.NamedDeclaration because Already inherited
- typings.schematicsAngular.typescriptMod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait ConstructSignatureDeclaration
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with SignatureDeclaration {
  
  var _typeElementBrand: Any = js.native
  
  @JSName("kind")
  val kind_ConstructSignatureDeclaration: ConstructSignature = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
