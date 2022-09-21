package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixUnaryExpression
  extends StObject
     with UpdateExpression {
  
  @JSName("kind")
  val kind_PrefixUnaryExpression: typings.schematicsAngular.typescriptMod.SyntaxKind.PrefixUnaryExpression = js.native
  
  val operand: UnaryExpression = js.native
  
  val operator: PrefixUnaryOperator = js.native
}
