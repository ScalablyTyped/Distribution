package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForStatement
  extends StObject
     with IterationStatement
     with HasInitializer
     with HasJSDoc {
  
  val condition: js.UndefOr[Expression] = js.native
  
  val incrementor: js.UndefOr[Expression] = js.native
  
  val initializer: js.UndefOr[ForInitializer] = js.native
  
  @JSName("kind")
  val kind_ForStatement: typings.schematicsAngular.typescriptMod.SyntaxKind.ForStatement = js.native
}
