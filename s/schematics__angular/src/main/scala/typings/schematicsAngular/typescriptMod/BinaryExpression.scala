package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryExpression
  extends StObject
     with Expression
     with Declaration {
  
  @JSName("kind")
  val kind_BinaryExpression: typings.schematicsAngular.typescriptMod.SyntaxKind.BinaryExpression = js.native
  
  val left: Expression = js.native
  
  val operatorToken: BinaryOperatorToken = js.native
  
  val right: Expression = js.native
}
