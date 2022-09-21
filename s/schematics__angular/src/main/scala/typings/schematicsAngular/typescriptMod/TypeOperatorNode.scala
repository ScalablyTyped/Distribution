package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.SyntaxKind.KeyOfKeyword
import typings.schematicsAngular.typescriptMod.SyntaxKind.TypeOperator
import typings.schematicsAngular.typescriptMod.SyntaxKind.UniqueKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOperatorNode
  extends StObject
     with TypeNode
     with HasType {
  
  @JSName("kind")
  val kind_TypeOperatorNode: TypeOperator = js.native
  
  val operator: KeyOfKeyword | UniqueKeyword | typings.schematicsAngular.typescriptMod.SyntaxKind.ReadonlyKeyword = js.native
  
  val `type`: TypeNode = js.native
}
