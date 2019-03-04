package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListobjectDef extends js.Object {
  var qAutoSortByState: NxAutoSortByStateDef
  var qDef: NxInlineDimensionDef
  var qExpressions: js.Array[NxListobjectExpressionDef]
  var qFrequencyMode: qlikLib.qlikLibStrings.NX_FREQUENCY_NONE | qlikLib.qlikLibStrings.NX_FREQUENCY_VALUE | qlikLib.qlikLibStrings.NX_FREQUENCY_PERCENT | qlikLib.qlikLibStrings.NX_FREQUENCY_RELATIVE
  var qInitialDataFetch: js.Array[NxPage]
  var qLibraryId: java.lang.String
  var qShowAlternatives: scala.Boolean
  var qStateName: java.lang.String
}

object ListobjectDef {
  @scala.inline
  def apply(
    qAutoSortByState: NxAutoSortByStateDef,
    qDef: NxInlineDimensionDef,
    qExpressions: js.Array[NxListobjectExpressionDef],
    qFrequencyMode: qlikLib.qlikLibStrings.NX_FREQUENCY_NONE | qlikLib.qlikLibStrings.NX_FREQUENCY_VALUE | qlikLib.qlikLibStrings.NX_FREQUENCY_PERCENT | qlikLib.qlikLibStrings.NX_FREQUENCY_RELATIVE,
    qInitialDataFetch: js.Array[NxPage],
    qLibraryId: java.lang.String,
    qShowAlternatives: scala.Boolean,
    qStateName: java.lang.String
  ): ListobjectDef = {
    val __obj = js.Dynamic.literal(qAutoSortByState = qAutoSortByState, qDef = qDef, qExpressions = qExpressions, qFrequencyMode = qFrequencyMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch, qLibraryId = qLibraryId, qShowAlternatives = qShowAlternatives, qStateName = qStateName)
  
    __obj.asInstanceOf[ListobjectDef]
  }
}

