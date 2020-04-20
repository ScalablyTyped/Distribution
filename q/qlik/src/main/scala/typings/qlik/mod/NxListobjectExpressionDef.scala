package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxListobjectExpressionDef extends js.Object {
  var qExpr: String
  var qLibraryId: String
}

object NxListobjectExpressionDef {
  @scala.inline
  def apply(qExpr: String, qLibraryId: String): NxListobjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxListobjectExpressionDef]
  }
}

