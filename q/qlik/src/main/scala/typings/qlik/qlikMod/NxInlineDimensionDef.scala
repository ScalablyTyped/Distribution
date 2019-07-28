package typings.qlik.qlikMod

import typings.qlik.qlikStrings.C
import typings.qlik.qlikStrings.H
import typings.qlik.qlikStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxInlineDimensionDef extends js.Object {
  var qActiveField: Double
  var qFieldDefs: js.Array[String]
  var qGrouping: N | H | C
  var qNumberPresentations: js.Array[FieldAttributes]
  var qReverseSort: Boolean
  var qSortCriteries: js.Array[SortCriteria]
}

object NxInlineDimensionDef {
  @scala.inline
  def apply(
    qActiveField: Double,
    qFieldDefs: js.Array[String],
    qGrouping: N | H | C,
    qNumberPresentations: js.Array[FieldAttributes],
    qReverseSort: Boolean,
    qSortCriteries: js.Array[SortCriteria]
  ): NxInlineDimensionDef = {
    val __obj = js.Dynamic.literal(qActiveField = qActiveField, qFieldDefs = qFieldDefs, qGrouping = qGrouping.asInstanceOf[js.Any], qNumberPresentations = qNumberPresentations, qReverseSort = qReverseSort, qSortCriteries = qSortCriteries)
  
    __obj.asInstanceOf[NxInlineDimensionDef]
  }
}

