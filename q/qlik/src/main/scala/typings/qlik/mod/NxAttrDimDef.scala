package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrDimDef extends js.Object {
  var qDef: String
  var qLibraryId: String
  var qSortBy: SortCriteria
}

object NxAttrDimDef {
  @scala.inline
  def apply(qDef: String, qLibraryId: String, qSortBy: SortCriteria): NxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrDimDef]
  }
}

