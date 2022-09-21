package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.shexj.mod.EachOf
  - typings.shexj.mod.OneOf
  - typings.shexj.mod.TripleConstraint
*/
trait tripleExpr extends StObject
object tripleExpr {
  
  inline def EachOf(expressions: js.Array[tripleExprOrRef]): typings.shexj.mod.EachOf = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EachOf")
    __obj.asInstanceOf[typings.shexj.mod.EachOf]
  }
  
  inline def OneOf(expressions: js.Array[tripleExprOrRef]): typings.shexj.mod.OneOf = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OneOf")
    __obj.asInstanceOf[typings.shexj.mod.OneOf]
  }
  
  inline def TripleConstraint(predicate: IRIREF): typings.shexj.mod.TripleConstraint = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TripleConstraint")
    __obj.asInstanceOf[typings.shexj.mod.TripleConstraint]
  }
}
