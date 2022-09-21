package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralTypeNode
  extends StObject
     with TypeNode {
  
  @JSName("kind")
  val kind_LiteralTypeNode: typings.schematicsAngular.typescriptMod.SyntaxKind.LiteralType = js.native
  
  val literal: NullLiteral | BooleanLiteral | LiteralExpression | PrefixUnaryExpression = js.native
}
