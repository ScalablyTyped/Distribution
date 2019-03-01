package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxInlineDimensionDef extends js.Object {
  var qActiveField: scala.Double
  var qFieldDefs: js.Array[java.lang.String]
  var qGrouping: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.H | qlikLib.qlikLibStrings.C
  var qNumberPresentations: js.Array[FieldAttributes]
  var qReverseSort: scala.Boolean
  var qSortCriteries: js.Array[SortCriteria]
}

object NxInlineDimensionDef {
  @scala.inline
  def apply(
    qActiveField: scala.Double,
    qFieldDefs: js.Array[java.lang.String],
    qGrouping: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.H | qlikLib.qlikLibStrings.C,
    qNumberPresentations: js.Array[FieldAttributes],
    qReverseSort: scala.Boolean,
    qSortCriteries: js.Array[SortCriteria]
  ): NxInlineDimensionDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qActiveField")(qActiveField)
    __obj.updateDynamic("qFieldDefs")(qFieldDefs)
    __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    __obj.updateDynamic("qNumberPresentations")(qNumberPresentations)
    __obj.updateDynamic("qReverseSort")(qReverseSort)
    __obj.updateDynamic("qSortCriteries")(qSortCriteries)
    __obj.asInstanceOf[NxInlineDimensionDef]
  }
}

