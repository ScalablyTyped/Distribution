package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qExpr: java.lang.String
  /**
    * Refers to an expression stored in the library.
    */
  var qLibraryId: java.lang.String
}

object INxListObjectExpressionDef {
  @scala.inline
  def apply(qExpr: java.lang.String, qLibraryId: java.lang.String): INxListObjectExpressionDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qExpr")(qExpr)
    __obj.updateDynamic("qLibraryId")(qLibraryId)
    __obj.asInstanceOf[INxListObjectExpressionDef]
  }
}

