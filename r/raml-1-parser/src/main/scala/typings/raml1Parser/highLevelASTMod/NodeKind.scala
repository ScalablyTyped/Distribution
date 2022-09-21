package typings.raml1Parser.highLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeKind extends StObject
@JSImport("raml-1-parser/dist/parser/highLevelAST", "NodeKind")
@js.native
object NodeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeKind & Double] = js.native
  
  @js.native
  sealed trait ATTRIBUTE
    extends StObject
       with NodeKind
  /* 2 */ val ATTRIBUTE: typings.raml1Parser.highLevelASTMod.NodeKind.ATTRIBUTE & Double = js.native
  
  @js.native
  sealed trait BASIC
    extends StObject
       with NodeKind
  /* 0 */ val BASIC: typings.raml1Parser.highLevelASTMod.NodeKind.BASIC & Double = js.native
  
  @js.native
  sealed trait NODE
    extends StObject
       with NodeKind
  /* 1 */ val NODE: typings.raml1Parser.highLevelASTMod.NodeKind.NODE & Double = js.native
}
