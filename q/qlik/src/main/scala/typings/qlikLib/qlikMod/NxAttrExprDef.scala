package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrExprDef extends js.Object {
  var qExpression: java.lang.String
  var qLibraryId: java.lang.String
}

object NxAttrExprDef {
  @scala.inline
  def apply(qExpression: java.lang.String, qLibraryId: java.lang.String): NxAttrExprDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qExpression")(qExpression)
    __obj.updateDynamic("qLibraryId")(qLibraryId)
    __obj.asInstanceOf[NxAttrExprDef]
  }
}

