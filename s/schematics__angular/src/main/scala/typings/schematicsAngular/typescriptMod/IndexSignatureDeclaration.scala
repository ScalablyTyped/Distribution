package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.SyntaxKind.IndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.schematicsAngular.typescriptMod.ReadonlyTextRange because Already inherited
- typings.schematicsAngular.typescriptMod.Node because Already inherited
- typings.schematicsAngular.typescriptMod.Declaration because Already inherited
- typings.schematicsAngular.typescriptMod.NamedDeclaration because Already inherited
- typings.schematicsAngular.typescriptMod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken
- typings.schematicsAngular.typescriptMod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait IndexSignatureDeclaration
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  var _classElementBrand: Any = js.native
  
  var _typeElementBrand: Any = js.native
  
  @JSName("kind")
  val kind_IndexSignatureDeclaration: IndexSignature = js.native
  
  @JSName("modifiers")
  val modifiers_IndexSignatureDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("parent")
  val parent_IndexSignatureDeclaration: ObjectTypeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
  
  @JSName("type")
  val type_IndexSignatureDeclaration: TypeNode = js.native
}
