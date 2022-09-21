package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDeclaration
  extends StObject
     with DeclarationStatement
     with HasJSDoc
     with HasModifiers {
  
  @JSName("kind")
  val kind_EnumDeclaration: typings.schematicsAngular.typescriptMod.SyntaxKind.EnumDeclaration = js.native
  
  val members: NodeArray[EnumMember] = js.native
  
  @JSName("modifiers")
  val modifiers_EnumDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_EnumDeclaration: Identifier = js.native
}
