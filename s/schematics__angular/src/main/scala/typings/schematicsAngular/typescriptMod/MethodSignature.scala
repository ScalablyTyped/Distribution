package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.schematicsAngular.typescriptMod.ReadonlyTextRange because Already inherited
- typings.schematicsAngular.typescriptMod.Node because Already inherited
- typings.schematicsAngular.typescriptMod.Declaration because Already inherited
- typings.schematicsAngular.typescriptMod.NamedDeclaration because Already inherited
- typings.schematicsAngular.typescriptMod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait MethodSignature
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  var _typeElementBrand: Any = js.native
  
  @JSName("kind")
  val kind_MethodSignature: typings.schematicsAngular.typescriptMod.SyntaxKind.MethodSignature = js.native
  
  @JSName("modifiers")
  val modifiers_MethodSignature: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_MethodSignature: PropertyName = js.native
  
  @JSName("parent")
  val parent_MethodSignature: ObjectTypeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
