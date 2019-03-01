package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qDef: java.lang.String
  /**
    * LibraryId for dimension.
    */
  var qLibraryId: java.lang.String
  /**
    * Sorting
    */
  var qSortBy: ISortCriteria
}

object INxAttrDimDef {
  @scala.inline
  def apply(qDef: java.lang.String, qLibraryId: java.lang.String, qSortBy: ISortCriteria): INxAttrDimDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDef")(qDef)
    __obj.updateDynamic("qLibraryId")(qLibraryId)
    __obj.updateDynamic("qSortBy")(qSortBy)
    __obj.asInstanceOf[INxAttrDimDef]
  }
}

