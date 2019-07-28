package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrExprDef extends js.Object {
  var qExpression: String
  var qLibraryId: String
}

object NxAttrExprDef {
  @scala.inline
  def apply(qExpression: String, qLibraryId: String): NxAttrExprDef = {
    val __obj = js.Dynamic.literal(qExpression = qExpression, qLibraryId = qLibraryId)
  
    __obj.asInstanceOf[NxAttrExprDef]
  }
}

