package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block
  extends StObject
     with Statement
     with BlockLike
     with HasJSDoc {
  
  @JSName("kind")
  val kind_Block: typings.schematicsAngular.typescriptMod.SyntaxKind.Block = js.native
  
  val statements: NodeArray[Statement] = js.native
}
