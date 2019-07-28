package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxListObjectExpressionDef...
  */
trait INxListObjectExpressionDef extends js.Object {
  /**
    * Value of the expression
    */
  var qExpr: String
  /**
    * Refers to an expression stored in the library.
    */
  var qLibraryId: String
}

object INxListObjectExpressionDef {
  @scala.inline
  def apply(qExpr: String, qLibraryId: String): INxListObjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr, qLibraryId = qLibraryId)
  
    __obj.asInstanceOf[INxListObjectExpressionDef]
  }
}

