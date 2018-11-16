package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NxMeasure extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  var qCalcCond: ValueExpr
  var qDef: NxInlineMeasureDef
  var qLibraryId: java.lang.String
  var qSortBy: SortCriteria
}

