package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedTupleMember
  extends StObject
     with TypeNode
     with JSDocContainer
     with Declaration
     with HasJSDoc {
  
  val dotDotDotToken: js.UndefOr[Token[typings.schematicsAngular.typescriptMod.SyntaxKind.DotDotDotToken]] = js.native
  
  @JSName("kind")
  val kind_NamedTupleMember: typings.schematicsAngular.typescriptMod.SyntaxKind.NamedTupleMember = js.native
  
  val name: Identifier = js.native
  
  val questionToken: js.UndefOr[Token[typings.schematicsAngular.typescriptMod.SyntaxKind.QuestionToken]] = js.native
  
  val `type`: TypeNode = js.native
}
