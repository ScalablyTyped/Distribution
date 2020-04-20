package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttrExprDef...
  */
trait INxAttrExprDef extends js.Object {
  /**
    * Definition of the attribute expression.
    * Example: "Max(OrderID)"
    */
  var qExpression: String
  /**
    * Definition of the attribute expression stored in the library..
    * Example: "MyGenericMeasure"
    */
  var qLibraryId_ : String
}

object INxAttrExprDef {
  @scala.inline
  def apply(qExpression: String, qLibraryId_ : String): INxAttrExprDef = {
    val __obj = js.Dynamic.literal(qExpression = qExpression.asInstanceOf[js.Any], qLibraryId_ = qLibraryId_.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrExprDef]
  }
}

