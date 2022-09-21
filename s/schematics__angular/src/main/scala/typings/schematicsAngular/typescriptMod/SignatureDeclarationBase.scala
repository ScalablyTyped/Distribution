package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.SyntaxKind.CallSignature
import typings.schematicsAngular.typescriptMod.SyntaxKind.ConstructSignature
import typings.schematicsAngular.typescriptMod.SyntaxKind.Constructor
import typings.schematicsAngular.typescriptMod.SyntaxKind.ConstructorType
import typings.schematicsAngular.typescriptMod.SyntaxKind.FunctionType
import typings.schematicsAngular.typescriptMod.SyntaxKind.GetAccessor
import typings.schematicsAngular.typescriptMod.SyntaxKind.IndexSignature
import typings.schematicsAngular.typescriptMod.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends StObject
     with NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  val kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typings.schematicsAngular.typescriptMod.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typings.schematicsAngular.typescriptMod.SyntaxKind.JSDocFunctionType | typings.schematicsAngular.typescriptMod.SyntaxKind.FunctionDeclaration | typings.schematicsAngular.typescriptMod.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typings.schematicsAngular.typescriptMod.SyntaxKind.FunctionExpression | typings.schematicsAngular.typescriptMod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  val name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  val parameters: NodeArray[ParameterDeclaration] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
