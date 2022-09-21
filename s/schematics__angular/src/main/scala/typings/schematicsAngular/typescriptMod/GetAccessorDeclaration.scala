package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.SyntaxKind.GetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.schematicsAngular.typescriptMod.ReadonlyTextRange because Already inherited
- typings.schematicsAngular.typescriptMod.Node because Already inherited
- typings.schematicsAngular.typescriptMod.Declaration because Already inherited
- typings.schematicsAngular.typescriptMod.NamedDeclaration because Already inherited
- typings.schematicsAngular.typescriptMod.ObjectLiteralElement because var conflicts: _declarationBrand. Inlined _objectLiteralBrand
- typings.schematicsAngular.typescriptMod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand
- typings.schematicsAngular.typescriptMod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait GetAccessorDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration
     with HasDecorators
     with HasModifiers {
  
  var _classElementBrand: Any = js.native
  
  var _objectLiteralBrand: Any = js.native
  
  var _typeElementBrand: Any = js.native
  
  @JSName("body")
  val body_GetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_GetAccessorDeclaration: GetAccessor = js.native
  
  @JSName("name")
  val name_GetAccessorDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_GetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression | TypeLiteralNode | InterfaceDeclaration = js.native
}
