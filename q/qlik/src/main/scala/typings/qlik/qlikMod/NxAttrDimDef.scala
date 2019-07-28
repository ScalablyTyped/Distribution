package typings.qlik.qlikMod

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
    val __obj = js.Dynamic.literal(qDef = qDef, qLibraryId = qLibraryId, qSortBy = qSortBy)
  
    __obj.asInstanceOf[NxAttrDimDef]
  }
}

