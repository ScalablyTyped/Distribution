package typings.qlik.qlikMod

import typings.qlik.qlikStrings.NX_FREQUENCY_NONE
import typings.qlik.qlikStrings.NX_FREQUENCY_PERCENT
import typings.qlik.qlikStrings.NX_FREQUENCY_RELATIVE
import typings.qlik.qlikStrings.NX_FREQUENCY_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListobjectDef extends js.Object {
  var qAutoSortByState: NxAutoSortByStateDef
  var qDef: NxInlineDimensionDef
  var qExpressions: js.Array[NxListobjectExpressionDef]
  var qFrequencyMode: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE
  var qInitialDataFetch: js.Array[NxPage]
  var qLibraryId: String
  var qShowAlternatives: Boolean
  var qStateName: String
}

object ListobjectDef {
  @scala.inline
  def apply(
    qAutoSortByState: NxAutoSortByStateDef,
    qDef: NxInlineDimensionDef,
    qExpressions: js.Array[NxListobjectExpressionDef],
    qFrequencyMode: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE,
    qInitialDataFetch: js.Array[NxPage],
    qLibraryId: String,
    qShowAlternatives: Boolean,
    qStateName: String
  ): ListobjectDef = {
    val __obj = js.Dynamic.literal(qAutoSortByState = qAutoSortByState, qDef = qDef, qExpressions = qExpressions, qFrequencyMode = qFrequencyMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch, qLibraryId = qLibraryId, qShowAlternatives = qShowAlternatives, qStateName = qStateName)
  
    __obj.asInstanceOf[ListobjectDef]
  }
}

