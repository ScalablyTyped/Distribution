package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableStatement
  extends StObject
     with Statement
     with HasJSDoc
     with HasModifiers {
  
  val declarationList: VariableDeclarationList = js.native
  
  @JSName("kind")
  val kind_VariableStatement: typings.schematicsAngular.typescriptMod.SyntaxKind.VariableStatement = js.native
  
  @JSName("modifiers")
  val modifiers_VariableStatement: js.UndefOr[NodeArray[Modifier]] = js.native
}
