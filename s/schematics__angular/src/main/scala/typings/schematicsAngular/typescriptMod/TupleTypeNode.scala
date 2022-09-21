package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TupleTypeNode
  extends StObject
     with TypeNode {
  
  val elements: NodeArray[TypeNode | NamedTupleMember] = js.native
  
  @JSName("kind")
  val kind_TupleTypeNode: typings.schematicsAngular.typescriptMod.SyntaxKind.TupleType = js.native
}
