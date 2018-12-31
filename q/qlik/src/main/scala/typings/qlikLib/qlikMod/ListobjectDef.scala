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

