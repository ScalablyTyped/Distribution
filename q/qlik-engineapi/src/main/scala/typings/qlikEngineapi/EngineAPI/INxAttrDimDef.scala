package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttrDimDef...
  */
trait INxAttrDimDef extends js.Object {
  /**
    * Expression or field name.
    */
  var qDef: String
  /**
    * LibraryId for dimension.
    */
  var qLibraryId: String
  /**
    * Sorting
    */
  var qSortBy: ISortCriteria
}

object INxAttrDimDef {
  @scala.inline
  def apply(qDef: String, qLibraryId: String, qSortBy: ISortCriteria): INxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxAttrDimDef]
  }
}

