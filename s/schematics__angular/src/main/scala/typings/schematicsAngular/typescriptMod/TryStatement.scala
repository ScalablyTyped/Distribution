package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryStatement
  extends StObject
     with Statement
     with HasJSDoc {
  
  val catchClause: js.UndefOr[CatchClause] = js.native
  
  val finallyBlock: js.UndefOr[Block] = js.native
  
  @JSName("kind")
  val kind_TryStatement: typings.schematicsAngular.typescriptMod.SyntaxKind.TryStatement = js.native
  
  val tryBlock: Block = js.native
}
