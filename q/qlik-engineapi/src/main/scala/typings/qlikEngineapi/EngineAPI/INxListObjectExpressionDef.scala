package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpressionDef]
  }
}

