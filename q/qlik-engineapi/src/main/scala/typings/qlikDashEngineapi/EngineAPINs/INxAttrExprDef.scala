package typings.qlikDashEngineapi.EngineAPINs

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
    val __obj = js.Dynamic.literal(qExpression = qExpression, qLibraryId_ = qLibraryId_)
  
    __obj.asInstanceOf[INxAttrExprDef]
  }
}

