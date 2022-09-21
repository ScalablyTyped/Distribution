package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.SyntaxKind.ConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorTypeNode
  extends StObject
     with FunctionOrConstructorTypeNodeBase
     with FunctionOrConstructorTypeNode
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  @JSName("kind")
  val kind_ConstructorTypeNode: ConstructorType = js.native
  
  @JSName("modifiers")
  val modifiers_ConstructorTypeNode: js.UndefOr[NodeArray[Modifier]] = js.native
}
