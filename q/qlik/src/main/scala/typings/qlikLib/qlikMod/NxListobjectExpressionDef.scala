package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxListobjectExpressionDef extends js.Object {
  var qExpr: java.lang.String
  var qLibraryId: java.lang.String
}

object NxListobjectExpressionDef {
  @scala.inline
  def apply(qExpr: java.lang.String, qLibraryId: java.lang.String): NxListobjectExpressionDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qExpr")(qExpr)
    __obj.updateDynamic("qLibraryId")(qLibraryId)
    __obj.asInstanceOf[NxListobjectExpressionDef]
  }
}

