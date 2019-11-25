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
    val __obj = js.Dynamic.literal(qAutoSortByState = qAutoSortByState.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qFrequencyMode = qFrequencyMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qShowAlternatives = qShowAlternatives.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListobjectDef]
  }
}

